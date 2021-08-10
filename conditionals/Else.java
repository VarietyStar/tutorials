package conditionals;
public class Else {
	public static void main(String[] args) {
		/*
		Change the variables in the first section,
		so that each if statement resolves as true.
        
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b; True
        boolean b2 = d.equals(b + "!"); False
        boolean b3 = !c.equals(a); False

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    		
		output = nothing
	    */
		
		String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
	}
}
