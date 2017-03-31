package conta;

public class AtualizadorDeContas {
	private double saldoTotal=0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println("Saldo Antigo: " + c.saldo);
		c.atualiza(selic);
		System.out.println("Saldo Novo: " + c.saldo);
		saldoTotal += c.saldo;
	}
	
	double getSaldoTotal() {
		return this.saldoTotal;
	}
}
