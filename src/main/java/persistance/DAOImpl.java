package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Car;
import model.Engine;

public class DAOImpl implements DAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();

	public void create(Car c) {
		try {
			txn.begin();

			em.persist(c);
			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}

	@Override
	public Car findById(Long id) {
		try {
			txn.begin();
			Car c = em.find(Car.class, id);
			// Même si on est juste en find, il met à jour l'objet dans la base car il
			// surveille l'objet
			System.out.println(c);
			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return null;
	}

	@Override
	public void update(Car c) {
		try {
			txn.begin();
			Car c0 = em.find(Car.class, 1L);
			c0 = c;
			// Même si on est juste en find, il met à jour l'objet dans la base car il
			// surveille l'objet

			System.out.println(c);

			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	@Override
	public void delete(Long id) {
		try {
			txn.begin();
			Car c = em.find(Car.class, id);
			em.remove(c);
			txn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}
