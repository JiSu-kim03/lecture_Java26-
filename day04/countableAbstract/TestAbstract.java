package countableAbstractclass;

public class TestAbstract {

    public static void main(String[] args) {

        // 추상 클래스 Countable 타입의 배열 생성
        Countable[] list = {
            new Bird("뻐꾸기", 5),
            new Bird("독수리", 2),
            new Tree("사과나무", 10),
            new Tree("밤나무", 7)
        };

        // 1. count() 실행
        for (Countable obj : list) {
            obj.count();
        }

        System.out.println();

        // 2. 타입 확인 후 전용 메서드 실행
        for (Countable obj : list) {
            if (obj instanceof Bird) {
                ((Bird) obj).fly();
            } else if (obj instanceof Tree) {
                ((Tree) obj).ripen();
            }
        }
    }
}