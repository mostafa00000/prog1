package lektion_projekt;

import java.util.Scanner;
import java.util.Random; 
public class GuessTheNumber {

	
	public static void main(String[] args) {
		
		Scanner YEET = new Scanner(System.in);
		
		// genererar ett slumpmessigt  tal
		 Random rand = new Random(); 
		 int randomTal = rand.nextInt(100);
		 int Gissning = -1;
		 int AnltalGissningar = 0;
	
	
		 while (Gissning !=randomTal) {
			 
			 System.out.println("gissa på ett tal mellan 0-1000");
			 
			 Gissning = YEET.nextInt();
			 
			 if (Gissning>randomTal) {
				 
				 System.out.println("För högt! försök igen");
				 AnltalGissningar ++;
			 }
			 
			 if (Gissning<randomTal) {
				 
				 System.out.println("För lågt försök igen");
				 AnltalGissningar ++;
			 }
			 
			 if (Gissning==randomTal) {
				 
				 AnltalGissningar ++;
				 System.out.println("EZ GAME EZ LIFE " + "talet:" + randomTal + " " + "antal gissingar:" + AnltalGissningar );
				 
				 
				 
			 }
		
			 if (AnltalGissningar>5) {
				 
				 System.out.println("LMAO YOU TRASH " + "Talet:" + randomTal + AnltalGissningar );
				 
				 
				 break;
			 }
		 
		 }
		 
		 
		 
		 
		 
	}
	
	
}
