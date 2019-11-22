import creational.singleton.EchoSingleton;

public class Main {

	public static void main(String[] args) {
		
		// Singleton
		EchoSingleton es = EchoSingleton.getInstance();
		es.echo("Hello, this is a Singleton");
		EchoSingleton es2 = EchoSingleton.getInstance();
		es2.echo("This is another call to the Singleton");
	}

}
