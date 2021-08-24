package javaProject;

// �ڵ����� ������ Ŭ���� 

public class Car {
	//�ʵ�
	//�ν��Ͻ� ����
	private String name;
	private String color;
	private int direction;
	private int speed;
	
	//Ŭ���� ����(static ����)
	private static String company;

	//Ŭ���� �ʱ�ȭ ���
	static {
//		System.out.println("call static initialize block");
		company = "����";
	}
	
	//����Ʈ ������ �޼ҵ�
	public Car() {
		//super();
	}

	//������ �޼ҵ�
	public Car(String name, String color) {
		//super();
		this.name = name;
		this.color = color;
	}

	//������ �޼ҵ�
	public Car(String name, String color, int direction, int speed) {
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
	}
	
	//�ν��Ͻ� �޼ҵ�
	//�̸�
	public String getName() {
		//System.out.printf("this = %s%n", this);
		return name;		
	}	
	public void setName(String name) {
		this.name = name;		
	}
	//����
	public String getColor() {
		return color;		
	}
	public void setColor(String color) {
		this.color = color;		
	}
	//�ӵ�
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
	//����
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
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %s%n", color);
		System.out.printf("���� : %d%n", direction);
		System.out.printf("�ӵ� : %d%n", speed);
		//test();
	}
	
	public static String getCompany() {
		return company;
	}
	
	private void test() {
		System.out.printf("private access modifier method");
		
	}
}
