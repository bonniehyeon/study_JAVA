package homework0826_lotto;

import java.util.Arrays;

public class Lotto {
	static final int total = 6;
	static final int minRange = 1;
	static final int maxRange = 45;

	private int[] numbers = new int[total];

	public Lotto() {
		setRandomNumber();
	}

	public void setRandomNumber() {
		while (dupleCheck(numbers)) {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = (int) (Math.random() * maxRange) + minRange;
			}
		}

		Selection_Sort.selection_sort(numbers);
	}

	private boolean dupleCheck(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public String getNumbers() {

		return Arrays.toString(numbers).replaceAll("\\[|\\]|\\,", "");
	}

	public void wonCheck(int[] inputNumbers) {

		if (dupleCheck(inputNumbers)) {
			System.out.println("Your number is not valid. Don't type same number");
		} else {

			int count = 0;

			for (int i = 0; i < inputNumbers.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					if (inputNumbers[i] == numbers[j]) {
						count += 1;
					}
				}
			}

			switch (count) {
			case 6:
				System.out.println("축 1등 당첨");
				break;
			case 5:
				System.out.println("축 2등 당첨");
				break;
			case 4:
				System.out.println("축 3등 당첨");
				break;
			default:
				System.out.println("다음 기회를 이용하세요.");
				break;
			}

		}
	}

}
