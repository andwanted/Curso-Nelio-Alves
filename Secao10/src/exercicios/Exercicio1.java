package exercicios;

/*Problema "negativos"
Corre??o: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
Fa?a um programa que leia um n?mero inteiro positivo N (m?ximo = 10) e depois N n?meros inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os n?meros negativos lidos. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double vect[] = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}

		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
			
		}

		sc.close();
	}

}
