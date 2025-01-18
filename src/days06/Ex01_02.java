package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		
		// bufferedReader을 사용하여 한번에 입력값받아오기 
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		// "홍길동, 90, 38, 84"
		System.out.print("> 이름, 국, 영, 수 입력 ? ");
		String data = br.readLine();
			
		// String.split() 설명
		// "홍길동, 90, 38, 84"
		// "홍길동"
		// "_90" // _는 공백
		// "_38"
		// "_84"
		// "___90___".trim -> trim메서드로 문자열 앞뒤 공백 삭제
		
		
		String regex = ",";
		String [] dataArr = data.split(regex);
		
		String name = dataArr[0];
		
		// String -> int 형으로 변환해야함
		// int kor = (int)dataArr[1] // 이거 안됨
		int kor = Integer.parseInt( dataArr[1].trim() );
		int eng = Integer.parseInt( dataArr[2].trim() );
		int mat = Integer.parseInt( dataArr[3].trim() );
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		
		
		
		
	} // main

} // class
