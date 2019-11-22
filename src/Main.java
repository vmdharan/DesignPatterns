import creational.factory.Vehicle;
import creational.factory.VehicleFactory;
import creational.singleton.EchoSingleton;

public class Main {

	public static void main(String[] args) {
		
		// Singleton
		EchoSingleton es = EchoSingleton.getInstance();
		es.echo("Hello, this is a Singleton");
		EchoSingleton es2 = EchoSingleton.getInstance();
		es2.echo("This is another call to the Singleton\n");
		
		// Factory
		double fuelPrice = 1.35;
		VehicleFactory vf = new VehicleFactory();
		es.echo("Fuel costs per 100km for various cars:");
		
		Vehicle vf1 = vf.getVehicle(0);
		vf1.getFuelEconomy();
		es.echo("Small car: $" + vf1.calcularFuelCostPer100Km(fuelPrice));
		
		Vehicle vf2 = vf.getVehicle(1);
		vf2.getFuelEconomy();
		es.echo("Medium car: $" + vf2.calcularFuelCostPer100Km(fuelPrice));
		
		Vehicle vf3 = vf.getVehicle(2);
		vf3.getFuelEconomy();
		es.echo("Large car: $" + vf3.calcularFuelCostPer100Km(fuelPrice));
		
	}

}
