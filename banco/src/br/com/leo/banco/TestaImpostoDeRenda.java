package br.com.leo.banco;

import br.com.leo.banco.conta.ContaCorrente;
import br.com.leo.banco.sistema.GerenciadorDeImpostoDeRenda;
import br.com.leo.banco.sistema.SeguroDeVida;

public class TestaImpostoDeRenda {
	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);

		System.out.println(gerenciador.getTotal());
	}

}
