package days22;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kenik
 * @date 2025. 1. 24. - 오전 10:12:40
 * @subject
 * @content

 		Sequence[InputStream]
 		순차적인	바이트스트림(입력용) - 읽기용
 		 ㄴ 여러개의 입력 스트림을 연속적으로 연결해서 하나의 스트림으로 데이터를 처리할 수 있는 바이트 스트림
 		 예) 용량이 큰 파일을 여러개의 작은 파일로 생성
 		 -> 하나의 스트림으로 처리해야할 경우
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		byte [] n = { 1,2,3 };
		byte [] m = { 4,5,6 };
		byte [] k = { 7,8,9 };
		
		// byte [] -> 메모리 스트림 변환
		ByteArrayInputStream baisN = new ByteArrayInputStream(n);
		ByteArrayInputStream baisM = new ByteArrayInputStream(m);
		ByteArrayInputStream baisK = new ByteArrayInputStream(k);
		// 위의 3개의 스트림을 하나의 스트림으로 생성 + 처리.
		/* [1] 값이 많을 경우 어려움
		SequenceInputStream sis = new SequenceInputStream(baisN, baisM);
		SequenceInputStream sis2 = new SequenceInputStream(sis, baisK);
		*/
		
		// [2] Enumeration 사용
		Vector<ByteArrayInputStream> v = new Vector<>(); // 순서가 있어야하기 때문에 Vector 사용, ArrayList도 상관없음
		v.add(baisN);
		v.add(baisM);
		v.add(baisK);
		
		Enumeration <ByteArrayInputStream> en = v.elements();  // v의 요소를 열거형으로 만듦
		
 		SequenceInputStream sis = new SequenceInputStream(en); 
		
 		int b;
		while ( ( b= sis.read()) != -1 ) {
			System.out.println( b );
		}
		

		
		
	} // main

} // class
