package entities;

public class ClassePessoa {
	private int idade;
	private String nome;
	private String cpf;
	private double altura;
	private String endereco;

	public ClassePessoa() {

	}

	public ClassePessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return nome + ", " + idade;
	}

}
