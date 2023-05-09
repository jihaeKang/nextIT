package jihae.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import jihae.submit14.dao.ShopMemberDAO;
import jihae.submit14.vo.ProductVO;
import jihae.submit14.vo.ShopMemberVO;

public class ShopMemberService {
	
	private ShopMemberService() {
		
	}
	
	private static ShopMemberService instance = new ShopMemberService();
	
	public static ShopMemberService getInstance() {
		return instance;
	}
	
	ShopMemberDAO dao = ShopMemberDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	// 회원가입 
	public void join(String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			dao.join(conn, id, pw);
			System.out.println("회원가입에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("중복된 아이디 입니다. 다른 아이디를 입력해주세요.");
		} finally {
			cp.releaseConnection(conn);
		}
		
			
	}
	
	// 로그인
	public ShopMemberVO login(ShopMemberVO member) {
		Connection conn = cp.getConnection();
		
		ShopMemberVO rst = new ShopMemberVO();
		
		try {
			rst = dao.login(conn, member);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		return rst;
		
	}
	
	public ArrayList<ShopMemberVO> myPage(){
		Connection conn = cp.getConnection();
		
		ArrayList<ShopMemberVO> rst = new ArrayList<>();
		try {
			rst = dao.myPage(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return rst;
	}
	
	public void addPoint(int point, String id) {
		Connection conn = cp.getConnection();
		try {
			dao.addPoint(conn, point, id);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("에러났당");
		}finally {
			cp.releaseConnection(conn);
		}
		
	}
	
	public void usePoint(int point, String id) {
		Connection conn = cp.getConnection();
		try {
			dao.usePoint(conn, point, id);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("에러났당");
		}finally {
			cp.releaseConnection(conn);
		}
		
	}
	
	

}
