package jihae.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;

import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.vo.StudentVO;
import jihae.submit13.dao.MemberDAO;
import jihae.submit13.vo.MemberVO;

public class MemberService {
	
	private MemberService() {
		
	}
	
	private static MemberService instance = new MemberService();
	
	public static MemberService getInstance() {
		return instance;
	}
	
	MemberDAO dao = MemberDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	// 회원가입 
	public void joinMember(String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			dao.joinMember(conn, id, pw);
			System.out.println("회원가입에 성공하셨습니다.");
		} catch (SQLException e) {
			System.out.println("중복된 아이디 입니다.");
		} finally {
			cp.releaseConnection(conn);
		}
			
	}
	
	// 로그인
	public MemberVO login(MemberVO member) {
		Connection conn = cp.getConnection();
		
		MemberVO rst = new MemberVO();
		
		try {
			rst = dao.login(conn, member);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		return rst;
	}
	
	
	

}
