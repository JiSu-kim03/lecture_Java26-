package start;

import java.util.Arrays;

public class SawpArray {
	
	public static int [] swapArray(int numList[]) {
		
		int [] reversed = new int[numList.length];
		
		for (int i =0; i < numList.length; i++) {
			reversed[i] = numList[numList.length - 1 - i];
		}
		
		return reversed;
		
	}
	
public static void main(String[] args) {
		
		int numList[]= {10, 15, 20, 33};

		int [] arr = swapArray(numList);
		
		System.out.println(Arrays.toString(arr));
	
}
}
