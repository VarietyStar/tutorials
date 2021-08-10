package arrays;
public class ArrayS {
    public static void main(String[] args) {
        /*
    	Prompt: Change the values in numbers so it will not raise an error.
    	
    	int[] numbers = {1, 2, 3};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    	
    	output = Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	    at Main.main(fourS.java:7)
    	*/
    	
    	int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length-1] = 'y';
        System.out.println("Done!");
    }
}
