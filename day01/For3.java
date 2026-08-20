package start;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		System.out.println("[ 구구단" + num + "단" + "]");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "X" + i + "=" + (num* i));
			
		}
		
	}

}
