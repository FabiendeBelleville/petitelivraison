package application;

import model.Car;
import model.Engine;
import persistance.DAO;
import persistance.DAOImpl;

public class Main {

	public static void main(String[] args) {

		// DAO
		DAO dao = new DAOImpl();

		// Objet
		Car c = new Car();
		Engine e = new Engine();

		// Create
		c.setBrand("Renault");
		c.setModel("Twingo");
		e.setPower("52 chx");
		e.setEnergy("gas");
		c.setEngine(e);

		dao.create(c);

		// Find By Id
		dao.findById(1L);

		// Update
		c.setBrand("BMW");
		dao.update(c);

		// Delete
		dao.delete(1L);

	}

}
