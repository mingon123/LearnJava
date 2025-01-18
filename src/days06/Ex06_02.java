package days06;

public class Ex06_02 {

	public static void main(String[] args) {
		
//		[문제] 1/2-2/3+3/4-4/5+...-8/9=???
		
//		분자 : 1~8, 분모 : 2~9
		
		boolean sw = false;
		double sum = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.printf( "%d/%d" + (sw ? "+" : "-") , i, i+1);
			
//			삼항연산자로 계산하기
			
			if(!sw) {
				sum += (double)i/(i+1);
			} else {
				sum -= (double)i/(i+1);
			}
			sw= !sw;
		}
		System.out.printf("\b=%f \n", sum);
		
		
		
		
		

	}

}
