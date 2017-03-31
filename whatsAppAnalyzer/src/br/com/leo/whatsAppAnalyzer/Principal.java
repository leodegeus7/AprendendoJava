package br.com.leo.whatsAppAnalyzer;

import java.io.IOException;
import br.com.leo.whatsAppAnalyzer.Conversa.Conversa;
import br.com.leo.whatsAppAnalyzer.Leitor.LeitorArquivos;

public class Principal {

	public static void main(String[] args) throws IOException {
		LeitorArquivos leitor = new LeitorArquivos();
		Conversa conversa = new Conversa(leitor.leArquivo("123"));
		
		

	}

}
