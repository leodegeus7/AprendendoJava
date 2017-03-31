package br.com.leo.conversorMedidas;

import br.com.leo.conversorMedidas.conversor.*;

public class Principal {
	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		Double valor = conversor.converter(10, "r-d");
		System.out.println(Conversor.valorFormatado(valor));
		


		
	}
}
