package modeljdbcdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.ProductBean;

public class ProductDAOJDBC {

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String CONNURL = "jdbc:sqlserver://localhost:1433;database=java";
	private static final String USER = "sa";
	private static final String PASSWORD = "sa123456";

	private static final String GETALL = "select * from Product";

	public List<ProductBean> selectALL() {
		ProductBean bean;
		List<ProductBean> beans = new ArrayList<ProductBean>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		try {
			// 找驅動程式
			Class.forName(DRIVER);
			// System.out.println("driver成功");
		} catch (ClassNotFoundException e) {
			// System.out.println("driver失敗");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(CONNURL, USER, PASSWORD);
			pstmt = conn.prepareStatement(GETALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bean = new ProductBean();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				Date make = rs.getDate("make");
				String xx = sdf.format(make);
				int exprice = rs.getInt("expire");
//				System.out.println(id + "\t" + name + "\t" + price + "\t" + xx + "\t" + exprice);

				bean.setId(id);
				bean.setName(name);
				bean.setPrice(price);
				bean.setMake(make);
				bean.setExprice(exprice);
				beans.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return beans;
	}

	// public ProductBean selectById(String id) {
	// Connection conn = null;
	// PreparedStatement pstmt = null;
	// ResultSet rs = null;
	// return null;
	// }

	public static void main(String[] args) {
		ProductDAOJDBC proddao = new ProductDAOJDBC();
		List<ProductBean> prodbean = new ArrayList<ProductBean>();
		prodbean = proddao.selectALL();
		
		for (ProductBean productBean : prodbean) {
			System.out.println(productBean);
		}
	}

}
