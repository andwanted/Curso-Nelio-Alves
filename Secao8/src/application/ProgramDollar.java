package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		CurrencyConverter c = new CurrencyConverter();
		Scanner sc = new Scanner(System.in);

		
		System.out.print("What is the dollar price? ");
		c.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		c.quantity = sc.nextDouble();
		c.Calcule();
		System.out.printf("Amount to be paid in reais = %.2f%n ", c.total);
		
		sc.close();
		
	}

}
