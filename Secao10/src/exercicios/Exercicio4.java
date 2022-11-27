package exercicios;

/*Problema "numeros_pares"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int x = sc.nextInt();

		int vet[] = new int[x];

		for (int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		int countPar = 0;

		System.out.println("Numeros pares: ");
		
		for (int i = 0; i < x; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(" "+ vet[i]);
				countPar++;
			}
		}

		System.out.println("\nQuantidade de pares = " + countPar);
		
		sc.close();
	}

}
