package modeldao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.MemberBean;
import service.MemberService;

public class MemberDAO implements MemberService {
	private DataSource datasource;

	private static final String SELECT_BY_USERNAME = "select * from customer where custid=?";

	public MemberDAO() {
		try {
			Context context = new InitialContext();
			this.datasource = (DataSource) context.lookup("java:comp/env/jdbc/xxx");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberBean selectAll(String custid) {
		return null;
	}

}
