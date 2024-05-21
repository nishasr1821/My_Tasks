package week3.day2assignments;

public class JavaConnectionClass implements DatabaseConnectionInterface {
	
	@Override
	public void connect() {
		System.out.println("Database connection -> from DatabaseConnectionInterface");
		
	}
	
	@Override
	public void disconnect() {
		System.out.println("Database disconnected -> from DatabaseConnectionInterface");
		
	}
	
	@Override
	public void executeUpdate() {
		System.out.println("Database updated -> from DatabaseConnectionInterface");
		
	}
	
	public void alldone() {
		System.out.println("Alldone -> from java connection concrete class");
		
	}
	
	public static void main(String[] args) {
		JavaConnectionClass jc = new JavaConnectionClass();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.alldone();
	}
}
