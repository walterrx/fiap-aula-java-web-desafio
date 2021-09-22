package br.com.fiap.traveller.parque.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alteraParque")
public class AlteraParqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando empresa ");
		String nomeParque = request.getParameter("nome");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		// Criar o banco - nossa faxada para acessar a camada de persistência
		Banco banco = new Banco();
		// Aproveitando um método q ja existe e me traz as informações que estão no banco e atualizo
		Parque parque = banco.buscaPorId(id);
		parque.setNome(nomeParque);
		
		// Redirecionar para a página de Consulta chamada listaParques
		response.sendRedirect("listaParques");
		
	}

}
