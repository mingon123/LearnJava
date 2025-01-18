package days08;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오후 2:15:33
 * @subject
 * @content 
 */

public class Ex03_05 {

	public static void main(String[] args) {
		
		String rrn = "830412-1700001";
		System.out.println(rrn);
		
		/*
		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		*/
	
		int ㄱ = Integer.parseInt( rrn.substring(0, 1) );
		int ㄴ = Integer.parseInt( rrn.substring(1, 2) );
		int ㄷ = Integer.parseInt( rrn.substring(2, 3) );
		int ㄹ = Integer.parseInt( rrn.substring(3, 4) );
		int ㅁ = Integer.parseInt( rrn.substring(4, 5) );
		int ㅂ = Integer.parseInt( rrn.substring(5, 6) );
		//  -
		int ㅅ = Integer.parseInt( rrn.substring(7, 8) );
		int ㅇ = Integer.parseInt( rrn.substring(8, 9) );
		int ㅈ = Integer.parseInt( rrn.substring(9, 10) );
		int ㅊ = Integer.parseInt( rrn.substring(10, 11) );
		int ㅋ = Integer.parseInt( rrn.substring(11, 12) );
		int ㅌ = Integer.parseInt( rrn.substring(12, 13) );
		
		int checksum = 11-((2*ㄱ)+(3*ㄴ)+(4*ㄷ)+(5*ㄹ)+(6*ㅁ)+(7*ㅂ)+(8*ㅅ)+(9*ㅇ)+(2*ㅈ)+(3*ㅊ)+(4*ㅋ)+(5*ㅌ) %11);
//		(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ)
		
		if( checksum == 11 ) checksum = 1;
		else if ( checksum == 10) checksum = 0;
		
		int ㅍ = Integer.parseInt(rrn.substring(13) );
		
	    if(ㅍ == checksum) {
	       System.out.println("올바른 주민등록번호.");
	    } else {
	       System.out.println("잘못된 주민등록번호.");
	    }
		

	
	} // main

} // class
