package lektion_projekt;

import java.util.Random;
import java.util.Scanner;


public class Hangman {

public static void main() {
	
	Scanner jaok = new Scanner(System.in);
	
	Random random = new Random();
	
		String[] guesses = {"absorb", "programming", "abuse", "fizzy" };
	
		boolean ViSpelar = true; 

		while (ViSpelar) {
			
			System.out.println("välkommen här spelar vi hänga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord från guesses och gör om orden till individuella boksäver 
			
			
			int antalGissningar = ord.length;
				
			
			
		}
		
		System.out.println( "Fan vad dålig :)" );
	}	
}
