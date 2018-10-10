package persistance;

import model.Car;
import model.Engine;

public interface DAO {

	public void create(Car c, Engine e);

	public Car findById(Long id);

	public void update(Long idEngine, Long idCar) ;

	public void delete(Long id);

}
