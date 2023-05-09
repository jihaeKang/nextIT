package jihae.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import jihae.submit14.dao.ReviewDAO;
import jihae.submit14.vo.ReviewVO;

public class ReviewService {
	
	private ReviewService() {
	}
	
	private static ReviewService instance = new ReviewService();
	
	public static ReviewService getInstance() {
		return instance;
	}
	
	ReviewDAO dao = ReviewDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	public ArrayList<ReviewVO> rvList(){
		Connection conn = cp.getConnection();
		ArrayList<ReviewVO> rst = new ArrayList<>();
		try {
			rst = dao.rvList(conn);
		} catch (SQLException e) {
			System.out.println("리뷰가 존재하지 않습니다.");
		}finally {
			cp.releaseConnection(conn);
		}
		return rst;
	}
	
	public void makeReview(String rvId, int rvCode, String rvName, int rvRate, String rvContent) {
		Connection conn = cp.getConnection();
		try {
			dao.makeReview(conn, rvId, rvCode, rvName, rvRate, rvContent);
			System.out.println("리뷰가 작성되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
	}
	
	public void deleteReview(int rvNo, String rvId, int rvCode, String rvName, int rvRate, String rvContent) {
		Connection conn = cp.getConnection();
		try {
			dao.deleteReview(conn, rvNo, rvId, rvCode, rvName, rvRate, rvContent);
			System.out.println("리뷰가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
	}

}
