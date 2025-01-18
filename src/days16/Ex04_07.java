package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:21:58
 * @subject
 * @content 
 */
public class Ex04_07 {

	public static void main(String[] args) {
		
		String a = "abcdsdfsdf";
		String b = "abcd";
		
		// a.equals(b);	-> boolean형으로 출력
		
		// 같으면 : 0,	다르면 : 양수/음수
		System.out.println( a.compareTo(b) );	// b와 A를 비교해서 차이를 출력하고 빠져나옴. 뒤는 계산안함, 차이 + 문자열 길이만큼 돌려줌
//		System.out.println( myCompareTo(a, b) );
		
	} // main

	private static int myCompareTo(String a, String b) {		// 이런느낌으로 함. 정확하진 않음. 그냥 각 자리에서 a!=b면 차이 출력하는 함수

		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) - b.charAt(i) != 0 )
				return a.charAt(i) - b.charAt(i);
		} // for i
		return 0;
	}

} // class
