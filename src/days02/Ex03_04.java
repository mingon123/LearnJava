package days02;

//x라는 정수를 저장할 변수 선언, 출력: 10으로 초기화

public class Ex03_04 {

	public static void main(String[] args) {

		/*
		int x = 10;
		int y = 20;
		int z = 30;
		이걸 아래처럼 변경해야함
		*/
		
		int x=10, y=20, z=30;
		
		// 개행 - '\n' 엔터치는 작업을 하면 내부적으로는 \r\n이 실행됨
		System.out.printf("x=%d, y=%d \n", x, y);
		System.out.printf("x=%d, y=%d, z=%d \n\n", x, y, z);
		
		//두 자료 값을 바꿀 경우 동일한 자료형의 임시기억공간이 필요
		//지역변수 설정으로 temp를 다른 곳에서 더 사용하지 못하게 하면 깔끔한 코딩이 됨
		{
		int temp = x;
		x = y;
		y = temp;
		}
		
		System.out.printf("x=%d, y=%d", x, y);
		
		
	} //main

} //class

