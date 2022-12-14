package exercicios;

/*Problema "media_pares"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
Fazer um programa para ler um vetor de N n?meros inteiros. Em seguida, mostrar na tela a m?dia
aritm?tica somente dos n?meros pares lidos, com uma casa decimal. Se nenhum n?mero par for
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
