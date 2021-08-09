public class Variable {
	public static void main(String[] args) {
		int myNumber;
		myNumber = 5;
		
		int myNumber2 = 5;
		
		System.out.println(myNumber);
		System.out.println(myNumber2);
		
		double d = 4.5;
		float f = (float) 4.5;
		float f2 = 4.5f;
		double myNumber3 = (double) myNumber + 0.5;
		System.out.println(myNumber3);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(f2);
		
		char c = 'g';
		System.out.println(c);
		
		// Create a string with a constructor
		String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
		// Just using "" creates a string, so no need to write it the previous way.
		String s2 = "\nWho who who who!";                         // String literal stored in String pool
		// Java defined the operator + on strings to concatenate:
		String s3 = s1 + s2;
		System.out.println(s3);
		
		int num = 5;
		//Be sure not to use "" with primitives.
		String s = "I have " + (num + num) + " cookies"; 
		System.out.println(s);
		
		boolean b = false;
		b = true;

		boolean toBe = false;
		b = toBe || !toBe;
		if (b) {
		    System.out.println(toBe);
		}

		/*
		int children = 0;
		b = children; Will not work
		if (children) {              
		     
		}
		

		int a;
		boolean b = true; 
		boolean c = false; 
		a = b + c;  The following line will give an error
		System.out.println(a);
		*/
    }
}

/*
byte (number, 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float (float number, 4 bytes)
double (float number, 8 bytes)
char (a character, 2 bytes)
boolean (true or false, 1 byte)
*/
