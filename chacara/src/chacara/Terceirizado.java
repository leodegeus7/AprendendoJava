package chacara;

public class Terceirizado implements Pagamentos {
	protected String nome;
	protected String cpf;
	protected String motivo;
	protected double pagamento;
	
	public Terceirizado(String nome,String cpf, String motivo) {
		this.nome = nome;
		this.cpf = cpf;
		this.motivo = motivo;
	}

	@Override
	public void defineAumento() {
		System.out.println("Teve um aumento de 10% na tercerizaçao com nome " + this.nome);
		this.pagamento *= 1.1;	
	}

	@Override
	public void defineSalario(double valor) {
		this.pagamento =  valor;
		System.out.println("Pagamento do valor de: R$" + this.pagamento + ".00 adicionado a " + this.nome + "\n");
	}
	
}
