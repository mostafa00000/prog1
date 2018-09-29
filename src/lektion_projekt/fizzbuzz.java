package lektion_projekt;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int z = input.nextInt();

        for(int i = 1; i <= z; i++){
            if((i%X) == 0 && (i%Y) == 0){
                System.out.println("FizzBuzz");
            }
            else if((i%X) == 0){
                System.out.println("Fizz");
            }
            else if((i%Y) == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }


    }
}
	
	
	
	

