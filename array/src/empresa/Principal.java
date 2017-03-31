package empresa;

public class Principal {
	public static void main(String[] args){
		Funcionario func1;
		Data entrada = new Data();
		entrada.dia = 7;
		entrada.mes = 8;
		entrada.ano = 2015;
		func1 = new Funcionario("Leonardo","desenvolvimento",entrada, "12.335.444.44", 1000);
		
		
		Funcionario func2;
		Data entrada2 = new Data();
		entrada2.dia = 7;
		entrada2.mes = 8;
		entrada2.ano = 2015;
		func2 = new Funcionario("Amanda","desenvolvimento",entrada2, "12.339.674.14", 1500);
		
		Empresa emp1 = new Empresa("Leonardolandia","886484683738373",2);
		
		//func1.imprimeValores();

		//System.out.println("R$" + func1.calculaGanhoAnual() + "");
		//func1.recebeAumento(20);
		
		//func1.imprimeValores();
		
		
		emp1.adicionaEmpregado(func1);
		emp1.adicionaEmpregado(func2);
		emp1.imprimirEmpresa();
		
		System.out.println(Empresa.numEmpresas);
		System.out.println(Funcionario.numFuncionarios);
		
	}
}
