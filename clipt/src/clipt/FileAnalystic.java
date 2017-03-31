package clipt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileAnalystic {
		   

		   
		   public String readTxt(String nome) throws IOException {
			   nome += ".txt";
			     InputStream is = new FileInputStream(nome);
			     InputStreamReader isr = new InputStreamReader(is);
			     BufferedReader br = new BufferedReader(isr);
			     String everything;
			   try {
			       StringBuilder sb = new StringBuilder();
			       String line = br.readLine();

			       while (line != null) {
			           sb.append(line);
			           sb.append(System.lineSeparator());
			           line = br.readLine();
			       }
			       everything = sb.toString();
			       
			   } finally {
			       br.close();
			   }
			return everything;
		}
		   
		   public void writeTxt(String texto,String nomeArq) {
			   BufferedWriter writer = null;
			   try
			   {
			       writer = new BufferedWriter( new FileWriter(nomeArq));
			       writer.write(texto);

			   }
			   catch ( IOException e)
			   {
			   }
			   finally
			   {
			       try
			       {
			           if ( writer != null)
			           writer.close( );
			       }
			       catch ( IOException e)
			       {
			       }
			   }
		   }
}
