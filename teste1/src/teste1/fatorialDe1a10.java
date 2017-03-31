package teste1;

public class fatorialDe1a10 {
	static public void main(String[] args){
		
		for (int j=0;j<20;j++){
			if (j==0) {
				System.out.println("1");
			}
			else {
				long fatorial=1;
				long  valorAnterior=1;
			    for (int i=j;i>0;i--){
			    	
			    	fatorial = i*valorAnterior;
			    	valorAnterior = fatorial;
			    	
			    }
			    System.out.print(fatorial);
			}
		}
	}
}
