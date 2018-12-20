package chapter5;

class Door{
	boolean open;
	
	Door(){
		open = false;
		System.out.println("creat a door:");
	}
	
	Door(boolean bool){
		open = bool;
		System.out.println("creat a door:");
	}
	
	void openDoor() {
		open = true;
	}
	
	protected void finalize() {
		if(open) {
			System.out.println("door is closed by finalize()!");
		}
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Door a = new Door();
		a.openDoor();
		Door b = new Door(true);
		System.gc();
	}
}
