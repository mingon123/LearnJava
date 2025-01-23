package days21;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 2:45:58
 * @subject
 * @content

 		자바 IO(Input Output)
 			입출력
 */
public class Ex06 {

	public static void main(String[] args) {
		
		/*
		1. Input, Output
		 컴퓨터 내부 프로그램 -- 데이터송/수신 --> 외부 장치 (프로그램)
		 
		 예)
		 키보드		-- 수신 -->  프로그램
		 (표준입력장치)
		 
		 						프로그램		-- 송신 -->  모니터(표준출력장치)
		 프로그램을 기준으로 받으면(가져오면) 수신, 보내면 송신
		 
		2. 자바의 모든 입출력은 스트림(Stream) 이라는 개념으로 이루어진다.
		
		3. 스트림( Stream )
		 1) 흐르는 물, 빨대
		 2) 단방향
		 	ㄱ. 읽기( 입력용 ) 스트림
		 	ㄴ. 쓰기( 출력용 ) 스트림
		
		4. 스트림의 2가지 종류
			1) 문자(텍스트) 스트림
			  - 입력용 스트림 : 최상위 부모 클래스 Reader
			  - 출력용 스트림 : 최상위 부모 클래스 Writer
			  - 1문자 == 유니코드 2바이트 == char
			  - 한 문자, 문자열, 문자 배열을 다룸
			  
			  File[Reader] / File[Writer]  문자스트림
		
			2) 바이트(이진) 스트림
  			  - 입력용 스트림 : 최상위 부모 클래스 InputStream
			  - 출력용 스트림 : 최상위 부모 클래스 OutputStream
			  - 0/1 1비트 단위 처리 X
			    8비트(1바이트) 단위로 처리, 바이트 배열, 정수(int)
			    
			  File[InputStream] / File[OutputStream]
		 
		5. 보조스트림 - 어떤 스트림의 입출력을 더 쉽도록 보조 역할을 하는 스트림 
			BufferedReader / BufferedWriter					- 문자스트림
			BufferedInputStream / BufferedOutputStream		- 바이트스트림
		 
		 	  FileReader reader = new FileReader("a.txt");
		 	  				   .read()
		 	  BufferedReader br = new BufferedReader(reader);
		 	  br.readLine()

		 
		 */
		
		
		
		

	} // main
	
} // class
