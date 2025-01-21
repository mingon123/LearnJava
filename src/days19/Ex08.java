package days19;

/**2025. 1. 21.오후 2:23:02
 * 
 * 
System.err.print()
에러 메세지 출력용

- 독립적인 스레드를 사용하기 때문에 언제 실행되는 지 몰라 위치를 알 수 없다. - 실행할 때마다 다름



		LinkedList( 링크드 리스트) 컬렉션 클래스
	
	1. 배열 : 단점 - 자동으로 크기가 조절되지 않는다, 
				   비순차적인 데이터를 삽입/삭제할 때 성능이 떨어진다.
			 장점 - 읽기 성능이 가장 빠르다.
			 
	2. 링크드리스트
		특징 : (메모리상에서)비연속적이다. 
		
		단방향 링크드리스트 구조
		양방향
		단방향 환형 링크드리스트 구조 - 뒤에값이 앞 주소를 참조하고 맨 앞의 값이 맨 뒤의 주소를 참조하여 원형을 이룸
		양방향 환형 링크드리스트 구조
	

 */
public class Ex08 {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.err.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.err.println("8");
//		System.out.println("9");
//		System.out.println("10");

		// 단방향 링크드 리스트
		// node1 - node2 - node3 - node4
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 20;
		
		Node node3 = new Node();
		node3.value = 30;

		Node node4 = new Node();
		node4.value = 40;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		Node node = node1;
		while (node != null) {
			System.out.println( node.value );
			node = node.next;
		}
		
		
		/*
		// [문제] 노드2와 노드3 사이에 노드5 추가(삽입) 코딩하세요..
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		// node1 - node2 - node5 - node3 - node4로 연결됨
		
		// node3 삭제
		node5.next = node4;
		// node1 - node2 - node5 - node4로 연결됨

		// 가장 마지막 node4 삭제
		node5.next = null;
		*/
		
		
	} // main

} // class

// 노드
class Node {
	
	int value = 0;
	Node next = null; // 뒤의 값
	// Node prev // 앞방향 : 있으면 양방향

}










