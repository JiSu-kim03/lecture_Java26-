package start;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int num = sc.nextInt();
		
		int a = num/500;
		
		int remainder = num%500;
		
		int b = remainder/100;
		
		System.out.println("\n\n동전의 수 >");
		System.out.println("500원짜리 = " + (a+"개"));
		System.out.println("100원짜리 = " + (b+"개"));
		
		
	}
	

}
