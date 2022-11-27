package exercicios;

/*Problema "soma_vetor"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double vet[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		

		double sum = 0.0;
		
		System.out.print("VALORES: ");
		for (int i = 0; i < n; i++) {
			sum += vet[i];
			System.out.print(" " + vet[i] );
		}
		
		double avg = sum/n;
		
		System.out.printf("\nSOMA %.2f%n", sum);
		System.out.printf("MEDIA %.2f%n", avg);
		

		sc.close();
	}

}
