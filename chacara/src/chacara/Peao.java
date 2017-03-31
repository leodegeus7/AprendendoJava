package chacara;

public class Peao extends Funcionario {

	public Peao(String nome, String cpf) {
		super(nome,cpf);
	}
	
	@Override
	public void defineAumento() {
		System.out.println("Peoes tem um acrescimo de 10% em seus valores de acrescimos salarios");
		salario*=1.1;
	}

}
