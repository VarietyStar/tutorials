package loops;
public class Loop {
    public static void main(String[] args) {
    	//for loop (variable; condition; increment)
    	// (i += 2) == (i = i + 2) same
    	for (int i = 0; i < 3; i++) {}
    	
    	for (int i = 0; i < 3; i++) 
    	{
    		System.out.println(i);
    	}
    	
    	System.out.println();
    	
    	//while loop (condition)
    	int k = 5;
    	while (k < 5) {}
    	
    	//do while loop, a while loop that will run at least one time
    	do {} while(k < 5);
    	
    	do
    	{
    		System.out.println("done");
    	}
    	while(k < 5);
    	
    	//limited for loop, acts like a while loop (;condition;)
    	for (;k < 5;) {}
    	
    	//for each loop
    	int[] arr = {2, 0, 1, 3};
    	for (int el : arr) {
    	    System.out.println(el);
    	}
    	//same as
    	for (int i = 0; i < arr.length; i++) {
    	    int el = arr[i];
    	    System.out.println(el);
    	}
    	
    	//explain why I initialized i before the loop
    	int i;
    	for (i = 0; i < 5; i++) {
    	    if (i >= 2) {
    	        break;
    	    }
    	    System.out.println("Yuhu");
    	    
    	    if (i >= 1)
        		continue;
    		System.out.println("Tata");
    	    
    	}
    	System.out.println(i);
    }
}

/*
break will cause the loop to 
stop and will go immediately to the 
next statement after the loop

continue will stop the current iteration 
and will move to the next one.
*/