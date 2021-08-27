package homework0827_studentScore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

enum ScoreSystem {
	학생성적등록, 학생성적조회, 전체학생성적조회, 프로그램종료
}

public class ScoreMange {

	// hashmap에 value 로 key 찾기
	public static LinkedList<Integer> getKeyByName(HashMap<Integer, Student> map, String name) {

		LinkedList<Integer> matchedKey = new LinkedList<Integer>();

		for (Integer key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				matchedKey.add(key);
			}
		}
		return matchedKey;
	}

	// 학생 순위 계산
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
			System.out.print("----- 성적관리시스템-----\n" + "1. 학생성적등록\n" + "2. 학생성적조회\n" + "3. 전체학생성적조회\n" + "4. 프로그램 종료\n"
					+ "항목을 선택하세요.");
			int useChoice = Integer.parseInt(scan.nextLine());
			ScoreSystem choice = ScoreSystem.values()[useChoice - 1];
			System.out.println("-----------------------------------");

			switch (choice) {
			case 학생성적등록:
				System.out.println("1. 학생성적등록");

				System.out.print("번호 : ");
				int num = Integer.parseInt(scan.nextLine());

				System.out.print("이름 : ");
				String name = scan.nextLine();

				System.out.print("국어 : ");
				int scoreKor = Integer.parseInt(scan.nextLine());

				System.out.print("영어 : ");
				int scoreEng = Integer.parseInt(scan.nextLine());

				System.out.print("수학 : ");
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
			case 학생성적조회:
				System.out.println("2. 학생성적조회");
				System.out.print("번호(1) 와 이름(2) 중 무엇으로 검색할까요? : ");
				int searchType = Integer.parseInt(scan.nextLine());

				if (searchType == 1) {
					System.out.print("번호를 입력하세요 : ");
					int searchNum = Integer.parseInt(scan.nextLine());
					if (scoreMaps.get(searchNum) != null) {
						scoreMaps.get(searchNum).printScoreV();
					} else {
						System.out.println("!알림! 없는 학생 번호 입니다.");
					}

				} else if (searchType == 2) {
					System.out.print("이름을 입력하세요 : ");
					String searchName = scan.nextLine();
					LinkedList<Integer> matchedNum = getKeyByName(scoreMaps, searchName);
					if (!matchedNum.isEmpty()) {
						for (int i : matchedNum) {
							scoreMaps.get(i).printScoreV();
						}
					} else {
						System.out.println("!알림! 없는 학생 이름 입니다.");
					}

				} else {
					System.out.println("1 혹은 2를 입력하세요.");
					break;
				}

				break;
			case 전체학생성적조회:
				System.out.println("3. 전체학생성적조회");
				System.out.println("번호 이름 국어 수학 영어 총점 평균 순위");
				System.out.println("===============================================");
				for (Integer i : scoreMaps.keySet()) {
					scoreMaps.get(i).printScoreH();
				}

				break;
			case 프로그램종료:

				break outer;

			default:
				break;
			}
		}
	}
}
