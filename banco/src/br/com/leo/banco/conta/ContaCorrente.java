package br.com.leo.banco.conta;

import br.com.leo.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel,Comparable<ContaCorrente> {
	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		super.atualiza(taxa);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(ContaCorrente o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		else if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		else {
			return 0; 
		}
	}
}
