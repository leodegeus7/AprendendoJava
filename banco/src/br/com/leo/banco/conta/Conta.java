
/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Leonardo de Geus
 */

package br.com.leo.banco.conta;

public class Conta {
	private double saldo;
	protected int numero;
	protected String nome;
	
	@Override
	public int hashCode() {

		return numero;
	}



	public boolean equals(Object object) {
		  if (!(object instanceof Conta)) 
		    return false;
		  Conta outraConta = (Conta) object;
		  return this.hashCode() == outraConta.hashCode();
		}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Metodo que incrementa o saldo.
	 * @param valor
	 */
	
	public void deposita(double valor) {
		if (valor<0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void atualiza(double taxa) {
		saldo = saldo * taxa;
	}

}
