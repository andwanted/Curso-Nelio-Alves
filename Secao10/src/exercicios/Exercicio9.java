package exercicios;

/*Problema "mais_velho"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/mais_velho.java
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		

		String vetNome[] = new String[n];
		int vetIdade[] = new int[n];

		int guardaIdade = 0;
		int posIdade = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			vetNome[i] = sc.nextLine();
			System.out.print("Digite a idade: ");
			vetIdade[i] = sc.nextInt();
			
			if (guardaIdade < vetIdade[i]) {
				guardaIdade = vetIdade[i];
				posIdade = i;
				System.out.println("Guardou idade");
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + vetNome[posIdade]);

		sc.close();
	}

}
