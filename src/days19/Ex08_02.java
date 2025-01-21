package days19;

import java.util.LinkedList;

/**2025. 1. 21. - 오후 3:04:18
 * 
 * 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// node1 - node2 - node3
		LinkedList list = new LinkedList();
		list.add("권용범");
		list.add("김대원");
		list.add("김민곤");
		list.add("김하은");
		list.add("라일락");
		
		list.addFirst("박세훈"); // 첫 노드 삽입
		list.addLast("박예진"); // 마지막 노드 삽입
		
		System.out.println( list );
		
		// 박세훈 -> 오재문 값 변경
		//boolean list.contains("박세훈");
		int index = -1;
		if ( (index = list.indexOf("박세훈")) != -1) {
			list.set(index, "오재문");
		}
		
		// list.remove(); 중복선언
		// 첫번째 일치하는 객체를 삭제 - removeFirstOccurrence()
		list.removeFirstOccurrence("홍길동"); 
		
		System.out.println( list );
		
		// 순차적으로 추가/삭제 : ArrayList
		// 중간	   추가/삭제 : LinkedList
		
	} // main

} // class
