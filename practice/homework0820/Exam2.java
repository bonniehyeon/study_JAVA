package homework0820;

public class Exam2 {

	public static void main(String[] args) {

		int[] id = {1,9,1,2,1,7,1,2,3,4,5,6,7};
		
		int gender_id = id[6];
		
		if(gender_id==1 || gender_id==3) {
			System.out.println("Male");
		}else{
			System.out.println("Female");
		}
	}
}
