package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:48:08
 * @subject
 * @content 	(2)

		[문자열을 다루는 클래스]
		2) StringBuffer 클래스 - 멀티스레드 X 에 안전하지 않음 ( 비동기화 처리 X 되어져 있다. )						// 동기화 : 무전기(한쪽이 말할 때 반대쪽에서 말 못함), 비동기화(전화기, 동시에 말할 수 있다)
		3) StringBuffer 클래스 - 멀티스레드 O 에 안전함 ( == 동기화 처리 O 되어져 있다. )							// 동기화 : 공유자원에 대해 점유하고 있다면 lock을 걸어 접근하지 못하게 함.
		
2), 3) 기능, 메서드는 똑같음		
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 불변 - insert, append, delete, reverse 등 변화와 관련된 메서드 없음 - StringBuffer, StringBuffer 사용하면 됨
		String str = "다른 문자열. 안녕하세요. 홍길동 안녕입니다."; // ~~~~
		
		// "안녕" 문자열 뒤에 (hello) 문자열삽입
		StringBuffer sb = new StringBuffer(str);
//		System.out.println( sb );
		
		int fromIndex = sb.indexOf("안녕") + "안녕".length();			// ?
		int offset = sb.indexOf("안녕", fromIndex ) + "안녕".length();		// 안녕 찾아서 안녕에 hello 추가
		sb.insert(offset, "(hello)");
		
		
		// 홍길동 삭제
		int start = str.indexOf("홍길동");
		int end = start + "홍길동".length();
//		sb.replace(start, end, "");
		sb.delete(start,  end);

		// 추가
		sb.append("~~~~");
		
		// 역순
		sb.reverse();
		
		
		
		System.out.println( sb );
		
		

	} // main

} // class
