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
			
			System.out.println("v�lkommen h�r spelar vi h�nga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord fr�n guesses och g�r om orden till individuella boks�ver 
			
			
			int antalGissningar = ord.length;
				
			
			
		}
		
		System.out.println( "Fan vad d�lig :)" );
	}	
}
