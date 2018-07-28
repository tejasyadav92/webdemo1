package com.web.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns="/todo.do")

public class TodoServlet extends HttpServlet{
	
	TodoService todoService=new TodoService();
	
	  protected void doGet(javax.servlet.http.HttpServletRequest request, 
			  javax.servlet.http.HttpServletResponse response) 
			  throws ServletException, IOException{

		  request.setAttribute("todos", todoService.retrieveTodos());
		  request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	  }	  
		  
		  protected void doPost(javax.servlet.http.HttpServletRequest request, 
				  javax.servlet.http.HttpServletResponse response) 
				  throws ServletException, IOException{
			  
			  String newTodo= request.getParameter("newtodo");
			  todoService.addTodo(new Todo(newTodo));
			  			  
			  request.setAttribute("todos", todoService.retrieveTodos());
			  request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
				  
	}

}