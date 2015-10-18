package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String make = request.getParameter("make");
		String expire = request.getParameter("expire");
		String chooseButton = request.getParameter("chooseButton");
		System.out.println("id = " + id);
		System.out.println("chooseButton = " + chooseButton);

		if (chooseButton != null) {
			if (chooseButton.equals("查詢全部")) {
				System.out.println("haha");
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

}
