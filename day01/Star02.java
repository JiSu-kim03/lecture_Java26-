package start;

public class Star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		
		for (int i = 1; i <=5; i++) {
			
			//i번째 줄에 num - i + 1개(5, 4, 3, 2, 1)만큼 별을 출력
			for(int j =1; j <=num-i+1; j++) {
				System.out.println("*");
			}
			
			System.out.println();
		}
		
		
	}

}
