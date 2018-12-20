package chapter5;

enum Currency{
	PENNY, NICKEL, DIME, QUARTER, HALF, DOLLAR
}

class Toy{
	Currency price;
	
	Toy(Currency price){
		this.price = price;
	}
	
	void printPrice(){
		switch(price) {
		case PENNY:
			System.out.println("This toy cost a penny");
			break;
		case NICKEL:
			System.out.println("This toy cost a nickel");
			break;
		case DIME:
			System.out.println("This toy cost a dime");
			break;
		case QUARTER:
			System.out.println("This toy cost a quarter");
			break;
		case HALF:
			System.out.println("This toy cost a half");
			break;
		case DOLLAR:
			System.out.println("This toy cost a dollar");
			break;
		default:
			System.out.println("I don't know what you are talking about");
		}
	}
}

public class Money {
	public static void main(String[] args) {
		
		Currency howMuch = Currency.DIME;
		
		System.out.println(howMuch.ordinal());
		
		System.out.println("**************");
		
		for(Currency currency : Currency.values()) {
			System.out.println(currency + ", ordinal " + currency.ordinal());
		}
		
		System.out.println("**************");
		Toy
			bear = new Toy(Currency.DIME),
			goose = new Toy(Currency.HALF),
			panda = new Toy(Currency.DOLLAR);
			
		bear.printPrice();
		goose.printPrice();
		panda.printPrice();
		
		
		
	}
	
}
