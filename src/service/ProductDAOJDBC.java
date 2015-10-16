package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.ProductBean;
import modeldao.ProductDAO;

public class ProductDAOJDBC {

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String CONNURL = "jdbc:sqlserver//localhost:1433;database=java";
	private static final String USER = "sa";
	private static final String PASSWORD = "sa123456";

	public List<ProductBean> selectALL() {
		ProductBean bean;
		List<ProductBean> beans = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//
		try {
			Class.forName(DRIVER);
			System.out.println("driver成功");
		} catch (ClassNotFoundException e) {
			System.out.println("driver失敗");
			e.printStackTrace();
		}
		
		return beans;
	}

	public ProductBean selectById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		return null;
	}

	public static void main(String[] args) {
		ProductDAOJDBC proddao = new ProductDAOJDBC();
		proddao.selectALL();
	}

}
