package exercicios;

//https://dev.to/antonioeloy/percorrendo-listas-antes-e-depois-do-java-8-pl1

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LeituraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> frutas = new ArrayList<>();

		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Acerola");
		frutas.add("Lim?o");
		frutas.add("Maracuj?");

		/*
		 * An Iterator? um objeto que pode ser usado para percorrer cole??es, como
		 * ArrayList e HashSet . ? chamado de "iterador" porque "iterar" ? o termo
		 * t?cnico para looping.
		 */
		// https://www.w3schools.com/java/java_iterator.asp

		// https://acervolima.com/diferenca-entre-os-metodos-next-e-hasnext-em-colecoes-java/
		/*
		 * hasNext ? para retornar verdadeiro ou falso se tem proximo elemento nesta
		 * cadeia Next aponta e guarda qual proximo elemento da lista
		 */
		Iterator<String> iterator = frutas.iterator();
		while (iterator.hasNext()) {
			String fruta = iterator.next();
			System.out.println(fruta);
		}

		/*
		 * O Iterator e ListIterator s?o os dois entre os tr?s cursores de Java. O
		 * Iterator e o ListIterator s?o definidos pelo Collection Framework no pacote J
		 * ava.Util . ListIterator ? a interface filho da interface Iterator. A
		 * principal diferen?a entre o Iterator e o ListIterator ? que o Iterator pode
		 * percorrer os elementos na cole??o apenas na dire??o para frente, enquanto o
		 * ListIterator pode atravessar os elementos em uma cole??o na dire??o para
		 * frente e para tr?s .
		 */

		// https://pt.gadget-info.com/difference-between-iterator

		ListIterator<String> listIterator = frutas.listIterator();

		while (listIterator.hasNext()) {
			Object fruta = listIterator.next();
			listIterator.set(fruta + " Fui mexida");
		}

		while (iterator.hasNext()) {
			Object fruta = iterator.next();
			System.out.println(fruta);
		}

		ListIterator<String> listIteratorbk = frutas.listIterator();

		while (listIteratorbk.hasPrevious()) {
			Object fruta = listIteratorbk.previous();
			listIteratorbk.set(fruta + " Voltou ao normal");
		}

		while (listIteratorbk.hasPrevious()) {
			Object fruta = listIteratorbk.previous();
			System.out.println(fruta);
		}

		for (int i = 0; i < frutas.size(); i++) {
			String fruta = frutas.get(i);
			System.out.println(fruta);
		}

		for (String fruta : frutas) {
			System.out.println(fruta);
		}

		frutas.forEach(fruta -> System.out.println(fruta));

		frutas.forEach(System.out::println);

	}

}
