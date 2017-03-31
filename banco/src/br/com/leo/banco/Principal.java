package br.com.leo.banco;

import br.com.leo.banco.conta.Conta;
import br.com.leo.banco.conta.ContaCorrente;
import br.com.leo.banco.conta.Banco;
import br.com.leo.banco.conta.ValorInvalidoException;

import br.com.leo.banco.conta.Conta;
public class Principal {
	public static void main(String[] args) {
//		Conta conta1 = new Conta();
//		try {
//			conta1.deposita(-20);
//		} catch (ValorInvalidoException e) {
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		conta1.atualiza(10);
		
		Conta c1 = new ContaCorrente();
		c1.deposita(1000);
		c1.setNome("Jurandir");
		c1.setNumero(2);
		Conta c2 = new ContaCorrente();
		c2.deposita(2000);
		c2.setNome("Rose");
		c2.setNumero(2);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		if (c1.equals(c2)) {
			System.out.println("Mesmo numero de conta");
		}
		
		Banco b1 = new Banco();
		b1.adicionar(c1);
		b1.adicionar(c2);
		System.out.println(b1.pegaQuantidadeContas());
		
		System.out.println(b1.pega(0).getSaldo());
		
		System.out.println(b1.buscaPorNome("Jurandir").getNome());
	}
	
}
