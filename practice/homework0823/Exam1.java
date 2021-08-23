package homework0823;

public class Exam1 {
	public static void main(String[] args) {
		int[][] scores = {{100, 90, 90},{85, 90, 80},{50, 50, 60},{75, 90, 80},{100, 90, 60}};
		
		//1.for
		for (int i = 0; i < scores.length; i++) {
			int total_score = 0;
			for (int j = 0; j < scores[i].length; j++) {
				total_score += scores[i][j];
			}
			System.out.printf("%d ��° �л��� ������ %d, ����� %.1f �Դϴ�.%n", i+1, total_score, (double)total_score/3 );
		}
		
		System.out.println("*******************");
		
		//2.for-each
		for (int i = 0; i < scores.length; i++) {
			int total_score = 0;
			for (int temp : scores[i]) {
				total_score += temp;
			}
			System.out.printf("%d ��° �л��� ������ %d, ����� %.1f �Դϴ�.%n", i+1, total_score, (double)total_score/3 );
		}
	}

}
