package days18;

import java.text.DecimalFormat;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 11:34:23
 * @subject
 * @content 

		[ 형식화 클래스 4가지 ]
		1. DecimalFormat 클래스
		2. SimpleDateFormat 클래스
		3. ChoiceFormat 클래스
		4. MessageFormat 클래스
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1. DecimalFormat 클래스
		//		ㄴ 숫자를 형식화(내가 원하는 형식)하는 데 사용되는 클래스
		
//		int money = 3257600;
		// 			3,257,600 으로 나타내고 싶음
		// 1) 로직 구현 - 내가해야함
		
		// 2) String.format( "%,d" )
//		System.out.println( String.format("%,d", money) );
		
		// 3) DecimalFormat 클래스
//		String pattern = "#,###";
//		DecimalFormat df = new DecimalFormat(pattern);
//		System.out.println(df.format(money));
		
		// [문제] 화폐단위 붙이고, 천자리마다 콤마붙이고, 소수점은 무조건 2자리까지 출력~
		double money = 3257600.8;
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(money));
		
		
	}
	
}
