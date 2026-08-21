package start;

public class Count {
	
	public static int getCount(int[] numList, int target) {
		int count = 0;
		
		for (int i= 0; i < numList.length; i++) {
			
			if (numList[i] > target) {
				count++;
			}
		}
		
		return count;
	}
	
	
public static void main(String[] args) {
		
		int numList[]= {10, 15, 20, 33};
		int target = 10;
		
		int CountValue = getCount(numList, target);
		
		System.out.println(CountValue);


}

}

