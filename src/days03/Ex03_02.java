package days03;

/*
	[형 변환] 설명
		char -> int
		int -> char
		float -> double
		double -> float
		int -> long
		
		- 정수->정수, 실수->실수처럼 같은 타입에서의 형변환
	
	1) 자동 형변환 2가지 경우
		(1) 
			int i = 10;
			long l = i;
			long c = a + b 
			- 같은 타입의 경우 같은 항에서 더 큰 연산자 형태로 자동 형변환 
		(2) 
			int i = 10;
			long l = i;
			- int + long = long. 좌측항이 더 큰 자료형일 경우 자동 형변환 
	2) 강제 형변환
		- cast 연산자를 사용해서 강제형변환한다.
		예) float avg = (float)98.99;
	
	
 	*float이 long형보다 더 높은 자료형으로 인식한다
	
*/
public class Ex03_02 {

	public static void main(String[] args) {

		// 자동 형변환(2)
		int a = 100;
		long b = 100L; //굳이 안붙여도 되는데 일단 붙임
		long c = a + b; //int + long = long. a= int + b = long = long
		
		// 형변환(1)
		int i = 10; // [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][1][0][1][0]
		long l = i; // int -> long 자동형변환 1번째 경우 - 좌측항이 더 큰경우
	
		//float avg = 98.99; //기본형인 double이 float보다 크기 대문에 형변환이 되지 않음
		//float avg = 98.99f; //f붙여서 해결 - 형변환아니고 그냥 리트럴 표시
		
		// 강제로 double -> float 형변환
		// 3 + 4 + "5"
		// 덧셈 문자열연결
		// (2+3)*5	-> () 최우선연산자
		
		//float avg = (자료형)98.99;
		float avg = (float)98.99; //cast 연산자
		
		
	}

}
