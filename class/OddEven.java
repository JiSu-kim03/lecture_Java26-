package start;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num %2==0) {
			System.out.println(">>_짝수입니다");
		}
		
	
		else {
			System.out.println(">>홀수입니다");
		}
		
		
		
	}

}
