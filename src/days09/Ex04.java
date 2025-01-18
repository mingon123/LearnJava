package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * @author kenik
 * @date 2025. 1. 7. - 오전 11:20:19
 * @subject (시험)
 * @content 

	한 반에 30명인 학생의 성적 관리
	( 이름, 국어, 영어, 수학, 총점, 평균, 등수 )
	1. 이름, 국, 영, 수 입력
	2. 총, 평, 등 계산 처리
	3. 모든 학생 정보를 출력.
	
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT = 30; // 학생 수가 바뀌었을 때 하나씩 바꾸지 않고 한번에 바꿈
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		
		int cnt = 0; // 입력받은 학생의 수
		char con = 'y';
		
		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			// 입력 및 초기화
			System.out.print("> 이름 국어 영어 수학 정보 입력 ? ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
						
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1; // 값이 계속 변하기 때문에 마지막만 변경하도록 1로 초기화
			
			// 각각의 배열에 어디에 채워넣을까? 
			// cnt가 0부터 1씩 증가하고 index도 0부터 1씩 채우기 때문에 [cnt]를 한다.
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++;
			// 입력 계속 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );  // 30명 이상받으면 나가던가 배열 추가하던가 하는 코딩 추가하면 됨

		
		// 모든(8명) 학생들의 등수를 처리...
		for (int i = 0; i < cnt; i++) {
			// 등수를 매길 학생의 총점 : tots[i] 
			// 등수를 매길 학생의 등수 : ranks[i]
			ranks[i] = 1;
			
			// 비교할 모든 학생과 관련된 for문
			for (int j = 0; j < cnt; j++) {
				if( tots[i] < tots[j]) ranks[i]++;
			}
		}
		System.out.printf("> 입력받은 학생수: %d명\n", cnt);

		
		// 출력...
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		} // for
		
		
		// 국어 점수가 가장 높은 학생의 이름과 국어점수를 출력..
		
//		int max = 0, maxIndex = -1;
//		for (int i = 0; i < cnt; i++) {
//		    if (kors[i] > max) {
//		        max = kors[i];
//		        maxIndex = i;
//		    }
//		}
//		System.out.printf("국어점수 가장 높은 사람: %s, 점수 : %d", names[maxIndex], max);
		
	} // main

	private static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203 유니코드 번호
	
		// 5~13 랜덤 숫자 출력 : -5씩 하면 0~8
//		5 <= (int))(Math.random()*9)+5 < 14

//		char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');  // 가~힣 사이의 값 아무거나 가져오는 코드
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		
		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return (int)(Math.random()*101);
		
	}
	

} // class
