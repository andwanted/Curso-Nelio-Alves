package exercicios;

/*Problema "media_pares"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		sc.nextLine();

		double vet[] = new double[n];
		double numpar = 0;
		int countNumpar = 0;

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
			if (vet[i] % 2 == 0) {
				numpar += vet[i];
				countNumpar++;
			}
		}

		double mediaNumpar = numpar / countNumpar;

		if (countNumpar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES = %.1f", mediaNumpar);
		}

		sc.close();
	}

}
