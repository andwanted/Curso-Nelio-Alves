package exercicios;

/*Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/dados_pessoas.java
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 
*/

import java.util.Locale;
import java.util.Scanner;


/**
 * @author ander
 *
 */
public class Exercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double vet1[] = new double[n];
		char vet2[] = new char[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Altura da %da pessoa:", i + 1);
			vet1[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:", i + 1);
			vet2[i] = sc.next().charAt(0);
		}

		double guardaMaiorAlt = 0;

		for (int i = 0; i < n; i++) {
			if (guardaMaiorAlt < vet1[i]) {
				guardaMaiorAlt = vet1[i];
			}
		}

		double guardaMenorAlt = guardaMaiorAlt;

		for (int i = 0; i < n; i++) {
			if (vet1[i] < guardaMenorAlt) {
				guardaMenorAlt = vet1[i];
			}
		}

		double somaAlt = 0;
		int contaF = 0;

		for (int i = 0; i < n; i++) {
			if (vet2[i] == 'F') {
				somaAlt += vet1[i];
				contaF++;
			}
		}

		int contaM = 0;

		for (int i = 0; i < n; i++) {
			if (vet2[i] == 'M') {
				contaM++;
			}
		}

		double medAlt = somaAlt / contaF;

		System.out.printf("MENOR ALTURA = %.2f\n", guardaMenorAlt);
		System.out.printf("MAIOR ALTURA = %.2f\n", guardaMaiorAlt);
		System.out.printf("Media das alturas das mulheres = %.2f\n", medAlt);
		System.out.printf("Numero de homens = %d\n",contaM);

		sc.close();
	}

}
