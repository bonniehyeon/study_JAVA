package homework0820;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		if (num %2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}

	}

}
