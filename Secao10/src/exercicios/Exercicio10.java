package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*Problema "aprovados"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/aprovados.java
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1? e 2? semestres. Cada uma dessas informa??es deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja m?dia das notas seja maior ou
igual a 6.0 (seis). */

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		String vetNome[] = new String[n];
		double vet1[] = new double[n];
		double vet2[] = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i);
			vetNome[i] = sc.nextLine();
			vet1[i] = sc.nextDouble();
			vet2[i] = sc.nextDouble();
		}

		double media = 0.0;

		for (int i = 0; i < n; i++) {
			media = (vet1[i] + vet2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(vetNome[i]);
			}
		}

		sc.close();

	}

}
