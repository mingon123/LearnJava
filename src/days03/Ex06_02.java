package days03;

public class Ex06_02 {

	public static void main(String[] args) {
	
	String [] names = new String[13];
	
	names[0] = "윤형식";
	names[1] = "김대원";
	names[2] = "박정원";
	// :
	names[names.length-1] = "양희동"; //마지막순번은 이렇게 나타낼 수 있음
	
	System.out.printf("names[0]=%s \n", names[0]);
	System.out.printf("names[1]=%s \n", names[1]);
	System.out.printf("names[2]=%s \n", names[2]);
	System.out.println(":");
	System.out.printf("names[12]=%s \n", names[12]);
	
	
	}
}
