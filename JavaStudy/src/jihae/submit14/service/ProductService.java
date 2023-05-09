package jihae.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import jihae.submit14.dao.ProductDAO;
import jihae.submit14.vo.ProductVO;

public class ProductService {
	
	private ProductService() {
		
	}
	
	private static ProductService instance = new ProductService();
	
	public static ProductService getInstance() {
		return instance;
	}
	
	ProductDAO dao = ProductDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	// 상품조회
	public ArrayList<ProductVO> proList(){
		Connection conn = cp.getConnection();
		
		ArrayList<ProductVO> rst = new ArrayList<>();
		try {
			rst = dao.proList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return rst;
	}


}
