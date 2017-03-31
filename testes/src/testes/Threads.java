package testes;

public class Threads {
		   public static void main(String[] args) throws InterruptedException {
		 
			   ThreadProgram p1 = new ThreadProgram();  
		     p1.setId(1);
		     Thread t1 = new Thread(p1);
		     ThreadProgram p2 = new ThreadProgram();  
		     p2.setId(2);
		     Thread t2 = new Thread(p2);
		     
		     
		     
		     
		     t1.start();
		     t2.wait();
		     t2.notify();
		     
		        
		   }
}
