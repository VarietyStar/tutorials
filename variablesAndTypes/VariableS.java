package variablesAndTypes;
public class VariableS {
    public static void main(String[] args) {
        /*
    	Prompt:Create all of the primitives (except long and double) 
    	with different values. Concatenate them into a string and 
    	print it to the screen so it will 
    	print: H3110 w0r1d 2.0 true
    	
    	byte zero = 0;
        String output = "W" + zero + "w";
        System.out.println(output); output = W0w
        */
    	byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);
    }
}
