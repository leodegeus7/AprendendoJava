package clipt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Criptografia {

	static String abc = "";
	String textoFile = "";
	String textoCripto = "";
	String chavecripto = "";
	int seguranca;
	
	public static void main(String[] args) {



	}
	
	public void begin(int nivelDeSegurança) {
		difineAbc();
		FileAnalystic file = new FileAnalystic();
		System.out.println("cheguei aqui");
		String texto;
		texto = textoFile;
		System.out.println("Texto de entrada: " + texto);
		Map<String, String> textoCript = new HashMap<>();
		textoCript = criptografarTexto(texto,nivelDeSegurança);
		System.out.println("Chave de criptografia: " + textoCript.keySet());
		System.out.println("Texto de criptografia: " + textoCript.values());
		String descript = descriptografarTexto(textoCript.values().toArray()[0].toString(), textoCript.keySet().toArray()[0].toString(), nivelDeSegurança);
		file.writeTxt(textoCript.values().toArray()[0].toString(),"textoCript.txt");
		System.out.println("Texto descriptografado: " + descript);
		file.writeTxt(descript,"texto2.txt");
		textoCripto = textoCript.values().toArray()[0].toString();
		chavecripto = textoCript.keySet().toArray()[0].toString();
	}
	


	public String getChavecripto() {
		return chavecripto;
	}

	public String getTextoCripto() {
		return textoCripto;
	}

	public String gerarChave(int seg) throws interacoesException {
		if (seg < 1 || seg > 10) {
			throw new interacoesException("Chave com numeros de interacoes errado, tente entre 1 e 10");
		}
		 Random r = new Random();
		String chave = "";
		char[] c_arr = abc.toCharArray();
		ArrayList<String> cript = new ArrayList<>();
		for (int i=0;i<c_arr.length;i++) {
			String letterS = "";
			for (int j = 0; j < seg; j++) {
				char letter1 = (char) (r.nextInt(26) + 'a');
				letterS += letter1;
			}
			cript.add(letterS);
				
		}
		for (int i = 0; i < cript.size(); i++) {
			chave += cript.get(i);
		}
		Map<String, String> criptografia = new HashMap<>();
		for (int i=0;i<abc.length();i++) {
			String let = ""+ c_arr[i];
			criptografia.put(let,cript.get(i));
		}
		return chave;		
	}
	
	public Map<String, String> criptografarTexto(String texto,int seg) {
		String textCript = "";
		Map<String, String> textoCript = new HashMap<>();
		try {
			String chave = gerarChave(seg);
			char[] textoChar = texto.toCharArray();
			char[] c_arr = abc.toCharArray();
			
			char[] chaveArray = chave.toCharArray();
			List<String> chaveStringArray = new ArrayList<String>();
			String aux = "";
			int j=0;
			for (int i = 0; i < chaveArray.length; i++) {
				j=i+1;
				aux += chaveArray[i];
				if (j%(seg)==0 && i!=0){
					chaveStringArray.add(aux);
					aux = "";
				}
			}
			
			
			
			Map<String, String> criptografia = new HashMap<>();
			for (int i=0;i<abc.length();i++) {
				String let = ""+ c_arr[i];
				criptografia.put(let,chaveStringArray.get(i));
			}
			
			
			for (int i = 0; i < textoChar.length; i++) {
				
				for(String key : criptografia.keySet()) {
				    if(key.charAt(0) == textoChar[i]){
				    	textCript+=criptografia.get(key);
				    	break;
				    }
				}

				
				 
			}
			
			textoCript.put(chave, textCript);
			
			
			
			
		} catch (interacoesException e) {
			e.printStackTrace();
		}
		return textoCript;
	}
	
	public String descriptografarTexto(String texto, String chave,int seg) {
		
		String textoDesc = "";
		difineAbc();
		char[] c_arr = abc.toCharArray();

		char[] chaveArray = chave.toCharArray();
		List<String> chaveStringArray = new ArrayList<String>();
		String aux = "";
		int j=0;
		for (int i = 0; i < chaveArray.length; i++) {
			j=i+1;
			aux += chaveArray[i];
			if (j%(seg)==0 && i!=0){
				chaveStringArray.add(aux);
				aux = "";
			}
		}
		
		
		
		Map<String, String> criptografia = new HashMap<>();
		for (int i=0;i<abc.length();i++) {
			String let = ""+ c_arr[i];
			criptografia.put(let,chaveStringArray.get(i));
		}
		


		char[] textoChar = texto.toCharArray();
		List<String> textoStringArray = new ArrayList<String>();
		String aux2 = "";
		int k=0;
		for (int i = 0; i < textoChar.length; i++) {
			k=i+1;
			aux2 += textoChar[i];
			if (k%(seg)==0 && i!=0){
				textoStringArray.add(aux2);
				aux2 = "";
			}
		}
		
		
		for (int i = 0; i < textoStringArray.size(); i++) {
				for(String key : criptografia.keySet()) {
					String keyA = ""+ criptografia.get(key);
					String criptB = ""+ textoStringArray.get(i);
				    if(keyA.equals(criptB)){
				    	textoDesc+=key;
				    	break;
				    }
				}
				
				
			
		}
		
		return textoDesc;
	}
	
	public void difineAbc() {
		abc="";
		for (int i = 0; i < 255; i++) {
			abc +=String.valueOf(Character.toChars(i));

		}
	}
	
}
