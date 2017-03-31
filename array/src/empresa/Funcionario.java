package empresa;

public class Funcionario {
	private String nome;
	private String departamento;
	private Data entrada;
	private String rg;
	private int salario;
	private boolean estaNaEmpresa;
	public static int numFuncionarios=0;
	
	Funcionario(String nomeFuncionario,String deparFuncionario,Data dataFunc, String rgFunc, int salarioFunc) {
		this.nome = nomeFuncionario;
		this.departamento = deparFuncionario;
		this.entrada = dataFunc;
		this.rg = rgFunc;
		this.salario= salarioFunc;
		this.estaNaEmpresa = true;
		Funcionario.numFuncionarios++;
	}
	

	static int getNumFuncionarios() {
		return numFuncionarios;
	}
	
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
