package testes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatNet  {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12346);
		Socket cliente = servidor.accept();
		System.out.println("Nova conexao em " + cliente.getInetAddress().getHostAddress());
		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
		cliente.close();
		servidor.close();
	}
	
}
