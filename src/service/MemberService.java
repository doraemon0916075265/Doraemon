package service;

import java.util.Arrays;

import model.MemberBean;
import modeldao.MemberDAO;
import modeljdbcdao.MemberDAOJDBC;

public class MemberService {
	private MemberDAO memberDAO = new MemberDAOJDBC();

	public MemberBean login(String username, String password) {
		MemberBean memberBean = memberDAO.select(username);

		if (memberBean != null) {
			if (password.trim().length() != 0 && password != null) {
				byte[] pass = memberBean.getPassword();
				byte[] temp = password.getBytes();
				if (Arrays.equals(pass, temp)) {
					return memberBean;
				}
			}
		}
		return null;
	}

}
