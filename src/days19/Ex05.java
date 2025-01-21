package days19;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days11.Student;

/**2025. 1. 21.오후 12:00:02
 * 
 * 
ArrayList로 학생정보 출력 최적화
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		// 한 반에 30명 학생들의 이/국/영/수/총/평/등 관리(입력, 등수처리, 출력)
		
		// 지금까지 배운 내용 변천사
		// 1. days09.Ex04.java	->	String [] names, int[] kors...
		// 2. days11.Ex10.java 	->  Student [] students = new Student[30]
		// 클래스 배열 선언 + 사용
		// Student [] students = new Student[STUDENT_COUNT];
		// 3. ArrayList 컬렉션 클래스
		
		
		ArrayList list = new ArrayList();
		
		char con = 'y';
		
		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		Student student;
		
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
			student = new Student();
			
			student.name = name;
			student.kor = kor;
			student.eng = eng;
			student.mat = mat;
			student.tot = tot;
			student.avg = avg;
			student.rank = rank; 
			
			list.add(student);	// list에 저장

			// 입력 계속 여부 
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
		
		
		// 모든 (8) 학생들의 등수를 처리 ..
		int cnt = list.size();
		Student 비교학생 = null;
		
		for (int i = 0; i < cnt; i++) {
			student = (Student) list.get(i);
			
			// 비교할 모든 학생과 관련된 for문
			for (int j = 0; j < cnt; j++) {
				비교학생 = (Student)list.get(j);
				
				if ( student.tot < 비교학생.tot )	student.rank++;
			}
		}
		System.out.printf("> 입력받은 학생수 : %d명\n", list.size());
		
		// 출력...
		// [1]
		for (int i = 0; i < list.size(); i++) {
			student = (Student) list.get(i);
			System.out.printf("[%d]번\t%s\n",  i+1, student.toString());
		} // for
		
		// [2] [iterator 반복자 사용 출력]
//		Iterator ir = list.iterator();
//		while (ir.hasNext()) {
//			Student s = (Student) ir.next();
//			System.out.println( s );
//		} // while
		
		// [3] 람다와 스트림
//		list.stream().forEach(System.out::println);
		
		
		// [문제] 국어 점수가 가장 높은 학생의 이름과 국어점수를 출력..

	} // main
	
	public static String getName() {
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
