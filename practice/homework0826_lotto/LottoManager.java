package homework0826_lotto;

import java.util.Scanner;

public class LottoManager {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		String lottoNumber = lotto.getNumbers();
		
		System.out.printf("LOTTO NUMBER IS : %s%n",lottoNumber);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("TYPE YOUR NUMBER (6 digit from 1 to 45) : ");
		
		int[] my_numbers = new int[Lotto.total];
		
		for (int i = 0; i < my_numbers.length; i++) {
			my_numbers[i] = scan.nextInt();			
		}
		
		lotto.wonCheck(my_numbers);
			
		
		
	}


}
