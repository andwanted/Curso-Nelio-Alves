package exercicios;

/*Problema "maior_posicao"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java
Fa?a um programa que leia N n?meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior n?mero do vetor (supor n?o haver empates). Mostrar tamb?m a posi??o do maior elemento,
considerando a primeira posi??o como 0 (zero). 

*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vai digitar? ");
		int x = sc.nextInt();
		int vet[] = new int[x];

		for (int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("Digite um n?mero: ");
			vet[i] = sc.nextInt();
		}

		int maior = 0;
		int pos = 0;

		for (int i = 0; i < x; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pos++;
			}
		}

		System.out.printf("MAIOR VALOR = %d%n", maior);
		System.out.printf("POSI??O DO VALOR= %d%n", pos);

		sc.close();

	}

}
