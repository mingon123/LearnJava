package days20;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오전 11:38:07
 * @subject
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		/*
		List - 컬렉션 클래스
		Set - HashSet, LinkedHashSet
			  [TreeSet]
			  
		1. 중복허용X, 순서유지X
		2. 이진 검색 트리를 사용해서 데이터를 순서대로 저장한다.
		3. 검색, 정렬, 범위 검색을 하는 데 뛰어난 성능을 보이는 컬렉션 클래스이다.
		4. 링크드리스트 처럼 노드(Node)가 서로 연결된 구조이다.
		5. 최상위 노드를 "루트(root)노드"라고 한다.
			부모-자식 노드관계
			형제	   노드관계
		6. class TreeNode{
				TreeNode 왼쪽 자식노드; 
				Object value;		// 값을저장하는 필드
				TreeNode 오른쪽자식노드;
		   }
		7. [이진 검색 트리 구조]
		  부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치되고,
		  부모노드의 오른쪽에는 부모노드 값보다 큰 값의 자식노드가 배치된다.
		 */
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		// add 하는 순간 내부적으로 정렬되어짐.
		tset.add(7);
		tset.add(4);
		tset.add(1);
		tset.add(9);
		tset.add(5);
		tset.add(6);		
		
		// 값출력
		System.out.println( tset );
		System.out.println( tset.first() );
		System.out.println( tset.last() );
		
		// 범위검색
		SortedSet<Integer> ss = tset.subSet(4, 7);
		System.out.println(ss);
		
		// 가장가까운 값
		System.out.println(tset.higher(1) ); // 가장가까운 값 중 작은값	: 4
		System.out.println(tset.lower(1) ); // 가장가까운 값 중 작은값		: null
	
		System.out.println( tset.floor(3) ); // 가장가까운 값 중 작은값	: 1
		System.out.println( tset.ceiling(3) ); // 가장가까운 값 중 큰값	: 4
		
		
	} // main
	
} // class
