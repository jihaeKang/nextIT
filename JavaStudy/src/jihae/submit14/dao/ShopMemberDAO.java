package jihae.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jihae.submit14.vo.ProductVO;
import jihae.submit14.vo.ShopMemberVO;

public class ShopMemberDAO {
	
	private ShopMemberDAO() {
		
	}
	
	private static ShopMemberDAO instance = new ShopMemberDAO();
	
	public static ShopMemberDAO getInstance() {
		return instance;
	}
	
	// 회원가입

	public int join(Connection conn, String id, String pw) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO shop_member	(");
		query.append("     mem_id				");
		query.append("   , mem_pw				");
		query.append("   , mem_point			");
		query.append("	) VALUES (				");
		query.append("     ?					");
		query.append("   , ?					");
		query.append("   , ?					");
		query.append("	)						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		ps.setInt(idx++, 0);
		
		int cnt = ps.executeUpdate();

		
		ps.close();
		
		return cnt;
	}
	
	// 로그인
	public ShopMemberVO login(Connection conn, ShopMemberVO member) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("	  mem_id			");
		query.append("	, mem_pw			");
		query.append("	, mem_point			");
		query.append("FROM					");
		query.append("	shop_member			");
		query.append("WHERE 1=1				");
		query.append("  AND mem_id = ?		");
		query.append("  AND mem_pw = ?		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPw());
		
		ResultSet rs = ps.executeQuery();
		
		ShopMemberVO rst = new ShopMemberVO();
		
		while(rs.next()) {
			rst.setMemId(rs.getString("mem_id"));
			rst.setMemPw(rs.getString("mem_pw"));
			rst.setMemPoint(rs.getInt("mem_point"));
		}
		
		ps.close();
		rs.close();
		
		return rst;
		
	}
	
	public ArrayList<ShopMemberVO> myPage(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("		mem_id			");
		query.append("	  , mem_pw			");
		query.append("	  , mem_point		");
		query.append("FROM					");
		query.append("	  shop_member		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ShopMemberVO> rst = new ArrayList<>();
		
		while(rs.next()) {
			String id = rs.getString("mem_id");
			String pw = rs.getString("mem_pw");
			int point = rs.getInt("mem_point");
			
			ShopMemberVO sp = new ShopMemberVO(id, pw, point);
			
			rst.add(sp);
		}
		
		ps.close();
		rs.close();
		
		return rst;
		
	}
	
	// 구매적립
	public int addPoint(Connection conn, int point, String id) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("UPDATE 				 			");
		query.append("		shop_member		 			");
		query.append("SET 								");
		query.append("      mem_point = mem_point + ?	");
		query.append("WHERE	1=1							");
		query.append("  AND mem_id = ?					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ps.setInt(1, point);
		ps.setString(2, id);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	public int usePoint(Connection conn, int point, String id) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("UPDATE 				 			");
		query.append("		shop_member		 			");
		query.append("SET 								");
		query.append("      mem_point = ?				");
		query.append("WHERE	1=1							");
		query.append("  AND mem_id = ?					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ps.setInt(1, point);
		ps.setString(2, id);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	
}
