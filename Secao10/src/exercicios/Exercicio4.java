package exercicios;

/*Problema "numeros_pares"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
Fa?a um programa que leia N n?meros inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os n?meros pares, e tamb?m a quantidade de n?meros pares. 
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
