package br.com.leo.banco.conta;

public class ValorInvalidoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ValorInvalidoException(Double valor) {
		super("Valor invalido de " + valor);
	}
	
}
