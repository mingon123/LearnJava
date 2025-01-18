package days06;

public class Ex06 {

	public static void main(String[] args) {
		
//		[문제] 1-2+3-4+5-6+7-8+9-10=-5
//		홀수- sum += i
//		짝수+ sum -= i
		
		/* 
		[1]
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.printf("%d+", i);
				sum+=i;
			} else {
				System.out.printf("%d-", i);
				sum+=i;
			}
		}
		System.out.printf("\b=%d \n", sum);
		*/
		
		
		// 스위칭변수 선언 - on/off느낌 
//		[2]
		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <= 10; i++) {
			System.out.printf(sw ? "%d+" : "%d-", i);
			sum += (sw ? -i : +i);
			sw = !sw;
		}
		System.out.printf("\b=%d \n", sum);
		
		
// 아래는 스위칭변수 만들다 남은 짜투리
//			// if (sw == false) {
//			if ( !sw ) {
////				System.out.printf("%d-", i);
//				sum += i;
//			} else {
////				System.out.printf("%d+", i);
//				sum -= i;
//			}
//			System.out.printf("\b=%d \n", sum);
//			sw = !sw;
//		} // for
		
		
		
		
	} // main

} // class
