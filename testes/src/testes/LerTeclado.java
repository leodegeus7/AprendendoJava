package testes;

import java.util.Scanner;
public class LerTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n;
		n = scan.next();
		if (n.equals("oi")){
			System.out.println("twste");
		}
		scan.close();
	}
}
