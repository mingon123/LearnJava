package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:34:24
 * @subject
 * @content 

		예외처리 활용 + 파일 열어서 출력.
		[ try ~ resource(자원) 문 설명 ]
 */
public class Ex08_02 {

	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days01\\Ex05.java";	// 	\\2개를 해야 1개 찍힘
		
		// [FileReader] / FileWriter 클래스 -> 파일읽고 쓰는데 사용하는 클래스
		
		try( FileReader reader = new FileReader(fileName) ) {	// try~resource문 : try~catch문을 빠져나가면 자동으로 close함. 

			int one;
			while ((one = reader.read()) != -1 ) {
				System.out.print((char)one);
			}

		} catch (FileNotFoundException e) {
//			e.printStackTrace(); 모든 에러정보 다 띄우는 것
//			System.out.println( e.getMessage() ); // 해당 에러부분만 출력
			System.out.println( e.toString() );		// 예외 타입과 에러메세지 출력
		} catch (Exception e) {
			System.out.println( e.toString() );
		} finally {
			
		}
				
		System.out.println(" end ");

	} // main

} // class
