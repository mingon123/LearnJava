package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 4:00:27
 * @subject
 * @content 

		FileReader / FileWriter
		BufferedReader / BufferedWriter	파일복사
		
Ex06_03복사 후 변경 - 버퍼기능 사용해서 읽기 쓰기
 */
public class Ex06_04 {

	public static void main(String[] args) {
		// 텍스트 파일 복사
		String fileName = ".\\src\\days20\\Ex01.java";
		String copyFileName = ".\\src\\days20\\Ex01Copy.java";

		fileCopy_textStream02(fileName, copyFileName);


		System.out.println(" end ");
	} // main


	// 처리시간(ns) : 6067200 - FileWriter
	// 처리시간(ns) : 1431100 - BufferedReader
	// 처리시간(ns) : 603200  - cbuf
	private static void fileCopy_textStream02(String source, String target) {

		long start = System.nanoTime();

		final int BUFFER_SIZE = 1024;
		
		try ( 
				FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);
				// 보조스트림 - 버퍼기능 추가
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);
				) {
			/*
			String line = null;
			while ( (line = br.readLine() ) != null ) {
				System.out.println( line ); // 화면 출력
				bw.write(line); 
			} // while
			*/
			
			
			// (기억)
			char [] cbuf = new char[BUFFER_SIZE];
			// br.readLine(); 한 라인을 읽어오는 메서드
			// br.read(); 	   한 문자를 읽어와서 int 반환 메서드
			// int  br.read(char [] cbuf)
			// 1) 기능 : 한문자X, char[] 배열로 문자를 읽어와서 
			// 2) 매개변수 : cbuf 에 저장
			// 3) 리턴값 : 읽어온 문자를 채운 크기(갯수)
			int n = -1;
			while ( ( n = br.read(cbuf) ) != -1 ) {
				bw.write(cbuf, 0, n);  // 0부터 읽어온크기까지
			}
			
			bw.flush();
			System.out.println(" 파일 복사 완료!! ");
			
			// [문제] 파일명 == 클래스명 수정(변경) 해야함


		} catch (Exception e) {
			System.out.println(e);
		}

		long end = System.nanoTime();
		System.out.println( "처리시간(ns) : " + (end-start) );

	} 

}
