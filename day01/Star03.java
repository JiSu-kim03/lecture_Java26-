package start;

public class Star03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 5;
		
		for(int i =1; i <=num; i++) {
			
			// 1. 공백 출력하는 for문 (num - i 개)
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // 2. 별 출력하는 for문 (i 개)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // 3. 한 줄 출력이 끝난 후 줄바꿈
            System.out.println();
		}
	}

}
