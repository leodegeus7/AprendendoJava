package chacara;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf) {
		super(nome,cpf);
	}
	@Override
	public void defineAumento() {
		System.out.println("Gerentes tem bonificaco de 30% em cima do valor com um acrescimo de: " + salario * 1.3);
		this.salario *= 1.3;
	}

}
