package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class testeIteratorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = new ArrayList<>();

		nomes.add("Anderson");
		nomes.add("Leandro");
		nomes.add("Martins");
		nomes.add("Sousa");
		System.out.println(nomes);

		nomes.add(1, "Jeferson");

		System.out.println(nomes);

		Iterator<String> nomesInt = nomes.iterator();

		System.out.print("Imprimindo com controle interator: ");
		while (nomesInt.hasNext()) {
			String temporario = nomesInt.next();
			System.out.print(temporario + " ");
		}
		System.out.println();

		ListIterator<String> nomesListInt = nomes.listIterator();

		System.out.print("Alterando o valor com ListInterator: ");
		while (nomesListInt.hasNext()) {
			String temporarioList = nomesListInt.next();
			nomesListInt.set(temporarioList + " Campos");
		}
		System.out.println();
		
		System.out.println("Mostrando valores alterados com ListInterator");
		nomesInt = nomes.iterator();
		while(nomesInt.hasNext()) {
			String temporarioList = nomesInt.next();
			System.out.print(temporarioList + " ");
		}
	}

}
