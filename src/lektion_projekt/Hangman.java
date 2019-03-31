package lektion_projekt;

import java.util.Random;
import java.util.Scanner;


public class Hangman {

public static void main(String[] args) {
	
	Scanner jaok = new Scanner(System.in);
	
	Random random = new Random();
		
		/**
		 * 
		 * orden som man kan gissa på
		 * 		 
		 */
		String[] guesses = {"absorb", "programming", "abuse", "fizzy" };
		
		/**
		 * 
		 * om spelet är igång
		 * 
		 */
		boolean ViSpelar = true; 

		/**
		 * 
		 * denhär while loopen tar ett ord från guesses och gör om de fån en string till en char
		 * 
		 */
		while (ViSpelar) {
			
			System.out.println("");
			System.out.println("välkommen här spelar vi hänga gubben");
			char[] ord = guesses [random.nextInt(guesses.length)].toCharArray();// Programmet tar ett ord från guesses och gör om orden till individuella boksäver 
			
			/**
			 * 
			 * antal gissningar du har blir längden av ordet 
			 * 
			 */
			int antalGissningar = ord.length;
			
			
			char[] usrGuess = new char [antalGissningar];
			
			
			/**
			 * 
			 *gör om bokstäver till _ så att man inte ser ordet du ska gissa på
			 * 
			 */
			for (int i = 0; i < usrGuess.length; i++ ) {
				
				usrGuess[i] = '_';
				
			
			}
				
			
			boolean gissatRätt = false;
			int försök = 0;
			/**
			 * 
			 * låter spelaren gissa på en bokstav och kollar om ordet är rätt
			 * Om du skriver in fler än en eller ingen bokstav so dör inte programmet
			 * och när du gissat fel så förlorat du försök
			 * 
			 */
			while (!gissatRätt && försök !=antalGissningar ) {
				
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
				försök++;
				
				/**
				 * 
				 * här kan man ge upp genom att skriva "_"
				 * och om du gissar rätt omvandlar den _ till rätt bokstav 
				 * och du förlorar inte försök om du gissar rätt
				 * 
				 */
				
				if ( input == '_') {
					
					ViSpelar = false;
					gissatRätt = true;
				} else {
					
					for (int i = 0; i < ord.length; i++ ) {
						
						if(ord[i] == input) {
							
							usrGuess[i] = input;
							försök --;
						}
					}
				
					
					/**
					 * 
					 * här kollar programmet om ordet är gissat och om du har gissat så vinner du och speleet skriver ut "EZ"
					 * 
					 */
					
					if (ärOrdetGissat(usrGuess)) {
						
						gissatRätt = true;
						System.out.println("EZ");
					}
				
				}
				
				
			}
			
			/**
			 * 
			 * om du har slut på försök skriver spelet ut att du förlorade
			 * spelet frågar också om du vill spela igen
			 * 
			 */
			
			if(!gissatRätt) System.out.println("TRAAAASHH DU FÖRLORADE");
			System.out.println("Vill du spela igen? (ja/nej)");
			String spelaIgen = jaok.nextLine();
			if (spelaIgen.equals("nej")) ViSpelar = false;
			if (spelaIgen.equals("ja")) ViSpelar = true;
			
		}
		
		System.out.println( "Fan vad dålig 8=)" );
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
		 * kollar om ordet är gissat genom att se om det finns några understräck kvar
		 * 
		 * @param array
		 * @return
		 */
		public static boolean ärOrdetGissat(char[] array) {
			
			
				for (int i = 0; i < array.length; i++ ) {
				
				if (array[i] == '_') 
					
					return false;
				}
				return true;
				
	}
}


