package br.com.leo.whatsAppAnalyzer.Leitor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LeitorArquivos {
	
	public List<String> leArquivo(String nome) throws IOException {
		InputStream is = new FileInputStream(nome + ".txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();
		
		List<String> conversas = new ArrayList<>();
		
		while (s != null) {
			if (!s.equals("")){
				conversas.add(s);
			}
			//System.out.println(s);
			s = br.readLine();
		}
		br.close();
		return conversas;
	}
	

	
	
}
