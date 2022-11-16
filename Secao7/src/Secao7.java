import java.util.Scanner;

public class Secao7 {

	/*
	 * Checklist
	 * 
	 * • Formatar: toLowerCase(), toUpperCase(), trim() • Recortar: *
	 * substring(inicio), substring(inicio, fim) • Substituir: Replace(char, char)
	 * Replace(string, string) • Buscar: IndexOf, LastIndexOf • str.Split(" ")
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();

	}

}
