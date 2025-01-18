package days15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		reader.read()	한문자 -> int 반환하는 메서드
		-> 한문자씩 읽지말고 한라인 읽기 -> 각 라인번호 붙이면...
		
		FileReader 	파일
		 int read()	한문자
		 
 		1 : [][][][][][][10]
        2 : [][][][][][][][10]
        3 : ...    
                
		문자를 한문자씩 읽어오다가 줄바꿈 문자 [10] 이면 줄바꿈하고 lineNumber++하도록 했었는데
		라인별로 읽어오면 라인별로 읽고 앞에 숫자만 추가하면 됨
		
		
		system.in으로 키보드로 입력한 데이터를 바이트 스트림으로 읽어들여서 -> 문자 데이터로 변환 -> 줄단위로 읽음
		키보드 -> System.in -> InputStreamReader -> BufferedReader br.readLine()
		
 */


public class Ex08_04 {
	
	public static void main(String[] args) {
		// 보조스트림	-> 스트림을 한번 더 가공하기 위한 보조스트림
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	-> 보조스트림. 라인단위로 읽어줌
		// Scanner	
		
		
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days01\\Ex05.java";	// 	\\2개를 해야 1개 찍힘
		try( 
				FileReader reader = new FileReader(fileName); 		// 1개면 ; 안붙여도 되지만, 2개 이상(여러개)이면 ;로 구분함(꼭 있어야 함).
				BufferedReader br = new BufferedReader(reader);		
			) {
			String line = null;
			int lineNumber = 1;
			while( ( line = br.readLine() ) != null ) {	// 한문자 읽어오는 코드
				System.out.printf( "%d : %s\n", lineNumber++, line );
			};
			
		} catch (FileNotFoundException e) {
			System.out.println( e.toString() );	
		} catch (Exception e) {
			System.out.println( e.toString() );
		}
		System.out.println(" end ");

	} // main

} // class



