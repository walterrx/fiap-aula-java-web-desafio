package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostraDetalheParque")
public class MostraDetalheParqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Parque parque = banco.buscaPorId(id);
		
		request.setAttribute("parque", parque);
		
		RequestDispatcher rd = request.getRequestDispatcher("/alteraParque.jsp");
		rd.forward(request, response);
		
	}

}
