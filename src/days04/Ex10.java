package days04;

/*
	foreach문 + 배열 또는 컬렉션
	
 */

public class Ex10 {

	public static void main(String[] args) {

		int [] kors = new int[3]; 
		kors[0] = 100;
		kors[1] = 87;
		kors[2] = 80;
//		kors[3] = 92; x(주의)
		
		/*
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
		 */
		
		for(int i = 0; i<kors.length; i++) { //kors.length = 배열크기
			System.out.println(kors[i]);			
		}

		// 배열은 그 값을 할당하지 않으면 그 자료형의 기본값이 들어가있다. 정수: 0, 실수: 0.0, boolean: false
		
		// foreach문 사용 - 배열 등에 들어가 있는 값을 읽기용으로만 사용
		for (int kor : kors) {
			System.out.println( kor );
		}
		
	}

}
