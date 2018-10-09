package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Agence;
import model.Customer;

public class FindCustomer {

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
			Customer findName = em.find(Customer.class, 1L);
			//Même si on est juste en find, il met à jour l'objet dans la base car il surveille l'objet
			findName.setName("Laurence");
			System.out.println(findName);
			Agence findAgence = em.find(Agence.class, 3L);
			System.out.println(findAgence);
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
