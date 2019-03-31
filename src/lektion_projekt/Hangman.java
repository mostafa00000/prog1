package lektion_projekt;

import java.util.Random;
import java.util.Scanner;


public class Hangman {

public static void main(String[] args) {
	
	Scanner jaok = new Scanner(System.in);
	
	Random random = new Random();
		
		/**
		 * 
		 * orden som man kan gissa p�
		 * 		 
		 */
		String[] guesses = {"absorb", "programming", "abuse", "fizzy" };
		
		/**
		 * 
		 * om spelet �r ig�ng
		 * 
		 */
		boolean ViSpelar = true; 

		/**
		 * 
		 * denh�r while loopen tar ett ord fr�n guesses och g�r om de f�n en string till en char
		 * 
		 */
		while (ViSpelar) {
			
			System.out.println("");
			System.out.println("v�lkommen h�r spelar vi h�nga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord fr�n guesses och g�r om orden till individuella boks�ver 
			
			/**
			 * 
			 * antal gissningar du har blir l�ngden av ordet 
			 * 
			 */
			int antalGissningar = ord.length;
			
			
			char[] usrGuess = new char [antalGissningar];
			
			
			/**
			 * 
			 *g�r om bokst�ver till _ s� att man inte ser ordet du ska gissa p�
			 * 
			 */
			for (int i = 0; i < usrGuess.length; i++ ) {
				
				usrGuess[i] = '_';
				
			
			}
				
			
			boolean gissatR�tt = false;
			int f�rs�k = 0;
			/**
			 * 
			 * l�ter spelaren gissa p� en bokstav och kollar om ordet �r r�tt
			 * Om du skriver in fler �n en eller ingen bokstav so d�r inte programmet
			 * och n�r du gissat fel s� f�rlorat du f�rs�k
			 * 
			 */
			while (!gissatR�tt && f�rs�k !=antalGissningar ) {
				
				System.out.print("Gissningar: ");
				printArray(usrGuess);
				System.out.printf("skriv en bokstav:");
				char input = 0;
				boolean correct = false;
				while(!correct)
				try {
					input = jaok.nextLine().charAt(0);
					correct = true;
				} catch (Exception e) {
					
				}
				f�rs�k++;
				
				/**
				 * 
				 * h�r kan man ge upp genom att skriva "_"
				 * och om du gissar r�tt omvandlar den _ till r�tt bokstav 
				 * och du f�rlorar inte f�rs�k om du gissar r�tt
				 * 
				 */
				
				if ( input == '_') {
					
					ViSpelar = false;
					gissatR�tt = true;
				} else {
					
					for (int i = 0; i < ord.length; i++ ) {
						
						if(ord[i] == input) {
							
							usrGuess[i] = input;
							f�rs�k --;
						}
					}
				
					
					/**
					 * 
					 * h�r kollar programmet om ordet �r gissat och om du har gissat s� vinner du och speleet skriver ut "EZ"
					 * 
					 */
					
					if (�rOrdetGissat(usrGuess)) {
						
						gissatR�tt = true;
						System.out.println("EZ");
					}
				
				}
				
				
			}
			
			/**
			 * 
			 * om du har slut p� f�rs�k skriver spelet ut att du f�rlorade
			 * spelet fr�gar ocks� om du vill spela igen
			 * 
			 */
			
			if(!gissatR�tt) System.out.println("TRAAAASHH DU F�RLORADE");
			System.out.println("Vill du spela igen? (ja/nej)");
			String spelaIgen = jaok.nextLine();
			if (spelaIgen.equals("nej")) ViSpelar = false;
			if (spelaIgen.equals("ja")) ViSpelar = true;
			
		}
		
		System.out.println( "Fan vad d�lig 8=)" );
	}	


		/**
		 * 
		 * skriver bara ut usrguess
		 * 
		 * @param array
		 */
		public static void printArray (char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				System.out.print(array[i] + " ");
			}
			
		}
	
		/**
		 * 
		 * kollar om ordet �r gissat genom att se om det finns n�gra understr�ck kvar
		 * 
		 * @param array
		 * @return
		 */
		public static boolean �rOrdetGissat(char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				if (array[i] == '_') 
					
					return false;
				}
				return true;
				
	}
}


