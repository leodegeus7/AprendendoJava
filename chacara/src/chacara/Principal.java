package chacara;

public class Principal {

	public static void main(String[] args) {
		Chacara chac1 = new Chacara("Pereira", "84.888.8484.22-2");
		
		Funcionario func1 = new Peao("Mario", "152.122.444-30");
		Funcionario func2 = new Peao("Leandro","142.135.444-40");
		Funcionario func3 = new Domestica("Rose","112.222.222-44");
		Funcionario func4 = new Gerente("Rosnaldo","232.252.253-34");
		
		Terceirizado terc1 = new Terceirizado("Servopa","12.144.222-45","Pecas de Carros");
		Terceirizado terc2 = new Terceirizado("Bradesco","11.134.222-45","Contas Bancarias");
		
		chac1.addFuncionario(func1);
		func1.defineSalario(1000);
		chac1.addFuncionario(func2);
		func2.defineSalario(1500);
		chac1.addFuncionario(func3);
		func3.defineSalario(1200);
		chac1.addFuncionario(func4);
		func4.defineSalario(2400);
		
		func4.defineAumento();
		func2.defineAumento();
		
		
		chac1.addTercerizacao(terc1);
		terc1.defineSalario(12000);
		chac1.addTercerizacao(terc2);
		terc2.defineSalario(1000);

		terc1.defineAumento();
		
		chac1.listaGastos();
		
		System.out.println(Funcionario.getGastosTotaisFuncionarios());
		
		Object objectTeste = new Domestica("Leo", "12.33.911-1");
		System.out.println(objectTeste);
		try {
			Peao gerenteTeste = (Peao) objectTeste;
			System.out.println("É Peao");	
		} catch (ClassCastException cl) {
			System.out.println("Nao é Peao");
			try {
				Domestica gerenteTeste = (Domestica) objectTeste;
				System.out.println("É Domestica");	
			} catch (ClassCastException cl2) {
				System.out.println("Nao é Domestica");	
				try {
					Gerente gerenteTeste = (Gerente) objectTeste;
					System.out.println("É Gerente");	
				} catch (ClassCastException cl3) {
					System.out.println("Nao é Gerente");	
				}
			}
		} finally {
			System.out.println("Terminou cast");
		}
		
		Gerente gen1 = new Gerente("oi","12");
		Gerente gen2 = new Gerente("oi","12");
		gen1 = gen2;
		
		if (gen1.equals(gen2)) {
			System.out.println("é igual");
		}

		String str1 = new String();
		str1 = "123";
		String str2 = " abc ABC ";
		String[] array = str2.split(" ");
		String str3 = ""; 
		for (String str:array) {
			str3 += str;
		}

		System.out.println(str3);
		
		
		
	}

}
