package start;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 10; 
		int b = 25;
		System.out.println("a=" + a);
	     System.out.println("b=" + b); 
		
         int temp = a;
         
         a= b;
         b= temp;
     
     System.out.println("Swapping의 결과>");
     System.out.println("변수 a의 값 =" + a);
     System.out.println("변수 b의 값 =" + b);
	}

}
