package br.edu.fjn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");

		resp.setContentType("text/html");
//		PrintWriter saida = resp.getWriter();

		if (userName.equalsIgnoreCase("maria") && password.equals("1234")) {	
			resp.sendRedirect("cadaluno.html");
		} else {
		    resp.sendRedirect("erro.html");
		}
	}

}
