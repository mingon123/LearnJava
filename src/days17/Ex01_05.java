package days17;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오전 10:59:33
 * @subject
 * @content 
 */
public class Ex01_05 {

	public static void main(String[] args) {
		
		
		/* 내꺼 
//		ㄱ. "홍길동"을 찾아서 모든 위치를 출력하고
//   	ㄴ. 두 번째 "홍길동"을 본인이름으로 바꿔서 출력하세요. 
		  실행결과)		
	    ㄱ. 결과
	  	> 1번째 찾은 위치 : 7
		> 2번째 찾은 위치 : 19
		> 3번째 찾은 위치 : 31
		ㄴ. 결과
		안녕하세요. 홍길동입니다. 이름은 이창익입니다. 별명도 홍길동입니다. 
		*/
		
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";

		int num = 1;
		int index = data.indexOf("홍길동");		
		System.out.printf("> %d번째 찾은 위치 : %d\n", num++, index);

		while (index != -1) {
			index = data.indexOf("홍길동", index+3);
			System.out.printf("> %d번째 찾은 위치 : %d\n", num++, index);
		}
	}

}
