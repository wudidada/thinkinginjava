package chapter6;

public class ConnectionManager {
	static int howManyLeft = 3;
	static Connection[] arr = new Connection[3];
	{
		for(Connection x : arr) {
			x = Connection.creatConnection();
		}
	}
	
	public static Connection getConnection() {
		if(howManyLeft > 0) {
			System.out.println("get a Connection");
			return arr[--howManyLeft];
		}else {
			System.out.println("no more Connections");
			return null;
		}
	}
	
	public static void main(String[] args) {
		ConnectionManager cm = new ConnectionManager();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		System.out.println(cm.howManyLeft);
		System.out.println(cm.getConnection());
		System.out.println(cm.howManyLeft);
		
		
		
		
	}
}

class Connection{
	private static int count = 0;
	
	private Connection() {
		System.out.println("Connection()");
	}
	
	public static Connection creatConnection() {
		count++;
		return new Connection();	
	}
	
	public int howMany() {
		return count;
	}
	
	
	
	
}
