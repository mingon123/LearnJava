package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 9:12:18
 * @subject
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Arrays 클래스 - 배열 사용하기 쉽도록 기능(메서드)이 구현된 클래스
		// [Collections 클래스] - 컬렉션을 사용하기 쉽도록 기능(메서드)이 구현된 클래스
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// addAll 매개변수: Collection<? super T>, T...elements
		Collections.addAll(list, 1,2,3,4,5); // 값 추가
		
		/* 
		// addAll을 안썼으면 이렇게 코딩했어야 함
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
		System.out.println(list);  // [1, 2, 3, 4, 5]
		
		
		// 오른쪽으로 2칸씩 list의 요소를 이동(회전)
//		Collections.rotate(list, 2); // 2칸씩 이동
//		System.out.println(list);
		
		/*
		// ratota를 모르면 이렇게 풀어야함
		// [1] 
		List<Integer> l1 = list.subList(list.size()-2, list.size());
		System.out.println(l1);
		List<Integer> l2 = list.subList(0, list.size()-2);
		System.out.println(l2);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(l1);
		al.addAll(l2);
		System.out.println(al);
		
		list = al;
		System.out.println(list);
		*/
		
		/*
		// [2] 이렇게 for문 돌려야 됨
		list.set(0, l1.get(0);
		list.set(1, l1.get(1);
		list.set(2, l1.get(0);
		list.set(3, l1.get(1);
		list.set(4, l1.get(2);
		*/

		
//		Collections.swap(list, 0, 2); // 값 서로 바꿈
//		System.out.println(list);
		
		/*
		// swap을 모르면 이렇게 풀어야 함
		int temp = list.get(0);
		list.set(0, list.get(2));
		list.set(2, temp);
		*/

		
//		Collections.shuffle(list); // 무작위로 섞음
//		System.out.println(list);
		
		
		// 오름차순 정렬
		Collections.sort(list);
		// 내림차순 정렬
//		Collections.sort(list, Collections.reverseOrder());
//		Collections.reverse(list); // 정렬후 반대로 
//		System.out.println(list);
		
		
//		Collections.fill(list, 100); // 전부 100으로 채움
//		System.out.println(list);
		
		
		// Collections.copy(복사할list, 원본list); // 복사
		
		
		Collections.replaceAll(list, 1, 100); // 1을 전부 100으로 바꿈
		System.out.println(list);
		
		// 등등 다른 메서드들이 있다.
		
		
	} // main
	
} // class
