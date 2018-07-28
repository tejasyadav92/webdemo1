package com.web.logout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/logout.do")

public class LoginServlet extends HttpServlet {


	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {

		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {

	}

}