package days18;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 3:03:57
 * @subject
 * @content
필수 암기 
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		JDK1.8~ java.time 패키지 및 하위 패키지 추가
					ㄴ 날짜, 시간 다루는 클래스

		1. java.time패키지 이미지 5개 외우기
		
		2. java.time 패키지의 핵심 클래스
			ㄴ 날짜 클래스, 시간 클래스 분리
		 1) 날짜 				: LocalDate 클래스
		 2) 시간 				: LocalTime 클래스
		 3) 날짜 + 시간 		: LocalDateTime 클래스
		 4) 날짜 + 시간 + 시간대	: ZonedDateTime 클래스
		
		ㄴ (핵심 클래스) 모두 Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현한 클래스이다.
		
		3. 날짜와 날짜 사이의 간격 : Period 클래스
		   시간과 시간 사이의 간격 : Duration 클래스
		
		ㄴ (3.==) TemporalAmount 인터페이스를 구현한 클래스이다.
		
		4. 객체 생성
			ㄴ new 연산자로 객체 생성 X
			ㄴ now(), of()
				
		5. 특정필드(년,월,일,시,분,초,요일...) 가져올 때 사용 메서드
			ㄴ get(field)
			ㄴ getXXX() // Year, Month..	
			ㄴ plus() / minus()
			
		6. TemporalUnit 인터페이스	
			ㄴ 날짜, 시간의 단위를 정의해 놓은 인터페이스
			ㄴ 구현한 클래스 : ChronoUnit 클래스
			
		7. TemporalField 인터페이스
			get(int field)
			ㄴ 필드(field)를 정의해 놓은 인터페이스
			ㄴ 구현한 클래스 : ChronoField 클래스
		*/
		
		
	} // main

} // class
