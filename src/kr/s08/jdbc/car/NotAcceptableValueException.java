package kr.s08.jdbc.car;
// price의 범위 조정 클래스(문자 입력 시 예외)
public class NotAcceptableValueException extends Exception{
	public NotAcceptableValueException(String str) {
		super(str);
	}
}
