package Interfacetest;

public class Horse implements Animal {
	private String meal;
	public Horse(String meal) {
		this.meal = meal;
	}
	@Override
	public void eat() {
		System.out.println("먹이로" + meal + "먹는다");

	}

	@Override
	public void move() {
		System.out.println("뛰어다닌다");
	}

	@Override
	public void sleep() {
		System.out.println("서서 잔다");
	}

}
