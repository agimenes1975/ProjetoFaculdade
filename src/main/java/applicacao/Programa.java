package applicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Login;
import dominio.Usuario;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dtNasc = sdf.parse("02/08/1975");
		
		Login l1 = new Login( "753x889ba");
		Login l2 = new Login( "999x345");
		Usuario u1 = new Usuario("Angelo Cesar Gimenes", dtNasc, "Administração", "Noturno" );
		Usuario u2 = new Usuario( "Luiz Claudio Gimenes", dtNasc, "Gastronomia", "Noturno");		
		//
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(l1);
		em.persist(l2);
		em.persist(u1);
		em.persist(u2);
		
				
		//Pessoa p = em.find(Pessoa.class, 6);
		//em.remove(p);
		
		
		//System.out.println(p);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Pronto");
		
		
		

	}

}
