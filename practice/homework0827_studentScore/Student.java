package homework0827_studentScore;

public class Student {
	private int number;
	private String name;
	private int scoreKor;
	private int scoreEng;
	private int scoreMat;
	private double avgScore;
	private int rank;
	
	public Student(int number, String name, int scoreKor, int scoreEng, int scoreMat) throws Exception {
		
		if (scoreKor<0 | scoreEng<0 | scoreMat<0 ) {
			throw new Exception("������ �� �� �Է��߽��ϴ�.");
		}
		this.number = number;
		this.name = name;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMat = scoreMat;
		this.avgScore = (scoreKor + scoreEng + scoreMat)/3;
		
	}

	
	public void printScoreV() {
		System.out.printf("��ȣ : %d%n",number);
		System.out.printf("�̸� : %s%n",name);
		System.out.printf("���� : %d%n",scoreKor);
		System.out.printf("���� : %d%n",scoreEng);
		System.out.printf("���� : %d%n",scoreMat);
		System.out.printf("���� : %d%n",scoreKor+scoreEng+scoreMat);
		System.out.printf("��� : %.1f%n",avgScore);
		System.out.printf("���� : %d%n",rank);
	}
	
	public void printScoreH() {
		System.out.printf("%d %s %d %d %d %d %.1f %d %n",number, name,scoreKor,scoreEng,scoreMat,scoreKor+scoreEng+scoreMat,avgScore,rank);
	}
	
	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScoreKor() {
		return scoreKor;
	}



	public void setScoreKor(int scoreKor) {
		this.scoreKor = scoreKor;
	}



	public int getScoreMat() {
		return scoreMat;
	}



	public void setScoreMat(int scoreMat) {
		this.scoreMat = scoreMat;
	}



	public double getAvgScore() {
		return avgScore;
	}



	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}



	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public int hashCode() {		
		return Integer.valueOf(number).hashCode() 
				+ name.hashCode();  
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;		
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		
		return true;
	}



	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", scoreKor=" + scoreKor + ", scoreEng=" + scoreEng
				+ ", scoreMat=" + scoreMat + ", avgScore=" + avgScore + ", rank=" + rank + "]";
	}
	

		
}
