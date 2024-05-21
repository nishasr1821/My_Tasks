package week3.day2assignments;

public abstract interface DatabaseConnectionInterface {
	
	public void connect();
	public void disconnect();
	public void executeUpdate();
	
}
