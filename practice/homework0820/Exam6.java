package homework0820;

public class Exam6 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i+=2) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		int j = 1;
		while(j<100) {
			System.out.print(j+ "\t");
			j+=2;
		}
		
		System.out.println();
		
		int k = 1;
		do {
			System.out.print(k+ "\t");
			k+=2;
		}while(k<100);	
	}
}
