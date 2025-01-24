package days22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author kenik
 * @date 2025. 1. 24. - 오전 8:59:04
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		/*
		1. 자바 모든 입/출력 : 스트림(Stream) - 흐르는물, 빨대
		2. 단방향 : 입력스트림, 출력스트림
		3. 스트림 2가지 종류
		  1) 문자 스트림 : Reader, Writer 
		  2) 바이트 스트림 : InputStream, OutputStream	- int가 기본값
		4. 보조스트림
		5. 메모리스트림
		 */
		
		// 키보드(표준입력장치) -> 바이트 스트림 -> 문자 스트림(보조스트림)
		InputStream is = System.in;
		// 한글1문자 [][][] 3바이트가 필요
		// 보조스트림 InputStream[Reader] : 문자스트림
		InputStreamReader isr  = new InputStreamReader(is);	// 바이트스트림을 문자스트림으로 변환
		int one = isr.read(); // 한문자만 읽어옴
		System.out.println( (char)one );
		
		// 보조스트림 BufferedReader	(reader)
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine(); // 줄단위로 읽음
		
		// [암기]
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 키보드 -> System.in -> InputStreamReader -> BufferedReader
		//		   바이트 스트림	문자스트림				 라인단위로 처리
		// String name = br.readLine();
		
		// 한글 한문자 입력받는 방법
		// [1]
//		int code = is.read();
//		System.out.printf("%d-%c\n", code, (char)code);
		
		
		/*
		// [2]
		byte[] b= new byte[3];
		int n = is.read(b); // 배열에 저장된 갯수
		System.out.println( "배열에 저장된 바이트의 수 : " + n );
		for (byte c : b) {
			System.out.println( c );
		} // for each
		char one = new String(b).charAt(0);
		*/
		
		
		// 54620 - 한 : 1바이트로 처리못함.
//		System.out.printf("%d\n", (int) '한' );	
		
		

	} // main
	
} // class
