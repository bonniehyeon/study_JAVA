package javaProject;

public class CarTest6 {

	public static void main(String[] args) {
		Car car1= new Car("소나타","흰색",1,60);
		car1.print();
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		car1.setName("SONATA");
		System.out.printf("car1's name now : %s%n", car1.getName());
		car1.setColor("검은색");
		System.out.printf("car1's color now : %s%n", car1.getColor());
		car1.accelerate();
		System.out.printf("car1's speed now : %d%n", car1.getSpeed());
		car1.decelerate();
		System.out.printf("car1's speed now : %d%n", car1.getSpeed());
		car1.setSpeed(100);
		System.out.printf("car1's speed now : %d%n", car1.getSpeed());
		car1.turnLeft();
		System.out.printf("car1's direction now : %d%n", car1.getDirection());
		car1.turnRight();
		System.out.printf("car1's direction now : %d%n", car1.getDirection());
		car1.setDirection(0);
		System.out.printf("car1's direction now : %d%n", car1.getDirection());

		
	}
}
