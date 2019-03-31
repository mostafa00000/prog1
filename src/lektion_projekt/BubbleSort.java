package lektion_projekt;

public class BubbleSort {

	
	
   public static void sort(int[] array) {
	

	   
	   
	for (int i = 0; i < array.length-1; i++) {
		if (array[1] < array [i+1]) {
			
			int temp = array[i+1];
			array[i+1] = array [i];
			array [i] = temp;
		}
		
		
	}
   
   
   }
	
	
}	
