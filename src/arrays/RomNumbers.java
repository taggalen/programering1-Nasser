package arrays;

import java.util.Scanner;

public class RomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               char[] romNumbers = {'I', 'V', 'X','L', 'C', 'D', 'M'};
               int [] valRomMumbers = {1, 5, 10, 50, 100, 500, 1000};
              
               Scanner scanner = new Scanner(System.in);
               
               while (true) {
               int sum = 0;
               
              
               
               
               String input = scanner.nextLine();
               char[] inputcharArray = input.toCharArray();
               
               if (input.equals("quit")) {
            	   System.out.println("Exiting program!");
            	   break;
               }
                
               for (int i = 0; i < inputcharArray.length; i++) {
            	   //System.out.println(inputcharArray[i]);
            	   for (int j = 0; j < romNumbers.length; j++) {
            		  // System.out.println(romNumbers[j] + ": + i "+ i + ": j =" + j  );
            		   if (inputcharArray[i] == romNumbers[j]) {
            			   //System.out.println("True");
            			   sum += valRomMumbers[j];
            		   }
            	   }
               }
               
               System.out.println("sum =" + sum);
	
	
	
	
	
	
	
	
	}
	}

	
}

