package days21;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 3:30:48
 * @subject
 * @content

 파일을 읽는 것이 원래 파일에서 하는게아닌 스트림에서 하는것임.
 스트림은 크기가 정해져있고, 꽉차면 스트림에 있는 데이터를
 file flush를 사용하여(자동으로) 실제 파일에 기록함
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// 텍스트 파일 복사
		String fileName = ".\\src\\days20\\Ex01.java";
		String copyFileName = ".\\src\\days20\\Ex01Copy.java";
		
		fileCopy_textStream(fileName, copyFileName);

		
		System.out.println(" end ");
	} // main

	
	// 처리시간(ns) : 6067200
	private static void fileCopy_textStream(String source, String target) {
		
		long start = System.nanoTime();
		
		try ( 
				FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);
				) {
			int code;
			while ( (code = reader.read() ) != -1 ) {
//				System.out.println( code ); // 화면 출력
				writer.write(code); // writer.append() 도 가능
			} // while
			writer.flush();	// 오토플러쉬가 안되어도 이걸 사용하여 기록함
			System.out.println(" 파일 복사 완료!! ");
			
			// [문제] 파일명 == 클래스명 수정(변경) 해야함
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		long end = System.nanoTime();
		System.out.println( "처리시간(ns) : " + (end-start) );
		
	} 

} // class
