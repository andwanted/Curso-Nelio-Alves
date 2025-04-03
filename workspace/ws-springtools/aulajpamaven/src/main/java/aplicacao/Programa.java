package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa P1 = new Pessoa(null,"Carlos da Silva","carlos@gmail.com");
		Pessoa P2 = new Pessoa(null,"Juca Oliveira","juca@gmail.com");
		Pessoa P3 = new Pessoa(null,"Roberto Souza","roberts@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(P1);
		em.persist(P2);
		em.persist(P3);
		em.getTransaction().commit();		
		
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
	}

}
