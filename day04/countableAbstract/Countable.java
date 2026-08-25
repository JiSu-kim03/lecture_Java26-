package countableAbstractclass;

public abstract class Countable {
    protected String name; // 자식들이 공통으로 쓸 이름
    protected int num;     // 자식들이 공통으로 쓸 수량

    // 생성자 자식 클래스에서 super(name, num)으로 불러다 씀.
    public Countable(String name, int num) {
        this.name = name;
        this.num = num;
    }

    // 추상 메서드: 자식 클래스에서 구현을 강제함.
    public abstract void count();
}