package br.com.fiap.traveller.parque.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Parque> listaParques = new ArrayList<Parque>();
	private static Integer chaveSequencial = 1;
	
	static {
		Parque parque1 = new Parque();
		parque1.setNome("Parque do Ibirapuera");
		parque1.setId(chaveSequencial++);
		parque1.setDescricao("O Parque Ibirapuera é um parque urbano localizado na cidade de São Paulo, Brasil.");
		parque1.setLocalizacao("Av. Pedro Álvares Cabral - Vila Mariana, São Paulo");
		parque1.setHorarioFuncionamento("Das 5 as 00h");
		parque1.setUrlSiteOficial("https://parqueibirapuera.org");
		parque1.setAvaliacao(3);
		
		Parque parque2 = new Parque();
		parque2.setNome("Jd Botanico de SP");
		parque2.setId(chaveSequencial++);
		parque2.setDescricao("O Jardim Botânico na região da Água Funda, na cidade de São Paulo. ");
		parque2.setLocalizacao("Avenida Miguel Estéfano, 3687 - Água Funda, São Paulo");
		parque2.setHorarioFuncionamento("Das 9 as 17h");
		parque2.setUrlSiteOficial("https://jardimbotanico.sp.gov.br");
		parque2.setAvaliacao(5);
		
		Parque parque3 = new Parque();
		parque3.setNome("Parque Alfredo Volpi");
		parque3.setId(chaveSequencial++);
		parque3.setDescricao("Parque localizado no bairro de Cidade Jardim, distrito do Morumbi.");
		parque3.setLocalizacao("Rua Engenheiro Oscar Americano, 480 - Morumbi, São Paulo - SP");
		parque3.setHorarioFuncionamento("Das 9 as 17h");
		parque3.setUrlSiteOficial("https://jardimbotanico.sp.gov.br");
		parque3.setAvaliacao(5);
		
		Parque parque4 = new Parque();
		parque4.setNome("Parque Buenos Aires");
		parque4.setId(chaveSequencial++);
		parque4.setDescricao("O Jardim Botânico na região da Água Funda, na cidade de São Paulo. ");
		parque4.setLocalizacao("Avenida Miguel Estéfano, 3687 - Água Funda, São Paulo");
		parque4.setHorarioFuncionamento("Das 9 as 17h");
		parque4.setUrlSiteOficial("https://jardimbotanico.sp.gov.br");
		parque4.setAvaliacao(5);
		
		Parque parque5 = new Parque();
		parque5.setNome("Parque da Independencia");
		parque5.setId(chaveSequencial++);
		parque5.setDescricao("O Jardim Botânico na região da Água Funda, na cidade de São Paulo. ");
		parque5.setLocalizacao("Avenida Miguel Estéfano, 3687 - Água Funda, São Paulo");
		parque5.setHorarioFuncionamento("Das 9 as 17h");
		parque5.setUrlSiteOficial("https://jardimbotanico.sp.gov.br");
		parque5.setAvaliacao(5);
		
		listaParques.add(parque1);
		listaParques.add(parque2);
		listaParques.add(parque3);
		listaParques.add(parque4);
		listaParques.add(parque5);
		
	}

	public List<Parque> getParques() {
		
		return listaParques;
	}

	public void adiciona(Parque parque) {
		
		listaParques.add(parque);
		
	}

	public void removeParque(Integer id) {
		
		Iterator<Parque> it = listaParques.iterator();
		
		while (it.hasNext()) {
			Parque parque = (Parque) it.next();
			if(parque.getId()==id) {
				it.remove();
			}
			
			
		}
		
	}

	public Parque buscaPorId(Integer id) {
		
		for (Parque parque : listaParques) {
			if(parque.getId()==id) {
				return parque;
			}
		}
		return null;
		
	}

}

