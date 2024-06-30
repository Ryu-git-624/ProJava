package projava;

public class SwitchSample {

	public static void main(String[] args) {
		int a = 3;
		
		switch(a) {
		case 1 :
		case 2 :
			System.out.println("one or two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default :
			System.out.println("other");
		}
		
		switch(a) {
		case 1,2 -> System.out.println("one or two");
		case 3 -> System.out.println("three");
		default -> System.out.println("other");
		}
		
		System.out.println(
			switch(a) {
			case 1,2 -> "one or two";
			case 3 -> "three";
			default -> "other";
			}
		);
		
		boolean isThree = 
				switch(a)
				{
				case 3 -> true;
				default -> false;
				};
				
		System.out.println(isThree);
		

	}

}
