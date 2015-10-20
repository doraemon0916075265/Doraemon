package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberBean;
import service.MemberService;

public class LoginMemberServlet extends HttpServlet {
	/** 初始化 **/
	private MemberService service;

	@Override
	public void init() throws ServletException {
		service = new MemberService();
	}

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
			errors.put("username", "請輸入帳號");
		}
		if (password == null || password.trim().length() == 0) {
			errors.put("password", "請輸入密碼");
		}
		if (errors != null && !errors.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/login/loginMember.jsp");
			rd.forward(request, response);
			return;
		}

		/** 呼叫 model **/
		MemberBean bean = service.login(username, password);

		/** 根據執行結果，導向view **/
		if (bean == null) {
			errors.put("fail", "登入失敗");
			RequestDispatcher rd = request.getRequestDispatcher("/login/loginMember.jsp");
			rd.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("user", bean);
			
			String path = request.getContextPath();
			response.sendRedirect(path + "/login/LoginIndex.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
