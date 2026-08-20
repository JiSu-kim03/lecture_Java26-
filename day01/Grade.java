package start;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		
		int num = sc.nextInt();
		
		if (num >= 90) {
			System.out.println(">>_등급은 A입니다.");
		}
		
		else if (num >=80) {
			System.out.println(">>_등급은 B입니다.");
		}
		
		else if (num >=70) {
			System.out.println(">>_등급은 C입니다.");
		}
		
		else if (num >=60) {
			System.out.println(">>_등급은 D입니다.");
		} 
		
		else {
			System.out.println(">>_등급은 F입니다.");
		}
	}
	

}
