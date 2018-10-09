package persistance;

import model.Car;

public interface DAO {

	public void create(Car c);

	public Car findById(Long id);

	public void update(Car c) ;

	public void delete(Car c);

}
