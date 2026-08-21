package start;

public class Sum {

	public static int getSum(int[] numList) {
		
		int sum =0;
		
		for (int i =0; i < numList.length; i++) {
			sum += numList[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int numList[]= {10, 15, 20, 33};
		
		int SumValue = getSum(numList);
		
		System.out.println("배열의 총합: " + SumValue);
		
		
		
	}
	
}
	
	
	


