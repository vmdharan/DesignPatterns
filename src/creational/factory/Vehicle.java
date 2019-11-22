package creational.factory;

public abstract class Vehicle {
	protected double litresPer100Km;
	public abstract void getFuelEconomy();
	
	public double calcularFuelCostPer100Km(double fuelPrice) {
		return (fuelPrice * litresPer100Km);
	}
}
