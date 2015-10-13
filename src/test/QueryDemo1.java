package test;

import java.sql.*;

// Query all employees using Statement
// �ĥ�Class Loader�覡����Driver����A�õ��U��Driver Manager���X�ʵ{�����U��椤
public class QueryDemo1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			Connection conn = DriverManager.getConnection(connUrl, "sa", "sa123456");
			// String connUrl =
			// "jdbc:sqlserver://localhost:1433;databaseName=jdbc;user=sa;password=passw0rd;";
			// Connection conn = DriverManager.getConnection(connUrl);

			String qryStmt = "SELECT ename, salary FROM employee";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(qryStmt);

			while (rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));

				// System.out.print("name = " + rs.getString(1) + ", ");
				// System.out.println("salary = " + rs.getDouble(2));
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of main()
}// end of class QueryDemo1
