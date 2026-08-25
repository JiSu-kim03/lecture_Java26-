package countableInterface;

//Countable 인터페이스를 구현.
public class Bird implements Countable {
 protected String name; 
 protected int num;     

 // 생성자
 public Bird(String name, int num) {
     this.name = name;
     this.num = num;
 }

 // interface의 count() 메서드 오버라이딩 
 @Override
 public void count() {
     System.out.println(name + "가 " + num + "마리 있다.");
 }

 // Bird 클래스 전용 메서드
 public void fly() {
     System.out.println(num + "마리 " + name + "가 날아간 다.");
 }
}