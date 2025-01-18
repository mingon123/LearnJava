package days08;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:19:51
 * @subject
 * @content String.substring() 메서드
 */

public class Ex02_02 {

	public static void main(String[] args) {
		

	String rrn = "830412-1700001";
	
	// String.substring() 메서드 사용 처리
	// 1. 기능
	// 2. 매개변수
	// 3. 리턴값(리턴자료형)
	
//	[문제] 주민등록번호 뒷자리 7개를 필요...
	
//	(1)
	System.out.println( rrn.split("-")[1]);
//	(2)
	System.out.println( rrn.substring(7, rrn.length() ) );
//	(3)
	System.out.println( rrn.substring(7));
	
	
//	// 주민등록번호 뒷 첫자리까지
//	int beginIndex = 0;
//	int endIndex = 8;
//	String result = rrn.substring(beginIndex, endIndex);
//	System.out.println( result + "******");
//	
//	// 주민등록번호 앞자리만
//	beginIndex = 0;
//	endIndex = 7;
//	result = rrn.substring(beginIndex, endIndex);
//	System.out.println( result + "*******");
	
	
	
	
	} // main
	
} // class
