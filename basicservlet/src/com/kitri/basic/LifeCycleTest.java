package com.kitri.basic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Life")
public class LifeCycleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifeCycleTest() {
		System.out.println("LifeCyleTest 생성자 호출!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출!!");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출!!");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서비스 호출!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}