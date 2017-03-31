package br.com.leo.whatsAppAnalyzer.Linha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Linha {
	protected int numero;
	protected String pessoa;
	protected String frase;
	public int coracoes;

	protected List palavras;
	protected Date data;
	
	public static char coracao;
	
	public Linha(String frase) {
		this.frase = frase;
		data = acharData();
		acharPessoas();
		//System.out.println(data);
		
	}
	
	protected Date acharData() {
		String data = frase.substring(0, 18);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		try {
			Date date = sdf.parse(data);
			return date;
		} catch (ParseException e) {
			String data2 = frase.substring(1, 19);
			Date date2;
			try {
				date2 = sdf.parse(data2);
				return date2;
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.getStackTrace();
				return null;
			} 
			
			// TODO Auto-generated catch block
			//System.out.println(e);
		}
	}
	
	protected void acharPessoas() {
		int indexOf = frase.indexOf(":", 19);
		String pessoa = frase.substring(19, indexOf);
		this.pessoa = pessoa.trim();
	}
	
	protected void coracoes() {
		char[] chars = frase.toCharArray();
		for (char c : chars) {

		}
	}
	
	public Date getData() {
		return data;
	}

	public String getPessoa() {
		return pessoa;
	}

	public String getFrase() {
		return frase;
	}
}
