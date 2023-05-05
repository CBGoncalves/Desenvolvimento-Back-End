package ExercicioBanco;

public abstract class Pessoa {
	
	String nome;
	String endereco;
	String telefone;
	double saldoAtual;
	String agencia;
	String conta;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getSaldo() {
		return saldoAtual;
	}
	
	public void setSaldo(double saldoAtual) {
		
		this.saldoAtual = saldoAtual;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	
	
}
