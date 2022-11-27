package exercicios;

//https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListTeste {

	public static void main(String args[]) {

		ArrayList al = new ArrayList();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// Usamos o iterator para mostrar o conteúdo do ArrayList
		System.out.print("Original contents of al: ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Modify objects being iterated
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}
		
		
		System.out.print("Modified contents of al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.print("Modified list backwards: ");
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}