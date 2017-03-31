/*
* Classname BalancoTrimestral
*
* Version info
*
* Copyright notice */

package teste1;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTotais = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTotais);
		int mediaMensal = gastosTotais / 3;
		System.out.println("Valor da média mensal = " + mediaMensal);

	}

}
