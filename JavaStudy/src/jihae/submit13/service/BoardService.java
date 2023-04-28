package jihae.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.vo.StudentVO;
import jihae.submit13.dao.BoardDAO;
import jihae.submit13.vo.BoardVO;

public class BoardService {
	
	private BoardService() {
		
	}
	
	private static BoardService instance = new BoardService();
	
	public static BoardService getInstance() {
		return instance;
	}
	
	BoardDAO dao = BoardDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	// 글쓰기 메소드
	public void makeBoard(String title, String content, String name) {
		Connection conn = cp.getConnection();
		
		try {
			dao.makeBoard(conn, title, content, name);
			System.out.println("글이 작성되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
	}
	
	// 글조회
	public ArrayList<BoardVO> getBdList(){
		Connection conn = cp.getConnection();
		ArrayList<BoardVO> result = new ArrayList<>();
		
		try {
			result = dao.getBdList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}

}
