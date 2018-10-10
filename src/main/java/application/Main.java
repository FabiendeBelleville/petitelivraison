package application;

import model.Car;
import model.Engine;
import persistance.DAO;
import persistance.DAOImpl;

public class Main {

	public static void main(String[] args) {

		// DAO
		DAO dao = new DAOImpl();

		// Create
		// Objet
//		Car c = new Car();
//		Engine e = new Engine();
//
//		c.setBrand("BMW");
//		c.setModel("Série 5");
//		e.setPower("192 chx");
//		e.setEnergy("gas");
//		e.setCar(c);
//
//		dao.create(c, e);

		// Find By Id
		// dao.findById(1L);

		// Update
		// mettre le moteur 52chx gaz (id=2) dans la BMW Série 5 (id=3)
		Long idEngine = (long) 2;
		Long idCar = (long) 3;
		dao.update(idEngine, idCar);

		// Delete
		// dao.delete(1L);

	}

}
