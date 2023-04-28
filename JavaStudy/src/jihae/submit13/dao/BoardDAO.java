package jihae.submit13.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;
import jihae.submit13.vo.BoardVO;
import jihae.submit13.vo.MemberVO;

public class BoardDAO {
	
	private BoardDAO() {
		
	}
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	// 글쓰기 메소드
	public int makeBoard(Connection conn, String title, String content, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO board (								");
		query.append("		  board_no									");
		query.append("      , board_title								");
		query.append("      , board_content								");
		query.append("      , board_name								");
		query.append("      , board_date								");
		query.append(") VALUES (										");
		query.append("      (SELECT COUNT(*)+1 FROM board)				");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append("      , ?											");
		query.append("      , to_char(SYSDATE, 'yyyy.MM.DD HH24:MI')	");
		query.append(")													");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, title);
		ps.setString(idx++, content);
		ps.setString(idx++, name);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	// 게시판 조회
	public ArrayList<BoardVO> getBdList(Connection conn) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		board_no			");
		query.append("	  , board_title			");
		query.append("	  , board_content			");
		query.append("	  , board_name			");
		query.append("	  , board_date			");
		query.append("FROM						");
		query.append("	  board					");
		query.append("ORDER BY board_no 		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<BoardVO> result = new ArrayList<>();
		
		while(rs.next()) {
			int boardNo = rs.getInt("board_no");
			String boardtitle = rs.getString("board_title");
			String boardcontent = rs.getString("board_content");
			String boardname = rs.getString("board_name");
			String boardDate = rs.getString("board_date");
			BoardVO bd = new BoardVO(boardNo, boardtitle, boardcontent, boardname, boardDate);
			
			result.add(bd);
			
			// 위나 아래 방식 중 택하기
//			StudentVO temp = new StudentVO();
//			temp.setStuId(rs.getString("stu_id"));
//			temp.setStuPassword(rs.getString("pw"));
//			temp.setStuName(rs.getString("stu_name"));
//			temp.setStuScore(rs.getInt("stu_score"));
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	


}
