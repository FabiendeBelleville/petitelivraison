package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Engine;
import model.Car;

public class Create {

	public static void main(String[] args) {

		System.out.println("Hello you !");

		System.out.println("***************************************************************");
		System.out.println("***************************************************************");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			System.out.println("try");
			txn.begin();
			Car c = new Car();
			Engine a = new Engine();
			c.setFirstName("Roger");
			c.setLastName("Nik");
			a.setStreet("Folie-R");
			a.setNumber("32 bis");
			a.setZipcode("75001");
			a.setTown("Paris");
			c.setAddress(a);
			em.persist(c);
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
