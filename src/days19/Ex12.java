package days19;

import java.util.HashSet;

/**2025. 1. 21. - 오후 4:18:29
 * 
 * 

		List - [ArrayList], Vector, LinkedList, Stack, PriorityQueue, Queue, Deque
		Set - 중복허용 X, 순서유지 X
				[HashSet]
		
 */
public class Ex12 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(new Integer(9));
		hs.add(Integer.valueOf(1));
		hs.add(15); // 오토박싱 int -> Integer
		hs.add(20);
		hs.add(20); // 중복값입력하면? X
		hs.add(20); // X
		hs.add(null);
		hs.add(null); // X
		
		// [1, 20, 9, 15]
		// 20 1개 중복허용X
		//		 순서유지X
		System.out.println( hs );
		
		
		
		

	}

}
