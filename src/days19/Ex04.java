package days19;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) { 
//		1조 : 박정현, 김하은, 김민곤, 박예진, 양희동(3)
//		2조 : 주정호, 최지우, 김대원, 이찬희, 라일락(1)
//		3조 : 윤형식, 오재문, 박세훈, 유예나, 권용범(2)

		// 클래스 배열
		// ArrayList[] teamArr = new ArrayList[3];	// 이런코딩은 이제 못볼 것. ArrayList안에 요소로 ArrayList를 입력하면 되니까
		
		ArrayList team1 = new ArrayList();
		ArrayList team2 = new ArrayList();
		ArrayList team3 = new ArrayList();
		
		team1.add("박정현");
		team1.add("김하은");
		team1.add("김민곤");
		team1.add("박예진");
		team1.add("양희동");
		
		team2.add("주정호");
		team2.add("최지우");
		team2.add("김대원");
		team2.add("이찬희");
		team2.add("라일락");

		team3.add("윤형식");
		team3.add("오재문");
		team3.add("박세훈");
		team3.add("유예나");
		team3.add("권용범");
		
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		
		//							 (Collection c) 매개변수 : 객체를 넣어도 무방하다.
		ArrayList classE = new ArrayList(team1);
		classE.addAll(team2);
		classE.addAll(team3);
		
		System.out.println( classE );
		
		// 기능			: team1에 있는 요소와 team2에 있는 요소 중에 공통요소만 남기는 메서드
		// 매개변수		 : Collection c 
		// 리턴값(리턴자료형) : boolean
		// a,b,c,d	// team1
		//   b,c,d,g// team2
//		 team1.retainAll(team2); // b,c,d만 남음

		
		// [모든 classE 요소를 출력]
		// [1]
		for (int i = 0; i < classE.size(); i++) {
			String name = (String) classE.get(i);
			System.out.println( name );
		}

		// [2] *** iterator() 메서드 : 반복자
		// 반복자
		Iterator ir = classE.iterator();
		// boolean hasNext() : 다음 요소가 있으면 true / 없으면 false	
		// 		   next() : 요소를 읽어올 때
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println( name );
		}
		
		
		// toArray() : 리스트 -> 배열
		Object[] arr = classE.toArray();
		
	}

}
