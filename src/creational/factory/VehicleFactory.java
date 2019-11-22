package creational.factory;

public class VehicleFactory {
	public Vehicle getVehicle(int vehicleClass) {
		switch(vehicleClass) {
		case 0: 	return new SmallCar();
		case 1: 	return new MediumCar();
		case 2:		return new LargeCar();
		default:	return new LargeCar();
		}
	}
}
