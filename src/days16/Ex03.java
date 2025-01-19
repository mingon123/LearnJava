package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:07:01
 * @subject
 * @content 
 
 		어떤 객체로부터 클래스 정보를 얻어오는 방법				// Class<?> 를 얻어오는 방법만 알면됨
 		getClass() -> Class<?>  		// getClass()쓰면 Class<?> 형으로 반환
 		getName()	days15.Ex05	== fullName으로 반환
 */
public class Ex03 {
	
	public static void main(String[] args) {
		

//		Card c1 = new Card();
//		System.out.println( c1.toString() );
//		System.out.println( c1 );	// 위와 같음

		
		// [첫 번째 방법]
//		Card c = new Card("HEART", 3);
//		Class cls = c.getClass();
//		String fullName = cls.getName();
//		System.out.println( fullName ); // days16.Card

		
		// [두 번째 방법]		모든 클래스의 static 필드 : .class 가 존재
//		Class cls = Card.class;
//		// 얻어온 Class cls 객체를 사용해서 인스턴스를 생성할 수 있다.
//		// new 클래스명();	 new Card(); 	이렇게 안해도됨.
//		
//		// Unhandled exception type IllegalAccessException - 
//		try {
//			// The method newInstance() from the type Class is deprecated since version 9  - 가운데 취소선 그어져있는 멤버는 미래에 사라질 메서드,필드
//			Card c = (Card) cls.newInstance();
//		} catch (InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
		
		
		// [세 번째 방법]
		String className = "days16.Card";	// 풀네임
		try {
			// JDBC할 때 사용 코딩...
			Class cls = Class.forName(className);
			// JDBC Driver : 자바에서 DB관리 드라이버
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	} // main
	
} // class

final class Card { // 최종 클래스
	
	String kind; // 카드 종류
	int num; // 카드 번호
	
	// 디폴트 생성자
	Card() {
		this( "SPADE", 1 );
	}
	
	// 생성자
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %d", this.kind, this.num);
	}
	
	
}


