package lektion_projekt;

import java.util.Scanner;
import java.util.Random; 
public class GuessTheNumber {

	
	public static void main(String[] args) {
		
		Scanner YEET = new Scanner(System.in);
		
		// genererar ett slumpmessigt  tal
		 Random rand = new Random(); 
		 int randomTal = rand.nextInt(1000);
		 int Gissning = -1;
	
	
		 while (Gissning !=randomTal) {
			 
			 System.out.println("gissa p� ett tal mellan 0-1000");
			 
			 Gissning = YEET.nextInt();
			 
			 if (Gissning>randomTal) {
				 
				 System.out.println("F�r h�gt! f�rs�k igen");
			 }
			 
			 else if (Gissning<randomTal) {
				 
				 System.out.println("F�r l�gt f�rs�k igen");
			 }
			 
			 else if (Gissning==randomTal) {
				 
				 System.out.println("EZ GAME EZ LIFE " +  randomTal );
				 
				 
			 }
		 }
		 
		 
		 
	}
	
	
}
