package empresa;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int numFuncionarios = 0;
	public static int numEmpresas = 0;

	Empresa(String nomeEmpresa, String cnpjEmpresa, int numFuncionarios) {
		if (testaCnpj(cnpjEmpresa)) {
			this.nome = nomeEmpresa;
			this.cnpj = cnpjEmpresa;
		} else {
			this.nome = nomeEmpresa;
			this.cnpj = "CNPJ INVALIDO";
		}
		setNumEmpresas();
		empregados = new Funcionario[numFuncionarios];

	}

	private static void setNumEmpresas() {
		Empresa.numEmpresas++;
	}

	public void setNome(String nomeEmpresa) {
		this.nome = nomeEmpresa;
	}

	public String getNome() {
		return this.nome;
	}

	private boolean testaCnpj(String cnpjEmpresa) {
		if (!cnpjEmpresa.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	void adicionaEmpregado(Funcionario f) {
		numFuncionarios++;
		empregados[numFuncionarios - 1] = f;
	}

	void imprimirEmpresa() {
		System.out.println(nome);
		System.out.println(this.cnpj);

		for (int i = 0; i < numFuncionarios; i++) {
			empregados[i].imprimeValores();
		}

	}

}
