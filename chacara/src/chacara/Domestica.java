package chacara;

public class Domestica extends Funcionario {

	public Domestica(String nome, String cpf) {
		super(nome,cpf);
	}
	
	@Override
	public void defineAumento() {
		System.out.println("Domesticas tem bonificacao de 10% de acrescimo, com novo salario de: " + this.salario*1.1);
		this.salario *= 1.1;
	}



}
