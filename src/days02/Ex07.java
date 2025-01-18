package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시험 내용 (암기 必)

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 표준입력장치 (키보드)로 부터 이름을 입력받아서
		// name 변수에 저장하고 출력
		
		
		/*
	       *    [키보드]   -> System.in       -> InputStreamReader -> BufferedReader
	       *  이름입력 엔터     Stream                문자 변환           버퍼 기능
	       *                 텍스트(문자)스트림
	       *                 *바이트 스트림         0101->한 문자 
	       * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("> 이름을 입력하세요: ");
		// System.out.print("> 이름을 입력하세요: "); 둘 다 같은값, readLine보다는 위에 있어야 함
		
		//Unhandled exception type IOException - 예외처리 배우기 전까지는 마우스 올려서 그냥 클릭(throws IOException 생김)
		String name = br.readLine();
		System.out.printf("이름은 %s입니다", name);
		
		
		
		
	}

}
