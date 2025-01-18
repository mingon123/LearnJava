package days06;

// **중요

public class Ex04 {

	public static void main(String[] args) {

		// 4-5 일때 for문 전체를 중단하고 뒤에는 출력하지 않음
		
		out:	// 라벨명 뒤 콜론(라벨명은 알아서)
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i==4 && j==5) break out; // break 라벨; 을 통해 원하는 수준까지 반복을 종료할 수 있다.
				System.out.printf("(%d-%d)", i, j);
			} // for j
			System.out.println();
		} // for i

		
		
	} // main

} // class
