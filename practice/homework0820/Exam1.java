package homework0820;

public class Exam1 {

	public static void main(String[] args) {
		// 주민등록번호 체크 알고리즘 구현하기 - Array
		int[] id = {1,9,1,2,1,7,1,2,3,4,5,6,7};
		
		int check = 0;
		for (int i = 0; i < id.length-1; i++) {
			int multiple = i+2;
			if(multiple>=10) {
				multiple -= 8;
			}
			check += id[i]*multiple;
		}
		check %=11;
		check = 11 - check;
		
		if(check == id[id.length-1]) {
			System.out.println("OK");
		}else {
			System.out.println("ERROR");
		}		
	}
}
