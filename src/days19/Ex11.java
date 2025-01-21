package days19;

import java.util.Arrays;
import java.util.Comparator;

/**2025. 1. 21. - 오후 3:49:28
 * 
 * 

		Comparable 인터페이스 - 기본 정렬 기준을 구현하는 데 사용
		 ㄴ int compareTo(T o); 
		Comparator 인터페이스 - 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용
 */
public class Ex11 {

	public static void main(String[] args) {
		
		String [] m = { "tiger", "cat", "Dog", "lion" };
		
		// 				[tiger, cat, Dog, lion]
		System.out.println( Arrays.toString(m) );
		
		// 		정렬기준 X
		//		String implements Comparable - String 클래스는 Comparable 기본적으로 구현함. -> 오름차순 정렬
		Arrays.sort(m);
		//				[Dog, cat, lion, tiger] - 대문자가 값이 작아서 먼저.. 오름차순 정렬
		System.out.println( Arrays.toString(m) );
		
		
		// 내림차순 정렬
		// Arrays.sort(m, new DecendingStringComparator());
		Arrays.sort(m, new Comparator() { // 익명클래스를 사용한 경우
			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String)o1;
				String s2 = (String)o2;
				return s2.toUpperCase().compareTo(s1.toUpperCase());

			}
		});
		
		
		// Arrays.sort(m, Collections.reverseOrder());
		
		// 대소문자를 구분하지 않고 오름차순 정렬..
		Arrays.sort(m, String.CASE_INSENSITIVE_ORDER);
		
		// 대소문자를 구분하지 않고 내림차순 정렬..
		// [tiger, lion, dog, cat]
		System.out.println( Arrays.toString(m) );
		
	} // main
	
} // class


class DecendingStringComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.toUpperCase().compareTo(s1.toUpperCase());
	}

}














