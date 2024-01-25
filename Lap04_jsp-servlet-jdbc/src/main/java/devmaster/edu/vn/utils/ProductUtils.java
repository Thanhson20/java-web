package devmaster.edu.vn.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import devmaster.edu.vn.beans.Product;

public class ProductUtils{
	//Đọc danh sách sản phẩm
			public static List<Product> queryProduct(Connection conn)
					throws SQLException {
	String sql = "Select a.Code, a.Name, a.Price from Product a";
	  PreparedStatement pstm = conn.prepareStatement(sql);
	  ResultSet rs = pstm.executeQuery();
	  List<Product> list = new ArrayList<Product>();
	  while (rs.next()) {
		  String code = rs.getString("Code");
		  String name = rs.getString("Name");
		  float price = rs.getFloat("Price");
		  Product product = new Product();
		  product.setCode(code);
		  product.setName(name);
		  product.setPrice(price);
		  list.add(product);
	  }
	  return list;
	}
	//Tìm kiếm theo mã sản phẩm (code)
	  public static Product findProduct(Connection conn, String code) 
	  throw SQLException {
		  String sql = "Select a.Code, a.Name, a.Price from Product a where a.Code=?";
		  PreparedStatement pstm = conn.prepareStatement(sql);
		  pstm.setString(1, code);
		  ResultSet rs = pstm.executeQuery();
		  while (rs.next()) {
			  String name = rs.getString("Name");
			  float price = rs.getFloat("Price");
			  Product product =
			  
		  
		  }
	  }
}

