package days07;

public class Ex07 {

	public static void main(String[] args) {

	    // [문제2] x,y  두 기억공간의 값을 바꾸기
		
		int x = 10, y = 20;
		System.out.printf("x=%d, y=%d\n", x, y);		
		
	      /*  swap() 메서드 호출
	      {
	         int temp = x;
	         x = y;
	         y = temp;
	      }
	      */ 
		swap(x, y);
		
		System.out.printf("x=%d, y=%d\n", x, y);
	} // main

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}



} // class
