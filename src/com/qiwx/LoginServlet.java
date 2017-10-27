package com.qiwx;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userNameString = request.getParameter("username");
		String pwdString = request.getParameter("password");
		if (userNameString != null && userNameString.equals("qiwx")) {
			response.setContentType("application/json; charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName("小明");
			userInfo.setPassWord("123456");
			String userJson = new Gson().toJson(userInfo);
			OutputStream out = response.getOutputStream();
			out.write(userJson.getBytes("UTF-8"));
			out.flush();

			// request.getRequestDispatcher("/Success.jsp").forward(request,
			// response);;
		} else {
			request.getRequestDispatcher("/Fail.jsp")
					.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
