package start;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int i =1;
		
		while(i == 1) {
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num%2==0) {
				System.out.println(">>짝수입니다");
						
			}
			
			else { 
				
				System.out.println(">>홀수입니다");
			}
			
			System.out.print("계속하시겠습니까?(0-멈춤/1-계속) : ");
			
			i = sc.nextInt();
			
			
			
		}
		
		
	}

}
