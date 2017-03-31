package banco;

public class Funcionario {
	String nome;
	String departamento;
	Data entrada;
	String rg;
	int salario;
	boolean estaNaEmpresa;
	
	
	void recebeAumento(int aumento){
		this.salario += aumento;
	}
	
	boolean recebeDesconto(int desconto){
		if (this.salario - desconto < 0) {
			return false;
		}
		else {
			salario -=salario;
			return true;
		}
	}
	
	boolean demite() {
		if (this.estaNaEmpresa) {
			this.estaNaEmpresa = false;
			this.salario = 0;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	double calculaGanhoAnual() {
		int ganhoAnual = 0; 
		ganhoAnual = salario*12;
		return (double)ganhoAnual;
	}
	
	void imprimeValores() {
		System.out.println("\n");
		System.out.println(this.nome + "  -  Rg:" + this.rg);
		if (this.estaNaEmpresa == true) {
			System.out.println("Funcionario pertence a esta na empresa no departamento de " + this.departamento);
			System.out.println("Salario: R$" + this.salario + ".00");
			System.out.println("Data de entrada: " + this.entrada.dia + "/" + this.entrada.mes + "/" + this.entrada.ano);
		}
		else {
			System.out.println("Funcionario nao pertence a esta empresa mais");
		}
		
		
		
	}
}
