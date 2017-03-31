package banco;

public class Principal {
	public static void main(String[] args){
		Funcionario func1 = new Funcionario();
		func1.nome = "Leonardo";
		func1.departamento = "desenvolvimento";
		Data entrada = new Data();
		entrada.dia = 7;
		entrada.mes = 8;
		entrada.ano = 2015;
		
		func1.entrada = entrada;
		func1.estaNaEmpresa = true;
		func1.rg = "12.335.444.44";
		func1.salario = 1000;

		func1.imprimeValores();

		System.out.println("R$" + func1.calculaGanhoAnual() + "");
		func1.recebeAumento(20);
		
		func1.imprimeValores();
		
		
	}
}
