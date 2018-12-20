package chapter4;

public class VowersAndConsonants {
	public static void main(String[] args) {
		char c = 'a';
		
		for(; c <= 'z'; c++) {
			System.out.print(c + " : ");
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("vowel"); break;
			case 'y':
			case 'w':System.out.println("sometimes a vowel"); break;
			
			default:System.out.println("consonats");
			
			}
		}
	}
}
