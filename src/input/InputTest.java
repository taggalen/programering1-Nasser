package input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		
		
		String name =	inputScanner.nextLine();
		
		System.out.println("hello " + name);
	
		
		System.out.println("enter your age (5<age<120):");
            
		int age = inputScanner.nextInt();
		

		if (age > 120) {
		System.out.println("you lying piece of shit!!!!");
		} else if (age < 5) {
			System.out.println("you must be older!!!!");
			System.exit(0);
			
		}else {
			 System.out.println("so your age is:" + age);
			
	}
            
          
            
            System.out.print("enter your weight:  ");
            
            double weight = inputScanner.nextDouble();
            
            System.out.println("so your weight is:" + weight);
           
            
	}

}
