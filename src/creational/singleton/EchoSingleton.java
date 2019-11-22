package creational.singleton;

public class EchoSingleton {
	private static EchoSingleton obj;
	
	private EchoSingleton() {
		
	}
	
	public static EchoSingleton getInstance() {
		if(obj == null) {
			synchronized (EchoSingleton.class) {
				if(obj == null) {
					obj = new EchoSingleton();
				}
			}
		}
		return obj;
	}
	
	public void echo(String msg) {
		System.out.println(msg);
	}
}
