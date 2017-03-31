package casa;

public class Casa {
	String cor;
	int num;
	int totalDePortas;
	Porta[] portas;

	void imprimirCasa() {
		System.out.println("Casa " + num + " de cor "+ cor + " com um total de portas em: " + totalDePortas);
		
		for (int i=0;i<portas.length;i++) {
			if (portas[i].estaAberta) {
				System.out.println("Porta " + portas[i].cor + " esta aberta");
			} else {
				System.out.println("Porta " + portas[i].cor + " esta fechada");
			}
		}
		System.out.println("");
	}
}

