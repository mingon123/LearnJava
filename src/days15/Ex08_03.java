package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 3:24:56
 * @subject
 * @content 

		예외처리 활용 + 파일 열어서 출력.
		[ try ~ resource(자원) 문 설명 ]
		각 라인의 번호를 붙이고 싶다.

		[문제해결] end 앞의 라인번호 필요X -> 제거해야함

파일 읽도록 시험치면 이것만 쓰면 됨
 */


public class Ex08_03 {

	public static void main(String[] args) {
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days01\\Ex05.java";	// 	\\2개를 해야 1개 찍힘
		try( FileReader reader = new FileReader(fileName) ) {	// try~resource문 : try~catch문을 빠져나가면 자동으로 close함. 
			int one;
			int lineNumber=1;
			
			// boolean first = true;
			System.out.printf("%d : ", lineNumber++);
			
			while ( (one = reader.read() ) != -1 ) {
				// 1: 아래처럼 해도 되지만 while문을 반복할 때마다 계속 실행되기 때문에 좋지 않음. 그래서 그냥 위에서 한줄 출력하도록 함. 오히려 이게 정확한 코드
				/*
				if(first) {
					System.out.printf("%d : ", lineNumber++);
					first = false;
				}
				 */
			
//				System.out.printf("[%d]", one);		// 이걸로 확인했을 때 [13][10] == '\r' '\n' 이면 개행
				System.out.print((char)one);
				if ( one == 10 ) System.out.printf("%d : ", lineNumber++);
				// (해결) if( one == 10 && != 마지막라인 ) System.out.printf("%d : ", lineNumber++);
			}
		} catch (FileNotFoundException e) {
			System.out.println( e.toString() );	
		} catch (Exception e) {
			System.out.println( e.toString() );
		}
		System.out.println(" end ");

	} // main

} // class
