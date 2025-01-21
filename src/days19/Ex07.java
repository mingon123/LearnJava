package days19;

import java.util.Enumeration;
import java.util.Vector;

/**2025. 1. 21.오후 12:47:49
 * 
		Vector 컬렉션 클래스
		 ㄴ List
		 ㄴ 특징 : 순서유지, 중복허용O
		 ㄴ 멀티스레드에 안전( == 동기화 처리 O )
		ArrayList/Vector 차이점 
			동기화 처리여부 - 멀티스레드에 안전한지 차이
		
		StringBuffer/StringBuilder 차이점
			동기화 처리 여부
 */
public class Ex07 {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println( v.capacity() ); // 초기용량 : 10
		System.out.println( v.size() ); // 지금 : 0
		
		v.add("박예진");
		v.addElement("양희동"); // 기능, 매개변수는 add와 같음. 리턴값이 다름
		v.addElement("홍길동");
		// v.addAll();
		
		System.out.println( v.size() ); // 3
		
		v.trimToSize(); // 남은 방 없앰
		System.out.println( v.capacity() ); // 3
		
		System.out.println( v.get(0) ); // 순서유지됨.
		System.out.println( v.elementAt(0) ); // get()하고 똑같음
		
		v.add(1, "박정현"); // 자리에 추가
		System.out.println(v);
		
		// v.iterator()  	로 출력해보기 
		// 반복자 : fail-fast - 중간에 값이 바뀌면(수정되면) 바로 예외발생 - 중지
		
		// v.elements() : 리턴형 : Enumerator 열거자
		// 열거자 : 복사해두고 사용하기 때문에 원본이 바뀌어도 인식하지 못한다.
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		}
				
		
		// 다른 메서드 구경
		
//		v.remove(2); // index값 지움
		
//		v.clear(); // 데이터 다 지움
		
		// v.firstElement(); == v.get(0);
		// v.lastElement(); == v.get(v.size()-1);
		
		// v.insertElementAt("홍순기", 2); == v.add(2, "홍순기");
		
		// trimToSize()로 줄이고, v.setSize()로 늘림. 원래 값은 유지한채로
		v.setSize(10);
		
		
		
	} // main

} // class
