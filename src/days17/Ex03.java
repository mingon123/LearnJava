package days17;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오전 11:21:53
 * @subject
 * @content 

		String -> 불변
		StringBuffer(동기화O) / StringBuilder(동기화X)
 */
public class Ex03 {

	public static void main(String[] args) {

		// "a"+"a"+"a"+"a" ... 20만번
//		testString();
		tsetStringBuffer();
		
		
//		- String : a인스턴스 뒤에 a를 추가하는게 아니라 계속 새로운 인스턴스가 만들어져서 시간이 오래걸림 - String은 불변이기 때문에 생성된 String 객체는 변경할 수 없기 때문	
//		- StringBuffer : 미리 비슷한 객체를 모아 '풀(pool)'을 만들어두고 변경을 내부 버퍼에서 하기 때문에 빠름
		
		System.out.println(" end ");
	} // main

	
	// 200만번 : > 처리시간 : 10854500ns == 1ms
	private static void tsetStringBuffer() {
		long start = System.nanoTime();
		
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			sb.append("a");
		} // for i
		
		long end = System.nanoTime();
		System.out.printf("> 처리시간 : %dns\n", ( end-start ) );
	}

	// 20만번 : > 처리시간 : 2484072600ns	2s 484072600ns			
	// 200만번 : 	3분 강제 종료...			
	private static void testString() {
		long start = System.nanoTime();
		
		String sb = "a";
		for (int i = 0; i < 2000000; i++) {
			sb += "a";
		} // for i
		
		long end = System.nanoTime();
		System.out.printf("> 처리시간 : %dns\n", ( end-start ) );
	}

} // class
