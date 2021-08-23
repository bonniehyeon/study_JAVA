package homework0823;

public class Exam2 {
	public static void main(String[] args) {
		double[] nums = { 4.5, 2.3, 5.2, 6.7, 8.9, 1.2 };
		// 1.for
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%.1f%n", nums[i]);
		}

		System.out.println("*******************");

		// 2.for-each
		for (double temp : nums) {
			System.out.printf("%.1f%n", temp);
		}
	}
}
