package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		/*É necessário cololcar o nome da classe, pois o atributo é estático*/
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
