package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//para excluir uma pessoa na tabela, precisa dar um find para que esteja monitorado
		//caso contrario seria destacado
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.remove(p);
		em.getTransaction().commit();
		
		
		System.out.println("Pronto!!");
		
		em.close();
		emf.close();
		
		
		
	}

}
