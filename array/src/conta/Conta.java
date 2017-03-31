package conta;

public abstract class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		saldo+=valor;
	}
	
	public void saca(double valor) {
		saldo-=valor;
	}
	
	public abstract void atualiza(double taxa);
}
