package soundable;

public class SoundableExample {

    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat()); // 출력: 야옹
        printSound(new Dog()); // 출력: 멍멍
    }

		
	}
