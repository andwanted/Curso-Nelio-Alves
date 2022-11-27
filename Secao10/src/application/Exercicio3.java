package application;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

import java.util.Locale;
import java.util.Scanner;

import entities.Exercicio3pessoa;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdade;

		System.out.print("Digita a quantidade: ");
		qtdade = sc.nextInt();

		Exercicio3pessoa vet[] = new Exercicio3pessoa[qtdade];

		for (int i = 0; i < qtdade; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vet[i] = new Exercicio3pessoa(nome, idade, altura);

		}

		double altMedia = 0.0;

		for (int i = 0; i < qtdade; i++) {
			altMedia += vet[i].getAltura();
		}

		double media = altMedia / qtdade;

		for (int i = 0; i < qtdade; i++) {
			System.out.println(i +"ª Pessoa "+vet[i].getNome() + " " + vet[i].getIdade() + " " + vet[i].getAltura());
		}

		int contaPessoa = 0;

		for (int i = 0; i < qtdade; i++) {
			if (vet[i].getIdade() < 16) {
				contaPessoa++;
			}
		}
		
		double mediaIdade = contaPessoa*100 / qtdade;
		

		System.out.println("Altura média: " + media);
		System.out.println("Pessoas com menos de 16 anos: " + contaPessoa);
		System.out.println("Media de idade menor de 16 anos: " + mediaIdade + "%");

		for (int i = 0; i < qtdade; i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}

		sc.close();
	}

}
