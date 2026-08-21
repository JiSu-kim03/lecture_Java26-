package start;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int student = sc.nextInt();
		
		//입력받은 학생수의 배열 생성
		
		int[]scores = new int[student];
		
		// 점수 입력 안내 문구 출력
		
		System.out.print(student + "명의 성적: " );
		
		// for문을 사용하여 학생 수만큼 점수를 입력받아 배열에 저장 및 합계 구하기
		
		int sum = 0;
		for(int i = 0; i < student; i++) {
            scores[i] = sc.nextInt(); // 공백 기준으로 점수 입력받기
            sum += scores[i];
        }
				
		// 5. 평균 구하기 (예시 출력 화면의 평균값 '83'에 맞추어 정수 나눗셈 처리)
		
        int average = sum / student;

        // 6. 결과 출력
        
        System.out.println(">> 합계 : " + sum);
        System.out.println(">> 평균 : " + average);
		
	}

}
