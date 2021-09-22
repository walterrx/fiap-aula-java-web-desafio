package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaParques")
public class ListaParquesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Simular um banco de dados
		Banco banco = new Banco();
		
		// Me carrega todos parques q vc tem ai no banco, pls ?
		List<Parque> listaParques = banco.getParques();
		
		// Envia um parametro na requisicao para ser passado ao JSP
		request.setAttribute("parques", listaParques);
		
		// Chamando a pagina q ira receber a requisicao (passando o end. para o motoqueiro levar o rango)
		RequestDispatcher rd = request.getRequestDispatcher("/listaParques.jsp");
		// Pegar a requisicao e ir (motoqueiro, gentielza levar a comida
		rd.forward(request, response);
		

	
	}

}
