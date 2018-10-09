package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Person;

public class FindPersonAddress {

	public static void main(String[] args) {

		System.out.println("Hello you !");

		System.out.println("***************************************************************");
		System.out.println("***************************************************************");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tablefabien2");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			System.out.println("try");
			txn.begin();
			Person findPerson = em.find(Person.class, 1L);
			// M�me si on est juste en find, il met � jour l'objet dans la base car il
			// surveille l'objet
			findPerson.setFirstName("Laurence");
			System.out.println(findPerson);

			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

}
