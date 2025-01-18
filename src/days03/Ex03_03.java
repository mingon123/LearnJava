package days03;

// 오버플로우 = 표현할 수 있는 값보다 넘치는 값을 할당함
// 언더플로우 = 표현할 수 있는 값보다 부족한 값을 할당함

public class Ex03_03 {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
		
		int j = 200;
		int k = i + j; //산술 오버플로우 발생
		//long k = i + j; //long k를 해도 오버플로우 발생 - 이미 i+j에서 integer의 최댓값이 넘었기 때문
		//long k = (long)i + j; // i나 j 중 하나를 값을 담을 수 있는 크기의 자료형으로 바꾸면 제대로 된 값을 반환함
		
		//			  	  100  200  300
		System.out.printf("%d + %d = %d", i, j, k);
		// 2147483647 + 200 = -2147483449 - integer의 최댓값이 넘어서 = 오버플로우
		
	}

}
