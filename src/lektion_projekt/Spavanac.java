package lektion_projekt;

import java.util.Scanner;

public class Spavanac {

    public static void main(String[] args) throws Exception{
    	Scanner input = new Scanner(System.in);
                
            int hour = input.nextInt();
            int min = input.nextInt();
            if(min<45){
                if(hour<1){
                    System.out.println(23+" "+(min+15));
                }else{
                    System.out.println((hour-1)+" "+(min+15));
                }
            }else{
                System.out.println(hour+" "+(min-45));
            }
        }
    }

		
		
		
		
	
	
	

