package separadorMoedas;

import java.util.HashMap;
import java.util.Map;

public class Separador {
	protected int nota[] = { 100, 50, 20, 10, 5, 2, 1 };
	protected int quantNota[] = { 0, 0, 0, 0, 0, 0, 0 };
	protected int total;
	protected Map<Integer, Integer> mapNotas = new HashMap<>();

	public void separar(int valor) {
		int valorAux = valor;
		for (int i = 0; i < 7; i++) {
			
			while (valorAux - nota[i] < nota[i]) {
				if (valorAux < nota[i]) {
					break;
				}
				quantNota[i]++;
				valorAux-=nota[i];
			}
			
			//valorAux = valor - nota[i]*quantNota[i];
		}
	}
	
	public  Map<Integer, Integer> getQuantNota() {
		
		for (int i=0;i<7;i++) {
			mapNotas.put(nota[i], quantNota[i]);
		}
		System.out.println(mapNotas);
		return mapNotas;
	}

}
