package chacara;

public abstract class Funcionario implements Pagamentos {
	protected String nome;
	protected double salario;
	protected String cpf;
	protected static double gastosTotaisFuncionarios=0;
	
	
	public Funcionario(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public abstract void defineAumento();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " salario de: " +salario;
	}
	 
	 
	public void defineSalario(double valor) {
		gastosTotaisFuncionarios += valor;
		this.salario = valor;
		System.out.println("Salario do valor de: R$" + this.salario + ".00 adicionado a " + this.nome + "\n");
	}

	public static double getGastosTotaisFuncionarios() {
		return gastosTotaisFuncionarios;
	}
	
	
	
}