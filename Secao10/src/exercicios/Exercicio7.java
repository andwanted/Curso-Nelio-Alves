package exercicios;

/*Problema "abaixo_da_media"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java
Fazer um programa para ler um n?mero inteiro N e depois um vetor de N n?meros reais. Em seguida,
mostrar na tela a m?dia aritm?tica de todos elementos com tr?s casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da m?dia, com uma casa decimal cada. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int x = sc.nextInt();
		sc.nextLine();

		double vet[] = new double[x];
		for (int i = 0; i < x; i++) {
			vet[i] = sc.nextDouble();

		}

		double media = 0.00;

		for (int i = 0; i < x; i++) {
			media += vet[i];
		}

		media = media / x;

		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < x; i++) {
			if(vet[i] < media)
			System.out.println(vet[i]);
		}

		sc.close();
	}
	
}
