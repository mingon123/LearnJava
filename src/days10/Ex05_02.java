package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 5:14:11
 * @subject
 * @content 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 이진 검색( binary Search )
		//  ㄴ 필수 조건 : 정렬  (정렬되어있어야함)

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		int index = Arrays.binarySearch(m, 87);
		System.out.println(index);
		
		// 배열에 값이 존재하지 않는 경우
		// 출력 형식 : -(insertion point) - 1
		// 87은 25번 index이기 때문에 -(25)-1 = -26이라는 값이 나온다.
	}

}
