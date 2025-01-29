package days22;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		
		int [] score = {
                // 번호 국    영   수
                   1, 100, 90, 90,
                   2, 70,90,100,
                   3, 100,100,100,
                   4, 70,60,80,
                   5, 70,90,100
              };
		
		String name = "score.dat";
		String mode = "rw"; // read, write
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			for (int i = 0; i < score.length; i++) {
				System.out.printf("> 현재 FP : %d - %d\n", raf.getFilePointer(), score[i]); // 위치를 확인하기 위해서 찍음, int형이라 4바이트씩 FP 증가
				raf.writeInt( score[i] );
			} // for i
		} catch (Exception e) {
			System.out.println( e );
		}
		
		Ex06.일시정지();		

		
		// [문제1]
		// 모든 학생의 번호, 국어, 영어, 수학 성적 정보 출력
		int no, kor, eng, mat;
		int tot;
		double avg;
		
		try (RandomAccessFile raf = new RandomAccessFile(name, "r")){
			// raf.getFilePointer() = 0에 있음. 아니면 seek(0)으로 이동하면 됨.

			for (int i = 0; i < score.length/4; i++) { // 4개 값이 한세트라서 4로 나눔
				no = raf.readInt();  // 4
				kor = raf.readInt(); // 4
				eng = raf.readInt(); // 4
				mat = raf.readInt(); // 4
				
				tot = kor + eng + mat;
				avg = (double) tot/3;
				
				System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", no, kor, eng, mat, tot, avg);
			} // for i
		} catch (Exception e) {
			System.out.println( e );
		}
		
		Ex06.일시정지();		
		
		
		
		// [문제2]
		// 3번 학생의 수학 점수(100)를 20점으로 수정하는 코딩...하세요. - 3번학생 수학 위치값을 찾아서 seek로 수정
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			// 3번 학생의 수학 20 수정
			// FP : 44
			int pos = (4+4+4+4)*2+(4+4+4); // 44 - 위치값 모르면 이렇게 해야함
			raf.seek(pos); // 44 넣어도 됨
			raf.writeInt( 20 );
		} catch (Exception e) {
			System.out.println( e );
		}
		
		Ex06.일시정지();			
		
		
		// [문제3]
		// 3번 학생의 번호, 국어, 영어, 수학 성적 정보를 출력
		
		try (RandomAccessFile raf = new RandomAccessFile(name, "r")){
			// 3번학생 위치(FP)
			int pos = (4+4+4+4)*2;
			raf.seek(pos);
			
			no = raf.readInt();  // 4
			kor = raf.readInt(); // 4
			eng = raf.readInt(); // 4
			mat = raf.readInt(); // 4
			
			tot = kor + eng + mat;
			avg = (double) tot/3;
			
			System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", no, kor, eng, mat, tot, avg);
		} catch (Exception e) {
			System.out.println( e );
		}
				
		
	} // main

} // class
