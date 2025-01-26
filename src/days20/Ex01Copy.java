package days20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**2025. 1. 21. - 오후 5:02:48
 * 
 * 
		컬렉션 클래스
		제네릭
		열거형
		어노테이션
		자바의 IO
 */
public class Ex01Copy {

	public static void main(String[] args) {
		
		// 중복허용X, 순서유지X
		// HashSet<Integer> set = new HashSet<Integer>();
		
		// 중복허용X, 순서유지O
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(3); // 오토박싱 때문에 int 값을 넣어도 됨
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(1); // 중복 X
		
		System.out.println( set ); // [1, 2, 3, 4, 5] : 순서유지X, 중복허용X
		
		
	} // main

} // class


