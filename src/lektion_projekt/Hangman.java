package lektion_projekt;

import java.util.Random;
import java.util.Scanner;


public class Hangman {

public static void main(String[] args) {
	
	Scanner jaok = new Scanner(System.in);
	
	Random random = new Random();
	
		String[] guesses = {"absorb", "programming", "abuse", "fizzy" };
	
		boolean ViSpelar = true; 

		while (ViSpelar) {
			
			System.out.println("välkommen här spelar vi hänga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord från guesses och gör om orden till individuella boksäver 
			
			
			int antalGissningar = ord.length;
			
			//gör om bokstäver till '_'
			char[] usrGuess = new char [antalGissningar];
			
			for (int i = 0; i < usrGuess.length; i++ ) {
				
				usrGuess[i] = '_';
			}
				
			
			boolean gissatRätt = false;
			int försök = 0;
			
			while (!gissatRätt && försök !=antalGissningar ) {
				
				System.out.print("Gissningar: ");
				printArray(usrGuess);
				System.out.println("skriv en bokstav:");
				char input = Scanner.nextLine().charAt(0);
				försök++;
				
				
				
				if ( input == '_') {
					
					ViSpelar = false;
					gissatRätt = true;
				} else {
					
					for (int i = 0; i < ord.length; i++ ) {
						
						if(ord[i] == input) {
							
							usrGuess[i] = input;
						}
					}
				
					if (ärOrdetGissat(usrGuess)) {
						
						gissatRätt = true;
						System.out.println("EZ");
					}
				
				}
				
				
			}
			
			if(!gissatRätt) System.out.println("TRAAAASHH");
		}
		
		System.out.println( "Fan vad dålig :)" );
	}	

		public static void printArray (char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				System.out.println(array[i] + " ");
			}
			
		}
	
		
		public static boolean ärOrdetGissat(char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				if (array[i] == '_') {
					
					return false;
				
				}
					return true;
				
				}
				
				
		}
}


