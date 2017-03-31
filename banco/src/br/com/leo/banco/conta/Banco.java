package br.com.leo.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	protected List<Conta> contas = new ArrayList<Conta>();
	Map<String, Conta> mapaDeContas = new HashMap<>();

	public void adicionar(Conta c) {
		contas.add(c);
		mapaDeContas.put(c.nome, c);
	}
	
	public Conta pega(int x) {
		return contas.get(x);
	}
	
	public int pegaQuantidadeContas() {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		//USANDO MAPAS
		return mapaDeContas.get(nome);
		//USANDO FORECH
		
//		for (Conta conta : contas) {
//			if (conta.equals(nome)) {
//				return conta;
//			}
//		}
//		return null;
	
	}
	
	
}
