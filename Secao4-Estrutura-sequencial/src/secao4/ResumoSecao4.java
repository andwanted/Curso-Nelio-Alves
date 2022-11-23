package secao4;

import java.util.Locale;

public class ResumoSecao4 {

	/*
	 * + adição - subtração multiplicação / divisão % resto da divisão ("mod")
	 * Precedência: 1o lugar: * / % 2o lugar: + -
	 */

	/*
	 * Declaração de variáveis Sintaxe: <tipo> <nome> = <valor inicial>;
	 */

	/*
	 * tipos numéricos inteiros byte -128 a 127 short -32768 a 32767 int -2147483648
	 * a 2147483647 long -9223372036854770000 a 9223372036854770000
	 */

	/* tipos numéricos com ponto flutuante */

	/*
	 * float -1,4024E-37 a 3,4028E+38 double -4,94E-307 a 1,79E+308
	 */

	/* um caractere unicode char '\u0000' a '\uFFFF' */

	/* valor verdade boolean 1 bit {false, true} */

	/* Nomes de variáveis */

	/*
	 * Não pode começar com dígito: use uma letra ou _ • Não pode ter espaço em
	 * branco • Não usar acentos ou til • Sugestão: use o padrão "camel case"
	 */
	
	/*
	 * Funções matemáticas • sqrt – raiz quadrada • pow – potenciação • abs – valor
	 * absoluto • Exemplos
	 * 
	 * Maiores informações: java.lang.Math
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
