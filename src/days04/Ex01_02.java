package days04;

import java.util.Scanner;

/*

Scanner 클래스 사용해서 표준입력장치로부터 입력...



*/

public class Ex01_02 {

	public static void main(String[] args) {

		/*
		1. 이름, 국어, 영어, 수학의 값을 입력받아서
		   총점, 평균을 계산하고 , 출력하기
		   ( 조건 : 평균은 소수점 2자리까지 출력 )
		   출력형식 예)  이름="홍길동",국어=89,영어=78,수학=90,총점=257,평균=85.67
		*/
		
		String name;
		int kor, eng, math, total;
		double avg;

		// 키보드 -> System.in -> ISR -> BR
		// 키보드 -> System.in -> Scanner - 키보드로부터 System.in을 통해 입력받아 Scanner로 읽음
		// 클래스(Scanner) 변수명(scanner)
		
		//Resource leak: 'scanner' is never closed - 계속 사용하고 있어서 close를 해줘야함
		Scanner scanner = new Scanner(System.in);
		
		/*
		String input = "홍길동 90 87 89";
		Scanner scanner = new Scanner(input); //이렇게 문자열 읽어올 수 있음 Ex01_03내용
		scanner.useDelimiter(String pattern); //정규표현식. 구분자.  입력 및 설정 안하면 space
		*/
		
		
		System.out.print("> 이름 국어 영어 수학 입력 ? "); // 홍길동 90 87 89
		// scanner 주의사항
		//	(1) 구분자가 space이기 때문에 홍길동을 홍 길동으로 입력 시 오류
		//	(2) 홍길동 90 87 만 입력 시 : 개행한 걸로 치고 나중에 입력하면 됨
		//	(3) 값을 하나 더 입력 시 : 오류 x : 더 이상 받지 않아서
		//	(4) 홍길동,90,87,89로 입력시 : 전체를 이름으로 봄
		
		name = scanner.next();
		// name = scanner.nextLine(); //한줄로 이름만 입력받음

		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();

		total = kor + eng + math;
		avg = (double) total / 3;

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, math, total, avg);

	}

}
