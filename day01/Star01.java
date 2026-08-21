package start;

public class Star01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int num = 5;
		//// 바깥쪽 for문: 줄 수 (1줄 ~ 5줄)
		for (int i =1; i <=5; i++) {
            
			//// 안쪽 for문: 각 줄에 찍을 별 개수 (i개만큼)
			for (int j =1; j <=i; j++) {
            		  System.out.print("*");
            	  }
			
			//// 한 줄 출력이 끝난 후 줄바꿈
            	  System.out.println(); 
              }
              
        
		        }
		    }
		
	
