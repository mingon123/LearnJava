package days10;

import java.util.Scanner;

// 내가 하던거 복습 다시해야함
// 정답 : Ex02

public class Ex02_02 {

	public static void main(String[] args) {
		/*
		1. 한 반에 10명인 학생의 성적 관리
         ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
         1. 이름, 국,영,수 입력
         2. 총,평, 등 계산 처리
         3. 모든 학생 정보를 출력..
    조건) 등수 처리하는 메서드를 만드세요. 
    조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
    조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
	 */
		
		final int STDENT_NUMBER = 10;
		String [] names = new String [STDENT_NUMBER];
		int [] kors = new int[STDENT_NUMBER];
		int [] engs = new int[STDENT_NUMBER];
		int [] mats = new int[STDENT_NUMBER];
		int [] tots = new int[STDENT_NUMBER];
		double [] avgs = new double[STDENT_NUMBER];
		int [] ranks = new int[STDENT_NUMBER];
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		Scanner scanner = new Scanner(System.in);
		
		name = getName(scanner);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		mat = getScore(scanner, "수학");
		
		tot = kor + eng + mat;
		avg = (double)tot/3;
		rank = 1;
		
		
	}

	private static int getScore(Scanner scanner, String subject) {
	    System.out.printf("> %s 점수 입력: ", subject);
	    return scanner.nextInt(); // 해당 과목 점수를 입력받아 반환
	}

	private static String getName(Scanner scanner) {
		String name;
		System.out.print("> 이름 입력 ? ");
		name = scanner.next();
		return name;
	}


}
