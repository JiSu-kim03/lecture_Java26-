package start;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			// 3. 팩토리얼 결과를 저장할 변수 (곱셈의 기본값인 1로 초기화)
	        long factorial = 1;
	        
	        for (int i = 1; i<=num; i++) {
	        	
	        	factorial = factorial * i; // factorial *= i; 와 동일
	        }
			
			System.out.println(num + "!" + "=" + factorial);
	}

}
