package days19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 

ArrayList 컬렉션 클래스
1. 가장 많이 사용되는 컬렉션 클래스
2. List 인터페이스를 구현한 클래스
	( 순서유지O, 중복허용O)


 */
public class Ex03 {

	public static void main(String[] args) {

		/*
		String [] names = new String[15];
		names[0] = "박정현";   0번째요소
		names[1] = "양희동";	 1번째 요소(element)
		*/
		// 위에 대신에 ArrayList를 사용 - 배열의 단점들이 다 없어짐 : 크기증가X 등등..
		
		// <E> : E == Element == 요소
		// <E> , <? extends E> : 제네릭( Generics ) X
		ArrayList list = new ArrayList (3); // 값을 안주면(디폴트 생성자) 10개짜리 방. 크기를 증가시키려면 값을 할당하면 됨 - 자동으로 증가하기 때문에 줄 필요없음
		
//		System.out.println( list.isEmpty() ); // 요소가 있는지 없는지 유무확인. true
		list.add("박정현");	// 특징 : 중복허용O, 순서대로 추가
		list.add("박예린");
		list.add("양희동");
//		System.out.println( list.add("박정현") );	// true, 순서대로 추가됨..
		list.add("김대원"); // 배열과 다르게 자동으로 크기가 증가
//		System.out.println( list.isEmpty() ); // 요소가 비어있니? false
		
		list.add(2, "주종오");	// 자리값 지정 가능
		// [박예린, 양희동, 주종오, 김대원] : toString을 오버라이딩
		System.out.println( list );
		System.out.println( list.size() ); // 요소의 갯수
		list.trimToSize(); // 뒤에 남는(할당되지 않은) 방 삭제
		
		// boolean 있다/없다 확인
//		System.out.println(list.contains("이찬희"));
//		System.out.println(list.contains("주종오"));
		
		
		// "주종오" -> "이찬희" : 자리찾고 학생 변경
		int index = list.indexOf("주종오");
		System.out.println( index );		
		// [1]
//		list.remove(index);
//		list.add(index, "이찬희");

		// [2]
		list.set(index, "이찬희");
		
		System.out.println( list );

		
		
		// [문제] 박씨 성을 가진 학생을 제거 - 리스트에서 삭제하면 자동정렬(index값 -1씩)되어서 제대로 삭제되지 않음. 
		// [1]
//		for (int i = 0; i < list.size(); i++) {
//			String name = (String) list.get(i);	// 다운캐스팅
//			if( name.startsWith("박") ) {
//				System.out.println(name);
//				list.remove(i);
//				i--;	// 자동정렬 문제 해결
//			}
//		}
		
		
		// [2] : 뒤에서부터 계산
//		for (int i = list.size()-1; i >= 0; i--) {
//		String name = (String) list.get(i);	// 다운캐스팅
//		if( name.startsWith("박") ) {
//			System.out.println(name);
//			list.remove(i);
//			}
//		}
		
		// [3] removeIf
		// <T> Type : 여기서는 String 형이라 String 사용
//		list.removeIf( new Predicate<String>() {
//
//			@Override
//			public boolean test(String name) {
//				
//				return name.startsWith("박");
//			}
//		} );

		// [4] 람다식
//		list.removeIf( name -> ((String)name).startsWith("박") );
		
		
		// 오름차순 정렬
		list.sort(null); // [김대원, 박예린, 박정현, 양희동, 이찬희]
		
		// 내림차순 정렬
		// [1]
//		list.sort(Comparator.reverseOrder());
		
		// [2]
//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});

		// [3] 람다식
		list.sort( (o1, o2) -> ((String)o2).compareTo( (String)o1) );	

		
		
		// 모든 요소 제거
//		list.clear();
		
		System.out.println( list );
		
		// 1~3 요소를 얻어오기
		int fromIndex = 1;
		int toIndex = 3 + 1;
		List list13 = list.subList(fromIndex, toIndex); // 리턴자료형 : List
		System.out.println( list13 );
		
		
		
		
		
		
		
	} // main

} // class
