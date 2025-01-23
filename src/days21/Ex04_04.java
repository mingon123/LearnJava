package days21;

import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 12:36:18
 * @subject
 * @content

 		[ 열거형에 멤버 추가 ]
 */
public class Ex04_04 {

	// The constructor Ex04_04.Direction(int, String) is undefined - 생성자에 (int)가 선언되지 않아서 오류
	enum Direction { 
		EAST(100, ">"), SOUTH(200, "V"), WEST(300, "<"), NORTH(400, "^");	// 세미콜론찍고
		
		// 필드
		private final int value; // 100, 200, 300, 400 저장할 필드 추가
		private final String symbol; 
		
		
		// 생성자
		/*	symbol 초기화를 안해서 오류생김.
		private Direction(int value) {
			this.value = value;
		}
		*/
		
		private Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
		}

		// getter
		public int getValue() {
			return value;
		}

		public String getSymbol() {
			return symbol;
		}
		
		// 추상메서드 선언할 수 있다.
		// abstract int test();
		
		
	}
	
	public static void main(String[] args) {
		
		Direction [] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.println( d.name() + "/" + d.getValue() + "/" + d.getSymbol() );
		}
		
		
		
	} // main

} // class

/*
	enum Direction { EAST, SOUTH, WEST, NORTH }  열거형(enum) 선언
		↓
	클래스 변환
		↓
	class Direction{
		static final Direction EAST = new Direction("EAST");
		static final Direction SOUTH = new Direction("SOUTH");
		static final Direction WEST = new Direction("WEST");
		static final Direction NORTH = new Direction("NORTH");
	} 
*/








