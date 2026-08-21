package start;

import java.util.Scanner;

public class Gugudan {

		public static void printGugudan(int dan) {
			System.out.println("[구구단" + dan + "단 ]");
			for (int i =1; i <=9; i++) {
				System.out.println(dan + "X" + i + "=" + (dan * i));
			}
			
			System.out.println();
		}
		
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("숫자를 입력하세요: ");
	        int inputNum = sc.nextInt();
	        
	        printGugudan(inputNum);
	        
	        System.out.println();
	        
	        for (int i = 2; i <=9; i++) {
	        	printGugudan(i);
	        }
		}
}   