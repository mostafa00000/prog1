package vecka_36;
import java.util.Scanner;
public class vilkor {

	public static void main(String[] arg) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in 10 heltal");
		
		int t1 = input.nextInt();
		int min = t1;
		int max = t1;
		
		int t2 = input.nextInt();
		
		if (t2 > max ) {
			max = t2; 
		}		
		if (t2 < min) {
			min = t2;
		}
		int t3 = input.nextInt();
		
		if (t3 > max ) {
			max = t3; 
		}		
		if (t3 < min) {
			min = t3;
		}
		
		int t4 = input.nextInt();
		
		
		if (t4 > max ) {
			max = t4; 
		}		
		if (t4 < min) {
			min = t4;
		}
		
		int t5 = input.nextInt();
		
		
		if (t5 > max ) {
			max = t5; 
		}		
		if (t5 < min) {
			min = t5;
		}
		
		int t6 = input.nextInt();
		
		
		if (t6 > max ) {
			max = t6; 
		}		
		if (t6 < min) {
			min = t6;
		}
		
		int t7 = input.nextInt();
		
		if (t7 > max ) {
			max = t7; 
		}		
		if (t7 < min) {
			min = t7;
		}
		
		int t8 = input.nextInt();
		
		if (t8 > max ) {
			max = t8; 
		}		
		if (t8 < min) {
			min = t8;
		}
		
		int t9 = input.nextInt();
		
		if (t9 > max ) {
			max = t9; 
		}		
		if (t9 < min) {
			min = t9;
		}
		
		int t10 = input.nextInt();
		
		if (t10 > max ) {
			max = t10; 
		}		
		if (t10 < min) {
			min = t10;
		}
	
          double summa = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9; 
	
	System.out.println("maxtal: " + max);
	System.out.println("mintal: " + min);
    System.out.println("medeltal: " + summa / 10);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// crt+c ctrl+v
}