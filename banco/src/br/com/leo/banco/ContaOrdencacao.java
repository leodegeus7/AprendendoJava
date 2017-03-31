package br.com.leo.banco;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.leo.banco.conta.*;

public class ContaOrdencacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ContaCorrente> contas = new ArrayList<>(); 
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setNumero(1980);
		contas.add(c1);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setNumero(1000);
		contas.add(c2);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.setNumero(2000);
		contas.add(c3);
		
		for (ContaCorrente list:contas) {
			System.out.println(list.getNumero());
		}
		
		Collections.sort(contas);
		Collections.reverse(contas);
		for (ContaCorrente list:contas) {
			System.out.println(list.getNumero());
		}
		
		Set<String> cargos = new HashSet<>();

		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); // repetido!

		// imprime na tela todos os elementos
		System.out.println(cargos);
		
		Set<String> conjunto = new HashSet<>();

		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");

		for (String palavra : conjunto) {
		  System.out.println(palavra);
		}
		
		

		
	}

}
