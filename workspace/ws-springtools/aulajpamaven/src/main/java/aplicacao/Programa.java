package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa P1 = new Pessoa(1,"Carlos da Silva","carlos@gmail.com");
		Pessoa P2 = new Pessoa(2,"Juca Oliveira","juca@gmail.com");
		Pessoa P3 = new Pessoa(3,"Roberto Souza","roberts@gmail.com");
		
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
	}

}
