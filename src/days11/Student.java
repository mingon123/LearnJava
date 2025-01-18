package days11;

public class Student {
	
	// 필드
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	// 메서드 
	public String getStudentInfo() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d"					
					, name
					, kor, eng, mat, tot
					, avg, rank, wrank);
	}

}
