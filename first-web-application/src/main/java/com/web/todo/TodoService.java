 package com.web.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos=new ArrayList<Todo>();
	 static{
		
		 todos.add(new Todo("TODO--1"));
		 todos.add(new Todo("TODO--2"));
		 todos.add(new Todo("TODO--3"));
		 todos.add(new Todo("TODO--4"));
	 }
	 
	 public List<Todo> retrieveTodos()
	 {
		 return todos;
	 }
	 
	 public void addTodo(Todo todo)
	 {
		 todos.add(todo);
	 }
}
