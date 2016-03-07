package br.edu.fjn.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.fjn.model.Aluno;

/**
 * Servlet implementation class AlunoServlet
 */

public class AlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperando http params
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String mat = request.getParameter("matricula");
		
		Aluno aluno = new Aluno(nome, cpf, mat);
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setMatricula(mat);
		
	    request.setAttribute("aluno", aluno);
	    request.getRequestDispatcher("sucesso.jsp")
	           .forward(request,response);
	}

}
