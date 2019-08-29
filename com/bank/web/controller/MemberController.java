package com.bank.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.domains.CustomerBean;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("맥락이 맞아서 여기에 도착함5..");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String credit = request.getParameter("credit");
		CustomerBean m = new CustomerBean();
		m.setCredit(credit);
		m.setId(id);
		m.setName(name);
		m.setPass(pass);
		m.setSsn(ssn);
		System.out.println("회원정보"+m.toString());
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
