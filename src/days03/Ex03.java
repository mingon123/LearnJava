package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// [문제]
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 출력형식: 이름 = "홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		// 자료형 크기에 딱 맞게 변경해서 - int 대신 byte, short 사용
		
		/* 내코드
		String name;
		byte kor, eng, math;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("이름을 입력하세요: ");
		name = br.readLine();
		
		System.out.printf("국어점수를 입력하세요: ");
		kor = Byte.parseByte( br.readLine() );
		
		System.out.printf("영어점수를 입력하세요: ");
		eng = Byte.parseByte( br.readLine() );
		
		System.out.printf("수학점수를 입력하세요: ");
		math = Byte.parseByte( br.readLine() );
		
		short total = (short) (kor+eng+math);
		float avg = total/3.f;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, math, total, avg);
		// \"%s\" 형식으로 이름에 따옴표를 붙일 수 있음
		
		*/
		
		
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		// 미리 선언할필요 없이 필요할때 선언하면 됨. 다른 코드도 마찬가지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름 입력? ");
		name = br.readLine();
		
		System.out.print("> 국어 입력? ");
		kor = Byte.parseByte( br.readLine() );
		
		System.out.print("> 영어 입력? ");
		eng = Byte.parseByte( br.readLine() );
		
		System.out.print("> 수학 입력? ");
		mat = Byte.parseByte( br.readLine() );
		
		//Type mismatch: cannot convert from int to short
		total = (short) (kor + eng + mat); //short는 cast연산자, 뒤의 괄호는 최우선연산자
		avg = (double)total / 3; //total, 3 중 아무거나 실수로 만들어주면됨
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f \n", name, kor, eng, mat, total, avg);
		
		
		
	}

}




