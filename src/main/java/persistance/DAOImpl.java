package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public interface DAOImpl {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("tablefabien2");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction(); 
	
	
	
}
