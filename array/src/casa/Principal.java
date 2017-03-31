package casa;

import java.util.Random;


public class Principal {
	public static void main(String[] args){
		
		String[] cores = {"vermelho","amarelo","azul","preto","branco"};
		Random gerador = new Random();
		int numCasas = gerador.nextInt(10)+1;
		Casa[] casas = new Casa[numCasas];

		
		for (int i=0;i<numCasas;i++) {
			int numPortasNasCasas = gerador.nextInt(10)+1;
			Casa singleCasa = new Casa();
			singleCasa.num = i;
			singleCasa.cor = cores[gerador.nextInt(5)];
			singleCasa.totalDePortas = numPortasNasCasas;
			casas[i] = singleCasa;
			
			
			
			Porta[] portas = new Porta[casas[i].totalDePortas];
			
			for (int j=0;j<casas[i].totalDePortas;j++) {
				Porta singlePorta = new Porta();
				singlePorta.cor = cores[gerador.nextInt(5)];
				singlePorta.estaAberta = gerador.nextBoolean();
				portas[j] = singlePorta;
			}
			
			casas[i].portas = portas;
			
		}
		
		for (int i=0;i<casas.length;i++) {
			casas[i].imprimirCasa();
		}
		
		
		
	}
	

}
