package countableInterface;

//Countable 인터페이스를 구현
public class Tree implements Countable {
 protected String name; // 이름 (사과나무, 밤나무)
 protected int num;     // 그루 수 (10, 7)

 // 생성자
 public Tree(String name, int num) {
     this.name = name;
     this.num = num;
 }

 // interface의 count() 메서드 오버라이딩 
 @Override
 public void count() {
     System.out.println(name + "가 " + num + "그루 있다.");
 }

 // Tree 클래스 전용 메서드
 public void ripen() {
     System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
 }
}