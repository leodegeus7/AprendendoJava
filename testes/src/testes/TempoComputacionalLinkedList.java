package testes;

import java.util.LinkedList;
import java.util.List;

public class TempoComputacionalLinkedList {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();

		// trocar depois por ArrayList
		List<Integer> teste = new LinkedList<>();

		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		for (int i = 0; i < 30000; i++) {
			teste.get(i);
		}

		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio);
		System.out.println("Tempo gasto: " + tempo);
	}
}
