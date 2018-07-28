package com.web.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

	UserValidationService service = new UserValidationService();

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isValid = service.isValid(name, password);

		if (isValid) {
			/*
			 * ------to redirect to JSP page--------
			 * request.setAttribute("name", name);
			 * request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").
			 * forward(request, response);
			 */
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/todo.do");
			// ------to redirect to another servlet------
		} else {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}