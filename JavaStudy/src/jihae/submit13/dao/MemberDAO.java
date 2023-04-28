package jihae.submit13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jihae.submit13.vo.MemberVO;

public class MemberDAO {
	
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	// 회원가입 메소드
	public int joinMember(Connection conn, String id, String pw) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO member	 (	");
		query.append("     mem_id				");
		query.append("   , mem_pw				");
		query.append("	) VALUES (				");
		query.append("     ?					");
		query.append("   , ?					");
		query.append("	)						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		
		int cnt = ps.executeUpdate();

		
		ps.close();
		
		return cnt;
	}
	
	// 로그인 메소드
	public MemberVO login(Connection conn, MemberVO member) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("	  mem_id				");
		query.append("	, mem_pw				");
		query.append("FROM					");
		query.append("	member				");
		query.append("WHERE 1=1				");
		query.append("  AND mem_id = ?		");
		query.append("  AND mem_pw = ?		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPw());
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO rst = new MemberVO();
		
		while(rs.next()) {
			rst.setMemId(rs.getString("mem_id"));
			rst.setMemPw(rs.getString("mem_pw"));
		}
		
		ps.close();
		rs.close();
		
		return rst;
		
	}
	
	
	
	

}
