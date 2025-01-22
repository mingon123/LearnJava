package days19;

import java.util.Deque;
import java.util.LinkedList;

/**2025. 1. 21. - 오후 3:41:44
 * 
 * 
 */
public class Ex09_03 {

	public static void main(String[] args) {
		// Deque == Double Enabled Queue
		// 			양쪽		가능하다	큐 구조 ( 추가/추출 )

		Deque q = new LinkedList();
		q.offerFirst("A");
		q.offerLast("B");
		
		q.pollFirst();
		q.pollLast();

		
		
		
		
	} // main

} // class
