package javaProject;

// 자동차를 구현한 클래스 

public class Car {
	//필드
	//인스턴스 변수
	private String name;
	private String color;
	private int direction;
	private int speed;
	
	//클래스 변수(static 변수)
	private static String company;

	//클래스 초기화 블록
	static {
//		System.out.println("call static initialize block");
		company = "현대";
	}
	
	//디폴트 생성자 메소드
	public Car() {
		//super();
	}

	//생성자 메소드
	public Car(String name, String color) {
		//super();
		this.name = name;
		this.color = color;
	}

	//생성자 메소드
	public Car(String name, String color, int direction, int speed) {
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
	}
	
	//인스턴스 메소드
	//이름
	public String getName() {
		//System.out.printf("this = %s%n", this);
		return name;		
	}	
	public void setName(String name) {
		this.name = name;		
	}
	//색상
	public String getColor() {
		return color;		
	}
	public void setColor(String color) {
		this.color = color;		
	}
	//속도
	public void accelerate() {
		this.speed++ ;
	}
	public void decelerate() {
		this.speed-- ;
	}
	public int getSpeed() {
		return speed ;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//방향
	public void turnRight() {
		direction = 1 ;
	}
	public void turnLeft() {
		direction = -1 ;
	}
	public int getDirection() {
		return direction ;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
	public void print() {
		System.out.printf("이름 : %s%n", name);
		System.out.printf("색상 : %s%n", color);
		System.out.printf("방향 : %d%n", direction);
		System.out.printf("속도 : %d%n", speed);
		//test();
	}
	
	public static String getCompany() {
		return company;
	}
	
	private void test() {
		System.out.printf("private access modifier method");
		
	}
}
