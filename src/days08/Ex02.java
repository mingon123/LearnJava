package days08;

 /**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:10:32
 * @subject
 * @content 
 */

public class Ex02 {

	public static void main(String[] args) {

		String rrn = "830412-1700001";
		
		String [] rrnArr = rrn.split("-");
		
		System.out.println( rrnArr[0] );
		System.out.println( rrnArr[1] );  // "1700001"
		
		/*
		System.out.println( rrnArr[0] + "-*******");
		
		// String.concat() 메서드는 두 문자열을 연결하는 메서드
		System.out.println( rrnArr[0].concat("-*******"));
		*/
		
		// String rnn = "830412-1******";
		// System.out.println( rrnArr[0] + "-" + rrnArr[1].charAt(0) + "******" ); <- 가독성이 떨어짐
		System.out.println( String.format("%s-%c******", rrnArr[0], rrnArr[1].charAt(0) ));
		
		
		
	} // main 

} // class
