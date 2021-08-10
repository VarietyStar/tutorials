package arrays;
public class Array {
    public static void main(String[] args) {
    	int[] arr;
    	arr = new int[10];
    	System.out.println(arr.length);
    	
    	arr[0] = 4;
    	arr[1] = arr[0] + 5;
    	
    	int[] arr2 = new int[5];
    	//accesses and sets the first element
    	arr2[0] = 4;
    	
    	int[] arr3 = {1, 2, 3, 4, 5};
    	System.out.println(arr3);
    	//(variable, conditional, increment)
    	for (int i=0; i < arr3.length; i++) {
    	    System.out.println(arr3[i]);
    	}
    }
}
