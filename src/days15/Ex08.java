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
 */
public class Ex08 {

	public static void main(String[] args) {

		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days01\\Ex05.java";	// 	\\2개를 해야 1개 찍힘
		
		// [FileReader] / FileWriter 클래스 -> 파일읽고 쓰는데 사용하는 클래스
		FileReader reader = null;
		
		try {
			//			지역변수
			reader = new FileReader(fileName);
			
			/*
			// 디폴트 생성자 reader.read()는 character형으로 문자를 읽어들이고 int형으로 반환한다. 파일의 마지막에 도달하면 -1을 반환한다. 
			// 한글자씩 읽어 왔을 때 int형으로 반환하기 때문에 강제형변환으로 char형으로 바꾸고, while문을 사용하여 -1이 아닐동안 계속 반복하도록 한다.
			// 결과 : read()메서드는 읽어와서 int로 리턴시고, 자동으로 다음문자로 이동하기 때문에 파일 내용을 읽을 수 있다.
			
			[1]
			int one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			*/
			
			/*
			// [2]
			while (true) {
				int one = reader.read();
				if( one == -1) break;
				System.out.print((char)one);
			}
			*/
			
			// [3]
			int one;
			while ((one = reader.read()) != -1 ) {
				System.out.print((char)one);
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace(); 모든 에러정보 다 띄우는 것
//			System.out.println( e.getMessage() ); // 해당 에러부분만 나오도록
			System.out.println( e.toString() );	
		} catch (Exception e) {
			System.out.println( e.toString() );
		} finally {			// reader가 try문에서 선언된 지역변수이기 때문에 try 블럭에서만 사용할 수 있고, finally에서는 사용할 수 없다.
			// 파일 닫기
			try {
				reader.close();		// 파일을 돌려줌. reader을 초기화까지 해줘야 사용가능
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
				
		System.out.println(" end ");

	} // main

} // class
