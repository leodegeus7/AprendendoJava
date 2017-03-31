package br.com.leo.conversorMedidas.conversor;

public class Conversor {

	public double converter(double valorRecebido, String tipo) throws IllegalArgumentException {
		if (valorRecebido >= 0) {
			if (tipo.equals("r-d")) {
				return realParaDolar(valorRecebido);
			} else if (tipo.equals("d-r")) {
				return dolarParaReal(valorRecebido);
			} else {
				throw new IllegalArgumentException("Variavel de conversao errada, Use r-d ou d-r");
			}
		} else {
			throw new IllegalArgumentException("Valor não pode ser negativo");
		}
	}

	protected double realParaDolar(double valor) {
		return valor * 0.244687;
	}

	protected double dolarParaReal(double valor) {
		return valor * 4.08685382;
	}

	public static String valorFormatado(double valor) {
		return "R$" + String.format("%1$,.2f", valor);
	}

}
