package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta c;
	
		System.out.print("Digite o numero da conta: " );
		int nConta = sc.nextInt();
		System.out.print("Digite o nome do titular: " );
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Deposito inicial: Sim ou Não s/n " );
		char op = sc.next().charAt(0);
		if(op == 's') {
			System.out.println("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			c = new Conta(nConta,nomeTitular,depositoInicial);			
		}else{
			c = new Conta(nConta,nomeTitular);
		}
		
		System.out.print("Valor do deposito: ");
		double deposito = sc.nextDouble();
		c.deposito(deposito);
		System.out.println(c);
		
		System.out.print("Valor do saque: ");
		double saque = sc.nextDouble();
		c.saque(saque);
		System.out.println(c);
		
		sc.close();
		
	}

}
