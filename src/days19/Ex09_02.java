package days19;

import java.util.LinkedList;
import java.util.Queue;

/**2025. 1. 21. - 오후 3:33:49
 * 
 * 
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// Queue 구조 : FIFO
		// Queue q = new Queue(); // 인터페이스이기 때문에 객체 생성 못함
		// offer(), poll(), isEmpty(), peek()
		
		// LinkedList는 아래것들을 구현함.
		// List 인터페이스
		// Deque - 부모 -> Queue 인터페이스
		Queue q = new LinkedList();

		q.offer("주정호");
		q.offer("최지우");
		q.offer("이찬희");
		
//		q.peek(); // 방 안없앰
//		System.out.println(q.size()); 
//		q.poll(); // 방 없앰
//		q.poll();
		
		while ( !q.isEmpty() ) {
			System.out.println( q.poll() );
		}
		
		
		
		
	} // main
	
} // class
