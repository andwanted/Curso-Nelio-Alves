package exercicios;

/*Problema "soma_vetores"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetores.java
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números serão digitados? ");
		int x = sc.nextInt();
		sc.nextLine();

		int vet1[] = new int[x];
		int vet2[] = new int[x];

		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < x; i++) {
			vet1[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B");
		for (int i = 0; i < x; i++) {
			vet2[i] = sc.nextInt();
		}

		System.out.println("VETOR RESULTANTE");
		int vet3[] = new int[x];

		for (int i = 0; i < x; i++) {
			 vet3[i] = vet1[i] + vet2[i];
			 System.out.println(vet3[i]);
		}

		sc.close();
	}

}
