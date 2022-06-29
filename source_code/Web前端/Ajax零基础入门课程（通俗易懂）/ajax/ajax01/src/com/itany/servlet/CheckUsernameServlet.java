package com.itany.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUsernameServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("请求方式："+req.getMethod());
		
		//req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		//username=new String(username.getBytes("iso-8859-1"),"utf-8");
		System.out.println("用户名："+username);
		
		res.setContentType("text/plain;charset=utf8");
		PrintWriter out = res.getWriter();
		if("tom".equals(username)||"张三".equals(username)){
			out.print("false");
		}else{
			out.print("true");
		}
		out.flush();
		out.close();
	}
}
