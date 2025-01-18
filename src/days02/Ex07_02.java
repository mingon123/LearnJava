package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//[문제] 국어 점수를 키보드로 입력받아서 변수에 저장하고 "국어=90점" 출력하는 코딩을 하세요

public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수를 입력하세요: ");
		
		String kr;
		//Type mismatch: cannot convert from String to byte - 문자열 스트링을 돌려줌(br.readLine은)
		// string "90" -> byte 90 형변환
		
		kr = br.readLine();
		
		System.out.printf("국어=%d점", kr);
		
		
	}
}
