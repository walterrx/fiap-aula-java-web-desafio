package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class OiServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Objeto especializado para devolver caracteres
		PrintWriter out = response.getWriter();
		
		// Vai imprimir no fluxo de resposta do navegador e não na console
		out.println("<html>");
		out.println("<body>");
		out.println("hello world");
		out.println("<body>");
		out.println("</html>");
		
		// Impressão na console do Eclipse
		System.out.println("O meu servlet foi chamado !");
		
	}

}
