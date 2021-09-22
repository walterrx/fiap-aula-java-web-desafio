package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoParque")
public class NovoParqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeParque = request.getParameter("nome");
	
		Parque parque = new Parque();
		parque.setNome(nomeParque);
		
		Banco banco = new Banco();
		banco.adiciona(parque);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("O " + nomeParque + " foi cadastrado com sucesso !");
		out.println("</body>");
		out.println("</html>");
		
	}

}
