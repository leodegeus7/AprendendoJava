package teste1;

public class PiramideN2 {
	public static void main(String[] args){
		for (int i=1;i<10;i++){
			System.out.print(i + "\t");
			for (int j=1;j<i;j++){
				System.out.print((j+1)*i + "\t");
			}
			System.out.println("");
		}
	} 
}
