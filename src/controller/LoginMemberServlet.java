package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginMemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/** 接收資料 **/
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("帳號：" + username + "密碼：" + password);

		/** 驗證資料 **/
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("error", errors);

		if (username == null || username.trim().length() == 0) {
			System.out.println("你沒輸入東西！");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
