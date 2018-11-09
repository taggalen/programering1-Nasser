package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		int[] intArray = new int[4];
		
		  System.out.println(intArray[0]);
		   intArray[0] = 215;
		   intArray[1] = 548;
		   intArray[2] = 4547;
		   intArray[3] = 458;
		  System.out.println(intArray[0]);
		  System.out.println(intArray[1]);
		  
		  int[] intArray2 = { 215, 548, 4547, 458 };
		  System.out.println(intArray2[0]);
		  System.out.println(intArray2[1]);
		
		//Arraylist
		ArrayList arraylist = new ArrayList();
        arraylist.add(1234);
        arraylist.add(13);
        arraylist.add(125);
        
        
        
        
	
         System.out.println("Size: " + arraylist);	
         System.out.println("get: " + arraylist);	
         
	
	} 

}
