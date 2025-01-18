package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 이름, 국어, 영어, 수학 을 입력받아서
		// 총점, 평균 계산 후 출력...
		Scanner scanner = new Scanner(System.in); // scanner가 2번 사용되기 때문에 main함수에서 호출하여 1번만 사용
		
		// 이름, (국어, 영어, 수학), 출력 함수 따로 만들기
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		name = getName(scanner);
//		System.out.println(name);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		mat = getScore(scanner, "수학");
		printScore(name, kor, eng, mat);

		
	} // main

	
	
	//name cannot be resolved to a variable -> 지역함수 사용 오류
	private static void printScore(String name, int kor, int eng, int mat) {
		System.out.printf("name:%s, kor:%d, eng:%d, mat:%d\n", name, kor, eng, mat);
		
	}

	
	// 국어 점수를 입력받아서 반환
	private static int getScore(Scanner scanner, String subject) {
		// 0~100 정수 : String.matches()
		//Scanner scanner = new Scanner(System.in);
		String score; //  
		//              [1-9]?\\d
		String regex = "^(\\d{1,2}|100)$";
		boolean flag = false;
		do {
			if( flag ) {
				System.out.print("> 다시 ");
			}
			System.out.printf("> %s 점수 입력 ? ", subject);
			score = scanner.next();
			flag = true;
		} while (!score.matches(regex));

		return Integer.parseInt(score);
	}

   

	//This method must return a result of type String -> 리턴문이 없어서 오류
	public static String getName(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ? ");
		String name = scanner.next();
		return name;
	}


} // class
