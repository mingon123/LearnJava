package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 4:34:50
 * @subject
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// 이진 검색( binary Search )
		//  ㄴ 필수 조건 : 정렬  (정렬되어있어야함)

		/*
		// 0~198까지 50개
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		*/
		
		int [] m = new int[1000000];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(   Arrays.toString(m)   );
		/*
		  [0]                [24]                    [49]  
		   0                  86                     198
		  
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12를 입력
		int index = -1;
		index = binarySearch(m, n);
		if(index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.", n, index);
		} else {
			System.out.println("찾는 정수는 없다.");
		}
		
	} // main

	/*
	1. 배열의  bot/top 변수 저장
    2. mid = (bot+top)/2
    3. 
                  n== m[mid]   같으면 찾았기에  return mid
                  n   >  m[mid]  새로운 bot = mid +1
                  n   <  m[mid]  새로운 top = mid - 1
     4.   위의 3번 코딩을 반복문을 사용해서 반복하다..    bot > top 이럴 때는 반복문을 빠져나와야 겠따.
	*/
	
	private static int binarySearch(int[] m, int n) {
		int bot = 0, top = m.length-1, mid ;
		int count = 0;  // 찾은 횟수
		while ( bot <= top ) {
			count++;
			mid = (bot+top) / 2;
			if (n==m[mid]) {
				System.out.println("> 찾은 횟수 : " + count);
				return mid;
			}
			else if (n> m[mid]) bot = mid + 1;
			else top = mid-1;
		} // while
		System.out.println("> 못 찾은(최대) 횟수 : " + count);
		return -1;

	}
}
