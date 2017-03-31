package testes;


import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TesteEntradaScanner {
		  public static void main(String[] args) throws IOException {
		    InputStream is = System.in;
		    Scanner entrada = new Scanner(is);

		    System.out.println("Digite sua mensagem:");
		    while (entrada.hasNextLine()) {
		      System.out.println(entrada.nextLine());
		    }
		    entrada.close();
		  }
}
