package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Car;

public class Delete {

	public static void main(String[] args) {

		System.out.println("Hello you !");
		System.out.println("How are-u doing dud?");
		System.out.println("Let start the program !!! Go ! Go !");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tablefabien2");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			System.out.println("try");
			txn.begin();
			Car c = em.find(Car.class, 3L);
			em.remove(c);
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
