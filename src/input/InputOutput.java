package input;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		
		int heltal = 75;
		
		
		byte minByte = (byte) 192;
		
		 // Olika primitiva datatyper
		 //double, int, short ,long, boolean
		 //float -::-
		 //char, byte
		 
		System.out.println("Mata in heltal: ");
		
		Scanner scanner = new Scanner(System.in);
		heltal = scanner.nextInt();
		System.out.println("du skrev: " + heltal);
		
		String mittNamn;
		System.out.println("Mata in ditt namn: ");
		mittNamn = scanner.nextLine();
				
	}

}
