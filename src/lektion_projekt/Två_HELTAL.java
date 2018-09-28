package lektion_projekt;

import java.util.Scanner;

public class Två_HELTAL {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
        int y = input.nextInt();
        
        input.close();
        
         if(x<y) {
        	 
        	 System.out.println("min " + x);
        	
         }
         else if(y<x) {
        	 
        	System.out.println("min " + y);
        	
         }
         
         else {
        	 
        	 System.out.println("equal" );
         }
      
		
		
		
	}
	
	
	
}
