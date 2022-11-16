import java.util.Locale;
import java.util.Scanner;

public class Secao5 {

	/*
	 * Operadores comparativos
	 * 
	 * Operador Significado > maior < menor >= maior ou igual <= menor ou igual ==
	 * igual != diferente
	 * 
	 * Operadores lógicos Operador Significado && E || OU ! NÃO
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();

	}

}
