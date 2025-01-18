package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex02;
import days11.Student;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 3반 + 30명 학생 입력 + 성적처리 + 출력
		// (Student 클래스 배열을 사용해서 처리)
		final int STUDENT_COUNT = 30;
		final int CLASS_NUMBER = 3;

		// 클래스 배열
		Student [][] students = new Student[CLASS_NUMBER][STUDENT_COUNT];

		char con = 'y';
		int cnts [] = new int[CLASS_NUMBER];

		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank, wrank; // rank는 반등수, wrank는 전교등수
		double avg;		

		Scanner scanner = new Scanner(System.in);
		int ban; // 1,2,3 입력받은 반 저장할 변수

		do {
			// 1. 반 입력 ?
			System.out.print("> 반 입력 ? ");
			ban = new Random().nextInt(3)+1; // scanner.nextInt(); // 1,2,3
			int banIndex = ban-1;	// ban Index
			int banNoIndex = cnts[banIndex];  // 그 반 학생 index
			// 2. 학생정보 입력 ?
			System.out.printf("> 2. %d반의 [%d]번 학생 이름,국,영,수 입력하세요 ? ", ban, banNoIndex+1); // index0번부터라 -1하고 표시할때는 1반이 나와야하니까 +1

			name = Ex02.getName();
			kor = Ex02.getScore();
			eng = Ex02.getScore();
			mat = Ex02.getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1; // 반등수
			wrank = 1; // 전교등수

			// 각각의 배열에 어디에 채워넣을까?
			students[banIndex][banNoIndex] = new Student();
			
			students[banIndex][banNoIndex].name = name;
			students[banIndex][banNoIndex].kor = kor;
			students[banIndex][banNoIndex].eng = eng;
			students[banIndex][banNoIndex].mat = mat;
			students[banIndex][banNoIndex].tot = tot;
			students[banIndex][banNoIndex].avg = avg;
			students[banIndex][banNoIndex].rank = rank;
			students[banIndex][banNoIndex].wrank = wrank;

			cnts[banIndex]++; // 입력받은 그 반 학생만 증가
			// 입력 계속 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );

		// 반/전교 등수처리
		ProcessingRanks(students, cnts);

		// 전교생 출력
		printStudents(students, cnts);
		
	}

	//[전교생 출력]
	private static void printStudents(Student[][] students, int[] cnts) {
		//int totalCnt = cnts[0] + cnts[1] + cnts[2];
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) { // 3반이기 때문에 cnts.length = 3
			System.out.printf("[%d]반 학생수 : %d명\n", i+1, cnts[i]);

			// 실제 그 반 학생 정보 출력...
			for (int j = 0; j < cnts[i] ; j++) {
				System.out.printf("\t%d.\t%s\n", 
						j+1, students[i][j].getStudentInfo());
			} // for j
		} // for i
	}

	// [ 반, 전교등수 처리 ]
	private static void ProcessingRanks(Student[][] students, int[] cnts) {
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				students[i][j].rank = 1; // 반등수
				students[i][j].wrank = 1; // 전교등수
				
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {

						if (students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;  // 전교등수 1증가
							if( i == i2) {  // 반까지 같으면
								students[i][j].rank++;
							} // if
						} // if
			
					} // for j2
				} // for i2
			
			} // for j
		} // for i
	}

} // class
