package testes;

public class TesteDeDivisaoZero {
	public static void main(String[] args) {
		int i = 325;
		try {
			i = i/0;
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Erro: " + e);
		}
		System.out.println(i);
	}
}
