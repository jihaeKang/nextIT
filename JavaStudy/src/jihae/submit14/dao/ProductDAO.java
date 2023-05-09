package jihae.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jihae.submit14.vo.ProductVO;

public class ProductDAO {
	private ProductDAO() {
	}

	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public ArrayList<ProductVO> proList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		pro_code			");
		query.append("	  , pro_name			");
		query.append("	  , pro_content			");
		query.append("	  , pro_price			");
		query.append("FROM						");
		query.append("	  product				");
		query.append("ORDER BY pro_code 		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ProductVO> rst = new ArrayList<>();
		
		while(rs.next()) {
			int code = rs.getInt("pro_code");
			String name = rs.getString("pro_name");
			String content = rs.getString("pro_content");
			int price = rs.getInt("pro_price");
			
			ProductVO pd = new ProductVO(code, name, content, price);
			
			rst.add(pd);
		}
		
		ps.close();
		rs.close();
		
		return rst;
		
		
	}
	
	

}
