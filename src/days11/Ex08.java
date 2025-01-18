package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 3:56:55
 * @subject
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		// 4:05 수업 시작합니다~.
		// [1. 클래스 앞에 접근지정자]
		//     1) public (활)
		//     2) protected(비)
		//     3) default(package)(활)
		//     4) private (비)
		
		// [2. 멤버(필드 또는 메서드, 생성자) 앞에 접근지정자 ]
		//	   1) public           - 패키지 내/외부 어디서나 접근(참조) 가능.
		//     2) protected        - default + 상속( 패키지 외부에서 자식 클래스에 접근 가능)
		//     3) default(package) - 패키지 내부에서만 접근(참조) 가능 
		//     4) private          - 같은 클래스 내에서만 접근(참조) 가능 
		
		// days11.Time
		// days11.Ex08
		// 1) 패키지 내부에서 필드 접근지정자 종류별로 테스트 
		Time t = new Time();
		t.hour = 1;
		t.minute = 1;
		t.second = 1;
		// The field Time.milisecond is not visible
		//t.milisecond = 1;
		//t.test();
		
	} // main

} // class











