package Interfacetest;



public class Testinterface {

	public static void main(String[] args) {
		System.out.println(">>>> 말");
		printDayLife(new Horse("당근"));
		//Animal a = new Horse("당근");
		//printDayLife(a);
	}
	
	static void printDayLife(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}
}
