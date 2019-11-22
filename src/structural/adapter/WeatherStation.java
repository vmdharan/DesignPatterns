package structural.adapter;

public class WeatherStation implements Temperature {
	private int temp;
	
	public WeatherStation(int t) {
		temp = t;
	}
	
	@Override
	public int getTemperature() {
		return temp;
	}
}
