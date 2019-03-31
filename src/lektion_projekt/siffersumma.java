package lektion_projekt;

import java.util.Scanner;

public class siffersumma {

	public static void main(String[] args) {
		
			
		Scanner input = new Scanner(System.in);
		
		
		int tal = input.nextInt();
		int summa = 0;
		
		while(tal != 0) {
			
			int ental = tal % 10;
			summa = summa + ental % 10;
			 tal = tal - ental % 10;
			 tal = tal/10;
			 
		}
		
		System.out.println(summa);
		
	}
	
}