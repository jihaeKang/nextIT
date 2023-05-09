package jihae.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jihae.submit14.vo.ReviewVO;

public class ReviewDAO {
	
	private ReviewDAO() {
	}
	
	private static ReviewDAO instance = new ReviewDAO();
	
	public static ReviewDAO getInstance() {
		return instance;
	}
	
	public ArrayList<ReviewVO> rvList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		rv_no				");
		query.append("	  , rv_id				");
		query.append("	  , rv_code				");
		query.append("	  , rv_name				");
		query.append("	  , rv_rate				");
		query.append("	  , rv_content			");
		query.append("FROM						");
		query.append("	  review				");
//		query.append("WHERE	1=1					");
//		query.append("	  rv_code = ?			");
		query.append("ORDER BY rv_no	 		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
//		ps.setInt(1, num);
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ReviewVO> rst = new ArrayList<>();
		
		while(rs.next()) {
			int no = rs.getInt("rv_no");
			String id = rs.getString("rv_id");
			int code = rs.getInt("rv_code");
			String name = rs.getString("rv_name");
			int rate = rs.getInt("rv_rate");
			String ct = rs.getString("rv_content");
			ReviewVO rv = new ReviewVO(no, id, code, name, rate, ct);
			
			rst.add(rv);
		}
		
		ps.close();
		rs.close();
		
		return rst;
		
	}
	
	// 리뷰작성
	
	public int makeReview(Connection conn, String rvId, int rvCode, String rvName, int rvRate, String rvContent) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO review (								");
		query.append("		  rv_no										");
		query.append("      , rv_id										");
		query.append("      , rv_code									");
		query.append("      , rv_name									");
		query.append("      , rv_rate									");
		query.append("      , rv_content								");
		query.append(") VALUES (										");
		query.append("      (SELECT COUNT(*)+1 FROM review)				");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append(")													");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, rvId);
		ps.setInt(idx++, rvCode);
		ps.setString(idx++, rvName);
		ps.setInt(idx++, rvRate);
		ps.setString(idx++, rvContent);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	public int deleteReview(Connection conn, int rvNo, String rvId, int rvCode, String rvName, int rvRate, String rvContent) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("DELETE 				 			");
		query.append("		review			 			");
		query.append("WHERE	1=1							");
		query.append("  AND rv_no = ?					");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ps.setInt(1, rvNo);

		int cnt = ps.executeUpdate();

		ps.close();
		
		return cnt;
	}
	

}
