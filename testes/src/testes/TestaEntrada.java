package testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {
		System.out.println("1");
		
		String teste = new String();
		
		
	     InputStream is = System.in;
	     InputStreamReader isr = new InputStreamReader(is);
	     BufferedReader br = new BufferedReader(isr);
			System.out.println("1");
	     System.out.println("Digite sua mensagem:");
	     String linha = br.readLine(); // primeira linha
	     
	     while (linha != null) {
	       
	       linha = br.readLine();
	       teste = linha;
	       if (teste == "oi") {
	   		System.out.println("deu");
	       }
	     }
			System.out.println("1");
	   }
}
