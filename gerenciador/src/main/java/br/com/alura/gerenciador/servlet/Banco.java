package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		/*� necess�rio cololcar o nome da classe, pois o atributo � est�tico*/
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
