package start;

public class Max {
	
	public static int getMax(int[] numList) {
		
		int max = numList[0];
		for (int i =1; i <numList.length; i++) {
			if (numList[i] > max) {
				max = numList[i];
			}
		}
		
		return max;
	}

public static void main(String[] args) {
		
		int numList[]= {10, 15, 20, 33};
		
		int MaxValue = getMax(numList);
		
		System.out.println("가장 큰 숫자: " + MaxValue);
	
	
}

}