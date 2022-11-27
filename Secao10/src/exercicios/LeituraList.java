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
		frutas.add("Limão");
		frutas.add("Maracujá");

		/*
		 * An Iteratoré um objeto que pode ser usado para percorrer coleções, como
		 * ArrayList e HashSet . É chamado de "iterador" porque "iterar" é o termo
		 * técnico para looping.
		 */
		// https://www.w3schools.com/java/java_iterator.asp

		// https://acervolima.com/diferenca-entre-os-metodos-next-e-hasnext-em-colecoes-java/
		/*
		 * hasNext é para retornar verdadeiro ou falso se tem proximo elemento nesta
		 * cadeia Next aponta e guarda qual proximo elemento da lista
		 */
		Iterator<String> iterator = frutas.iterator();
		while (iterator.hasNext()) {
			String fruta = iterator.next();
			System.out.println(fruta);
		}

		/*
		 * O Iterator e ListIterator são os dois entre os três cursores de Java. O
		 * Iterator e o ListIterator são definidos pelo Collection Framework no pacote J
		 * ava.Util . ListIterator é a interface filho da interface Iterator. A
		 * principal diferença entre o Iterator e o ListIterator é que o Iterator pode
		 * percorrer os elementos na coleção apenas na direção para frente, enquanto o
		 * ListIterator pode atravessar os elementos em uma coleção na direção para
		 * frente e para trás .
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
