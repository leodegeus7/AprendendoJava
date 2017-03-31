package testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntradaTeclado {
	public static void main(String[] args) throws IOException {
	     InputStream is = System.in;
	     InputStreamReader isr = new InputStreamReader(is);
	     BufferedReader br = new BufferedReader(isr);
	     String s = br.readLine();
	     String t = "oi";
	     while (s != null) {

	       if (s == t) {
	    	   System.out.println("Hello");
	       }
	       else{
	    	   System.out.println("nao hello");
	       }
	       s = br.readLine();

	     }
	     
	   }
}
