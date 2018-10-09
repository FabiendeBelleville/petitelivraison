package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Car;

public class Update {

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
			Car findPerson = em.find(Car.class, 1L);
			// Même si on est juste en find, il met à jour l'objet dans la base car il
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
