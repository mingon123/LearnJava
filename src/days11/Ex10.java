package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 5:04:32
 * @subject  Student 클래스 선언
 * @content  클래스 배열 선언 코딩 수정. ( 유지, 보수 )
 */
public class Ex10 {

public static void main(String[] args) throws IOException {
		
		final int STUDENT_COUNT = 25;
		
		// Student s1 = new Student();
		Student [] students = new Student[STUDENT_COUNT];
		
		int cnt = 0 ; // 입력받은 학생의 수
		char con = 'y';
		
		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			// 
			System.out.print("> 이름 국어 영어 수학 정보 입력 ? ");
			name = getName() ; //scanner.next();
			kor = getScore(); //   scanner.nextInt();
			eng = getScore(); //   scanner.nextInt();
			mat = getScore(); //   scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			// 각각의 배열에 어디에 채워넣을까?
			students[cnt] = new Student();
			
			students[cnt].name = name;
			students[cnt].kor = kor;
			students[cnt].eng = eng;
			students[cnt].mat = mat;
			students[cnt].tot = tot;
			students[cnt].avg = avg;
			students[cnt].rank = rank; 
			
			cnt++; 
			// 입력 계속 여부 
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
		
		// 모든 (8) 학생들의 등수를 처리 ..
		/* [1]
		for (int i = 0, count; i < cnt; i++) {
			// 등수를 매길 할 생의 총점 : tots[i]
			// 등수를 매길 할 생의 등수 : ranks[i]			
			count = 0;
			// 비교할 모든 학생과 관련된 for문
			for (int j = 0; j < cnt; j++) {
			    if(  tots[i] < tots[j] ) count++;
			}			
			ranks[i] = count+1;
		} // 
		*/
		// [2]
		/*
		for (int i = 0; i < cnt; i++) {
			ranks[i] = 1;	 
			// 비교할 모든 학생과 관련된 for문
			for (int j = 0; j < cnt; j++) {
			    if(  tots[i] < tots[j] ) ranks[i]++;
			}	 
		} //
		*/
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		
		// 출력...
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]번\t%s\n"
					,  i+1
					,  students[i].getStudentInfo());
		} // for
		
		// [문제] 국어 점수가 가장 높은 학생의 이름과 국어점수를 출력..

	} // main
	
	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203
		
		// 5 ~ 13
		// 0 ~ 8                -5
		// 5 <=  (int)(Math.random()*9)+5 <= 13
		
		 
		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		
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
		return  (int)( Math.random()*101 ) ;
	}

} // class


/*
[1]	늨천딍	93	80	13		186	62.00	1
[2]	섀꺜닄	50	95	44		189	63.00	1
[3]	눒솼걒	90	62	36		188	62.67	1
[4]	굽쏐뽱	14	36	9		59	19.67	1
[5]	휈쉮츈	3	50	79		132	44.00	1
[6]	웛줞뎿	50	41	33		124	41.33	1
*/

