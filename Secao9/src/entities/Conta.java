package entities;

public class Conta {

	private int numeroConta;
	private String nome;
	private double depositoInicial;
	private double saldo;

	public Conta() {
	}

	public Conta(int numeroConta, String nome, double depositoInicial){
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Conta(int numeroConta, String nome){
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public double getSaldo() {
		return saldo;
	}


	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void saque(double saldo) {
		double tax = 5.0;
		this.saldo -= saldo + tax;
	}

	public String toString() {
		return "\nConta atualizada \n"
				+ "Conta: " +  numeroConta + ", " + 
				"Nome: " + nome + ", " + 
				"Saldo: "+ "R$" + String.format("%.2f", saldo)  + "\n";
	}

}
