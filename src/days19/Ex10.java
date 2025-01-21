package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**2025. 1. 21. - 오후 3:45:14
 * 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		// Queue == FIFO
		
		// [Priority] + Queue
		// 우선권
		// 저장된 순서에 상관없이 우선 순위가 높은 것부터 꺼내오는 구조..
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		while ( !q.isEmpty() ) {
			System.out.println( q.poll());
		}

		// 숫자일 경우에는 낮은 숫자가 우선 순위가 높다.
		
	} // main

} // class
