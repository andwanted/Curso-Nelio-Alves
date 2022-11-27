package application;

import java.util.Scanner;
import entities.ClasseHotel;

public class ExercicioDeFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ClasseHotel[] reserva = new ClasseHotel[10];
		System.out.print("Quantos quartos serão reservados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d\n", i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			reserva[quarto] = new ClasseHotel(nome, email);
		}

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (reserva[i] != null) {
				System.out.println(i + " " + reserva[i]);
			}
		}

		sc.close();
	}

}
