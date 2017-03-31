package br.com.leo.whatsAppAnalyzer.Conversa;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.leo.whatsAppAnalyzer.Linha.Linha;

public class Conversa {
	protected List<Linha> linhas = new ArrayList<>();
	protected Map<String,String> infoConversa = new HashMap<>();
	
	public Conversa(List<String> linhas) {
		for (String string : linhas) {
			Linha linhaUnica = new Linha(string);
			this.linhas.add(linhaUnica);
			
		}
		linhas.remove(0);
		acharPessoas();
		conseguirInformacoes();
		tempoResposta();
		
	}
	
	protected Map<String,String> acharPessoas() {
		Map<String,String> pessoas = new HashMap<>();
		
		infoConversa.put("Pessoa 1", linhas.get(0).getPessoa().trim());
		for (Linha linha : linhas) {
			if (!linha.getPessoa().trim().equals(infoConversa.get("Pessoa 1"))){
				infoConversa.put("Pessoa 2", linha.getPessoa().trim());
				break;
			}
		}
		return pessoas;
	}
	
	protected void conseguirInformacoes() {
		int numMsgPesso1 = 0;
		int numMsgPesso2 = 0;
		for (Linha linha : linhas) {
			if (linha.getPessoa().equals(infoConversa.get("Pessoa 1"))) {
				numMsgPesso1++;
			}
			else {
				numMsgPesso2++;
			}
		}
		infoConversa.put("Mensagens " + infoConversa.get("Pessoa 1"), "" + numMsgPesso1);
		infoConversa.put("Mensagens " + infoConversa.get("Pessoa 2"), "" + numMsgPesso2);
		System.out.println(infoConversa);
		Linha.coracao = linhas.get(20).getFrase().toCharArray()[39];
//		for (Linha linha : linhas) {
//			System.out.println(linha.getFrase());
//		}

	}
	
	protected void tempoResposta() {
		List<Float> tempos = new ArrayList<>();
		Linha linhaAnterior = linhas.get(0);
		
		for (Linha linha : linhas) {
			tempos.add((float) ((linha.getData().getTime() - linhaAnterior.getData().getTime())/1000));
			linhaAnterior = linha;
		}
		
		
//		for (Float float1 : tempos) {
//			
//			System.out.println(float1);
//		}
		
	}
}
