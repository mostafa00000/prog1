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
			
			System.out.println("v�lkommen h�r spelar vi h�nga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord fr�n guesses och g�r om orden till individuella boks�ver 
			
			
			int antalGissningar = ord.length;
			
			//g�r om bokst�ver till '_'
			char[] usrGuess = new char [antalGissningar];
			
			for (int i = 0; i < usrGuess.length; i++ ) {
				
				usrGuess[i] = '_';
			}
				
			
			boolean gissatR�tt = false;
			int f�rs�k = 0;
			
			while (!gissatR�tt && f�rs�k !=antalGissningar ) {
				
				System.out.print("Gissningar: ");
				printArray(usrGuess);
				System.out.println("skriv en bokstav:");
				char input = Scanner.nextLine().charAt(0);
				f�rs�k++;
				
				
				
				if ( input == '_') {
					
					ViSpelar = false;
					gissatR�tt = true;
				} else {
					
					for (int i = 0; i < ord.length; i++ ) {
						
						if(ord[i] == input) {
							
							usrGuess[i] = input;
						}
					}
				
					if (�rOrdetGissat(usrGuess)) {
						
						gissatR�tt = true;
						System.out.println("EZ");
					}
				
				}
				
				
			}
			
			if(!gissatR�tt) System.out.println("TRAAAASHH");
		}
		
		System.out.println( "Fan vad d�lig :)" );
	}	

		public static void printArray (char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				System.out.println(array[i] + " ");
			}
			
		}
	
		
		public static boolean �rOrdetGissat(char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				if (array[i] == '_') {
					
					return false;
				
				}
					return true;
				
				}
				
				
		}
}


