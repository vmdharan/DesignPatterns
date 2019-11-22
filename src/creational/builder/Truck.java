package creational.builder;

public class Truck {

	protected int truckId;
	protected int diesel;
	protected int coolant;
	protected int engineOil;
	
	public static class Builder {
		private int truckId;
		private int diesel;
		private int coolant;
		private int engineOil;
		
		public Builder(int _truckId) {
			truckId = _truckId;
		}
		
		public Builder setDiesel(int _diesel) {
			diesel = _diesel;
			return this;
		}
		
		public Builder setCoolant(int _coolant) {
			coolant = _coolant;
			return this;
		}
		
		public Builder setEngineOil(int _engineOil) {
			engineOil = _engineOil;
			return this;
		}
		
		public Truck build() {
			Truck truck = new Truck();
			truck.truckId = this.truckId;
			truck.diesel = this.diesel;
			truck.coolant = this.coolant;
			truck.engineOil = this.engineOil;
			
			return truck;
		}
	}
	
	private Truck() {
		
	}
	
	public String toString() {
		String result;
		result = "Id: " + truckId 
				+ " Diesel: " + diesel
				+ " Coolant: " + coolant
				+ " EngineOil: " + engineOil;
		return result;
	}
}
