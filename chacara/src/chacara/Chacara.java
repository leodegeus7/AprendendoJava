package chacara;

public class Chacara {
	protected String nome;
	protected String cnpj; 
	protected int numFuncionarios;
	protected int numTerceirizados;
	protected Funcionario[] empregados;
	protected Terceirizado[] tercerizacao;
	private static int numTotalFuncionarios;
	
	
	public static int getNumTotalFuncionarios() {
		return numTotalFuncionarios;
	}

	public void addFuncionario(Funcionario f) {
		Funcionario[] func = empregados; 
		empregados = new Funcionario[numFuncionarios+1]; 
		if (numFuncionarios == 0) {
			empregados[0] = f;
		}
		else {
			int i=0;
			for (Funcionario singleFunc:func) {
				empregados[i] = singleFunc;
				i++;
			}
			empregados[numFuncionarios] = f;
		}
		addNumFuncionarios();
		System.out.println("Novo funcionario de nome: " + f.nome + " add. Com salario de R$" + f.salario + "00");
	}
	
	public void listaGastos() {
		System.out.println("\nFuncionarios da chacara " + this.nome);
		for (Funcionario f:empregados) {
			System.out.println(f.nome + " com salário de R$" + f.salario + "00");
		}
		System.out.println("\nTercerizacao da chacara " + this.nome);
		for (Terceirizado f:tercerizacao) {
			System.out.println(f.nome + " com salário de R$" + f.pagamento + "00");
		}
	}
	
	public void addTercerizacao(Terceirizado f) {
		Terceirizado[] func = tercerizacao; 
		tercerizacao = new Terceirizado[numTerceirizados+1]; 
		if (numTerceirizados == 0) {
			tercerizacao[0] = f;
		}
		else {
			int i=0;
			for (Terceirizado singleFunc:func) {
				tercerizacao[i] = singleFunc;
				i++;
			}
			tercerizacao[numTerceirizados] = f;
		}
		addNumTerceirizados();
		System.out.println("Nova tercerizacao de nome: " + f.nome + " add. Com pagamento de R$" + f.pagamento + "00");
	}

	public Chacara(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}


	public int getNumFuncionarios() {
		return numFuncionarios;
	}


	private void addNumFuncionarios() {
		this.numFuncionarios++;
	}


	public int getNumTerceirizados() {
		return numTerceirizados;
	}


	private void addNumTerceirizados() {
		this.numTerceirizados++;
	}


	public String getNome() {
		return nome;
	}


	public String getCnpj() {
		return cnpj;
	}
	
	
}
