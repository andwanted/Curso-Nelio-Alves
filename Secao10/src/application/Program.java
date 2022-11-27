package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// variavel n recebe entrada para definir quantas vezes ira rodar
		int n = sc.nextInt();

		// declara e instancia o vetor recebendo variavel n como quantidade de casas
		double[] vect = new double[n];

		// laço começando com 0, enquanto for menor que variavel n incrementa +1
		for (int i = 0; i < n; i++) {
			// recebe entrada armazenando no vetor no numero i de vezes
			vect[i] = sc.nextDouble();
		}

		// cria variavel soma
		double sum = 0.0;

		// laço para receber e somar os valores digitados
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		// variavel avg recebendo e calculando a media dos valores digitados
		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		sc.close();
	}

}
