package days21;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 12:32:56
 * @subject
 * @content 
 */
public class Ex04_03 {

	enum Direction { EAST, SOUTH, WEST, NORTH	}

	public static void main(String[] args) {

		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("EAST");
		
		System.out.println( d1 == d2 ); // true 
		
		
		switch ( d1 ) {
		case EAST:	// Direction 생략되고 상수만 적으면 된다.
			break;
		case SOUTH:
			break;
		case WEST:
			break;
		case NORTH:
			break;
		}
		
		
	} // main

} // class
