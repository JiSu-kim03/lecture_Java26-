package start;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 
		 System.out.print((num%2 == 0)? "짝수" : "홀수");
		
		
	}

}
