package application;

import java.util.Scanner;

import entities.ClassePessoa;

public class ProgramPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas ira cadastrar?");
		int n = sc.nextInt();
		ClassePessoa[] pessoa = new ClassePessoa[n];
		

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome da pessoa: ");
			String nome = sc.nextLine();
			System.out.print("Digite a idade da pessoa: ");
			int idade = sc.nextInt();
			pessoa[i] = new ClassePessoa(nome, idade);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(pessoa[i]);
		}

		sc.close();
	}

}
