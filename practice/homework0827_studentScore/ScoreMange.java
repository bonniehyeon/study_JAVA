package homework0827_studentScore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

enum ScoreSystem {
	�л��������, �л�������ȸ, ��ü�л�������ȸ, ���α׷�����
}

public class ScoreMange {

	// hashmap�� value �� key ã��
	public static LinkedList<Integer> getKeyByName(HashMap<Integer, Student> map, String name) {

		LinkedList<Integer> matchedKey = new LinkedList<Integer>();

		for (Integer key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				matchedKey.add(key);
			}
		}
		return matchedKey;
	}

	// �л� ���� ���
	public static void calcRank(HashMap<Integer, Student> map) {
		ArrayList<Double> avgScores = new ArrayList<Double>();

		for (Integer i : map.keySet()) {
			avgScores.add(map.get(i).getAvgScore());
		}

		for (Integer i : map.keySet()) {
			int rank = 1;
			double nowAvgscores = map.get(i).getAvgScore();
			for (double avgscores : avgScores) {
				if (nowAvgscores < avgscores) {
					rank += 1;
				}
			}
			map.get(i).setRank(rank);
		}

	}

	public static void main(String[] args) {

		HashMap<Integer, Student> scoreMaps = new HashMap<Integer, Student>();

		Scanner scan = new Scanner(System.in);

		outer: while (true) {
			System.out.print("----- ���������ý���-----\n" + "1. �л��������\n" + "2. �л�������ȸ\n" + "3. ��ü�л�������ȸ\n" + "4. ���α׷� ����\n"
					+ "�׸��� �����ϼ���.");
			int useChoice = Integer.parseInt(scan.nextLine());
			ScoreSystem choice = ScoreSystem.values()[useChoice - 1];
			System.out.println("-----------------------------------");

			switch (choice) {
			case �л��������:
				System.out.println("1. �л��������");

				System.out.print("��ȣ : ");
				int num = Integer.parseInt(scan.nextLine());

				System.out.print("�̸� : ");
				String name = scan.nextLine();

				System.out.print("���� : ");
				int scoreKor = Integer.parseInt(scan.nextLine());

				System.out.print("���� : ");
				int scoreEng = Integer.parseInt(scan.nextLine());

				System.out.print("���� : ");
				int scoreMat = Integer.parseInt(scan.nextLine());
				Student student = null;
				
				try {
					student = new Student(num, name, scoreKor, scoreEng, scoreMat);
					scoreMaps.put(student.getNumber(), student);
					calcRank(scoreMaps);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		

				break;
			case �л�������ȸ:
				System.out.println("2. �л�������ȸ");
				System.out.print("��ȣ(1) �� �̸�(2) �� �������� �˻��ұ��? : ");
				int searchType = Integer.parseInt(scan.nextLine());

				if (searchType == 1) {
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					int searchNum = Integer.parseInt(scan.nextLine());
					if (scoreMaps.get(searchNum) != null) {
						scoreMaps.get(searchNum).printScoreV();
					} else {
						System.out.println("!�˸�! ���� �л� ��ȣ �Դϴ�.");
					}

				} else if (searchType == 2) {
					System.out.print("�̸��� �Է��ϼ��� : ");
					String searchName = scan.nextLine();
					LinkedList<Integer> matchedNum = getKeyByName(scoreMaps, searchName);
					if (!matchedNum.isEmpty()) {
						for (int i : matchedNum) {
							scoreMaps.get(i).printScoreV();
						}
					} else {
						System.out.println("!�˸�! ���� �л� �̸� �Դϴ�.");
					}

				} else {
					System.out.println("1 Ȥ�� 2�� �Է��ϼ���.");
					break;
				}

				break;
			case ��ü�л�������ȸ:
				System.out.println("3. ��ü�л�������ȸ");
				System.out.println("��ȣ �̸� ���� ���� ���� ���� ��� ����");
				System.out.println("===============================================");
				for (Integer i : scoreMaps.keySet()) {
					scoreMaps.get(i).printScoreH();
				}

				break;
			case ���α׷�����:

				break outer;

			default:
				break;
			}
		}
	}
}
