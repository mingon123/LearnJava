package days18;

import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 9:04:00
 * @subject
 * @content 

		날짜(date), 시간(time) + 형식화(formatting)
		컬렉션 프레임워크
		
		앞으로 할 내용
		제네릭 어노테이션
		자바 IO
		---
		안함 : 스레드 + 네트워크, 람다식 +스트림
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		1. JDK 1.0 - java.util.Date 클래스
		2. JDK 1.1 - java.util.Calendar 클래스
								ㄴ GregorianCalendar 클래스
		3. JDK 1.8 - java.time 패키지 안에 여러 하위 패키지
						ㄴ 다양한 날짜와 시간을 다루는 클래스 추가...
		 */
		
		Date d = new Date(); // 현재 시스템의 날짜 + 시간
		// Mon Jan 20 09:10:40 GMT+09:00 2025 - GMT : 그리니치 천문 시
		System.out.println( d.toString() ); // fullName@hashCode16진수
		System.out.println( d.toGMTString() );
		// 2025. 1. 20. 오전 9:14:35 - 운영체제 설치 지역 시간
		System.out.println( d.toLocaleString() );
		
		// 년
		System.out.println( d.getYear() + 1900 );
		// 월
		System.out.println( d.getMonth() + 1 );
		// 일
		System.out.println( d.getDate() );
		// 시간
		System.out.println( d.getHours() );
		// 분
		System.out.println( d.getMinutes() );
		// 초
		System.out.println( d.getSeconds());
		// 밀리초 X. 없음
		// 요일
		System.out.println( "일월화수목금토".charAt( d.getDay() ) );	// getter
		
		// d.after(Date when); // 오늘날짜가 이 날짜보다 이후니? boolean형으로 반환
		// d.before(Date when); // 오늘날짜가 이 날짜보다 전이니? boolean형으로 반환
		// d.equals(d); // 같은지 확인
		// d.compareTo(Date anotherDate); // 같은지 비교 후 int형으로 반환
		
		// d.setXXX()	// set으로 시작하는 함수는 모두 정하는 함수 // setter
		
		
		
		
		
		
		
	}

}
