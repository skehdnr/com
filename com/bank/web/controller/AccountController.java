package com.bank.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bank.web.service.Accountservice;
import com.bank.web.serviceimpl.AccountServiceImpl;
import com.bank.web.domains.AccountBean;

@WebServlet("/acconut.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("확이ㅣㅣㅣㅣㅣㅣㄴ");
		Accountservice service = new AccountServiceImpl();
		String money = request.getParameter("money");
		
		AccountBean a = new AccountBean();
//		service.createAccount(money);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF//views/account/account.jsp");
		rd.forward(request, response);
		System.out.println("계좌정보"+a.toString());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
