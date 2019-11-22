package structural.adapter;

public class TemperatureAdapterImpl implements TemperatureAdapter {
	private Temperature temp;
	
	public TemperatureAdapterImpl(Temperature t) {
		temp = t;
	}

	@Override
	public int getTemperature() {
		return convertFtoC(temp.getTemperature());
	}
	
	private int convertFtoC(int F) {
		return (int)((F - 32) * (5.0/9.0));
	}
}
