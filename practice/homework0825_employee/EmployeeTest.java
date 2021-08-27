package homework0825_employee;

import java.math.BigDecimal;

//사원 클래스 : 추상(abstract) 클래스
abstract class Employee{
	//인스턴스 변수
	String name;
	String dept;

	//생성자 메소드
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	//추상 메소드 -> { } 가 없음 
	public abstract double payCheck();
	
	public String getName() {
		return name;
	}
	
	public void printEmployee() {
		System.out.printf("name : %s%n", name);
		System.out.printf("dept : %s%n", dept);
	}
}

//정규직 사원 클래스 : 구상(concrete) 클래스
class Regular extends Employee{
	//인스턴스 변수
	private String empNo;
	private int yearSalary;
	private double bonusRate;
	
	public Regular(String name, String dept, String empNo, int yearSalary, double bonusRate) {
		super(name, dept);
		this.empNo = empNo;
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;
	}

	@Override
	public double payCheck() {
		double pay =  yearSalary + ((yearSalary/12)*(bonusRate/100));
		BigDecimal obj = new BigDecimal(pay);
		return Double.parseDouble(obj.toString());
	}
		
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("empNo : %s%n", empNo);
		System.out.printf("yearSalary : %d%n", yearSalary);
		System.out.printf("bonusRate : %.1f%n", bonusRate);
	}
}


abstract class NonRegular extends Employee{
	String expireDate;
	int basicPay;
	
	public NonRegular(String name, String dept, String expireDate, int basicPay) {
		super(name, dept);
		this.expireDate = expireDate;
		this.basicPay = basicPay;
	}
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("expireDate : %s%n", expireDate);
		System.out.printf("basicPay : %d%n", basicPay);
	}

}

class Temporary extends NonRegular{
	double payRate;
	int workHours;
	
	public Temporary(String name, String dept, String expireDate, int basicPay, double payRate, int workHours) {
		super(name, dept, expireDate, basicPay);
		this.payRate = payRate;
		this.workHours = workHours;
	}

	@Override
	public double payCheck() {
		double pay = basicPay + payRate*workHours;
		BigDecimal result = new BigDecimal(pay);
		return Double.parseDouble(result.toString());
	} 
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("payRate : %.1f%n", payRate);
		System.out.printf("workHours : %d%n", workHours);
	}
}

class Internship extends NonRegular{
	double payPercent;

	public Internship(String name, String dept, String expireDate, int basicPay, double payPercent) {
		super(name, dept, expireDate, basicPay);
		this.payPercent = payPercent;
	}

	@Override
	public double payCheck() {
		double pay = basicPay*payPercent/100;
		BigDecimal result = new BigDecimal(pay);
		return Double.parseDouble(result.toString());
	}	
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("payPercent : %.1f%n", payPercent);
	}
	
}

public class EmployeeTest {
	
	public static void printPay(Employee temp) {
		double pay = temp.payCheck();
		BigDecimal result = new BigDecimal(pay);
		System.out.printf("****%s's pay is %.1f (만)won.****%n", temp.getName(), Double.parseDouble(result.toString()));
	}
	public static void main(String[] args) {
		Regular reg = new Regular("일길동","인사","1111",5000, 100);
		reg.printEmployee();
		printPay(reg);
		
		
		Temporary temp = new Temporary("이길동","개발","21-10-31",3000, 10,8);
		temp.printEmployee();
		printPay(temp);
		
		Internship intern = new Internship("삼길동","영업","21-12-31",3000, 90);
		intern.printEmployee();
		printPay(intern);
	}

}
