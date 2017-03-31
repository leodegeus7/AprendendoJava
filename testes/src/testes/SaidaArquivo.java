package testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class SaidaArquivo {
	public static void main(String[] args) throws IOException {
	     OutputStream os = new FileOutputStream("saida.txt");
	     OutputStreamWriter osw = new OutputStreamWriter(os);
	     BufferedWriter bw = new BufferedWriter(osw);
	 
	     bw.write("caelum");
	     bw.newLine();
	     bw.write("testando arquivo");
	     bw.newLine();
	     bw.write("Leonardo de Geus");
	     bw.close();
	     
	     Scanner s = new Scanner(System.in);
	     PrintStream ps = new PrintStream("saida.txt");
	     while (s.hasNextLine()){
	    	 ps.println(s.nextLine());
	     }
	}
}
