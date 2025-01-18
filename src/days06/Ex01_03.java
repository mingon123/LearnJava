package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		
		// bufferedReader을 사용하여 한번에 입력값받아오기 
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		// "홍길동	,	 90  , 38, 84"
		System.out.print("> 이름, 국, 영, 수 입력 ? ");
		String data = br.readLine();
		
		String regex = "\\s*, \\s*"; // "정규표현식" 으로 쓰라하면 이렇게 써야함
		String [] dataArr = data.split(regex);
		
		String name = dataArr[0];
		int kor = Integer.parseInt( dataArr[1] );
		int eng = Integer.parseInt( dataArr[2] );
		int mat = Integer.parseInt( dataArr[3] );
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		
		
		
		
	} // main

} // class
