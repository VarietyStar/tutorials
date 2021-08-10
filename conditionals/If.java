package conditionals;
public class If {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		boolean t = (a == 4);

		if (t) {
		    System.out.println("It's true!");
		}
		
		if (a == 4) {
		    System.out.println("Ohhh! So a is 4!");
		}
		
		//go to comments at the bottom
		
		if (a == b) {
		    // a and b are equal, let's do something cool
		}
		
		if (a == b) {
		    // We already know this part
		} else {
		    // a and b are not equal... :/
		}
		
		if (a == b) {
		    // We already know this part
		} else if (!(a == b)) {
		    // a and b are not equal... :/
		} 
		
		if (a == b)
		    System.out.println("Another line Wow!");
		else
		    System.out.println("Double rainbow!");
		
		
		int result2 = a == 4 ? 1 : 8;
		//Same thing
		if (a == 4) {
		    result2 = 1;
		} else {
		    result2 = 8;
		}
		System.out.println(result2);
		
		/*
		String a2 = new String("Wow"); 2 different objects
		String b2 = new String("Wow");
		String sameA = a2; 
	
		boolean r1 = a2 == b2;     	 This is false, since a and b are not the same object
		boolean r2 = a2.equals(b2);	 This is true, since a and b are logically equals
		boolean r3 = a2 == sameA;  	 This is true, since a and sameA are really the same object
		*/
	}
}
		/*
		a = 4;
		b = 5; 
		boolean result;
		result = a < b; // true
		result = a > b; // false
		result = a <= 4; // a smaller or equal to 4 - true
		result = b >= 6; // b bigger or equal to 6 - false
		result = a == b; // a equal to b - false
		result = a != b; // a is not equal to b - true
		result = a > b || a < b; // Logical or - true
		result = 3 < a && a < 6; // Logical and - true
		result = !result; // Logical not - false
		*/
