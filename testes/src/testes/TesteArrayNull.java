package testes;

public class TesteArrayNull {
	public static void main(String[] args) {
		Object[] arrayTeste = new Object[10];
		
		Integer numb1 = 56;
		Double numb2 = 56.5;
		Float numb3 = (float) 654.333;
		String str1 = "Testando String";
		
		arrayTeste[2] = numb1;
		arrayTeste[6] = numb2;
		arrayTeste[7] = numb3;
		arrayTeste[8] = str1;
		for (int i = 0;i<arrayTeste.length;i++) {

			if (arrayTeste[i] == null) {
				System.out.println(i + " is empty");
			}
			else {
				System.out.println(arrayTeste[i]);
			}
			
		}
		
	}
	
	
}
