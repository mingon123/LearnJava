package days19;

import java.util.Stack;

/**2025. 1. 21. - 오후 3:19:54
 * 
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// Stack extends Vector
		// empty(), push(), pop(), peek(), search() 메서드 : 이것만 사용. 기억
		Stack s = new Stack();
		
		// LIFO
		s.push("양희동");
		s.push("오재문");
		s.push("유예나");
		
		// int s.search("홍길동"); // 검색
		
		// s.get(1) : 가능은 하지만 쓰면 안됨. 스택구조는 LIFO구조이므로
		System.out.println( s );
		
		/*
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		*/
		
		// [1]
		int len = s.size();
		for (int i = 0; i < len; i++) { // pop할 때 마다 사이즈가 줄어서 3번 안돎
			System.out.println( s.pop() );	
		}
		
		// [2]
//		System.out.println( s.isEmpty() );
//		System.out.println( s.empty() );
		while ( !s.empty()) {
			System.out.println( s.pop() );
		}
		
		
		/*
//		String name = (String) s.pop(); // 마지막 방 사라짐
		
		// peek : 엿보다, 살짝 들여다보다.
		String name = (String) s.peek(); // 마지막 방 안사라짐
		System.out.println(name);
		
		System.out.println( s.size() );
		*/
		
	} // main

} // class
