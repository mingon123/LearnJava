package days17;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오전 10:40:20
 * @subject
 * @content 
 */
public class Ex01_04 {

	public static void main(String[] args) {
		/*
		2. 문자열 다루는 문제.
		  String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		  ㄱ. "홍길동"을 찾아서 모든 위치를 출력하고
		  ㄴ. 두 번째 "홍길동"을 본인이름으로 바꿔서 출력하세요. 
		   
		  실행결과)
		    ㄱ. 결과
		  	> 1번째 찾은 위치 : 7
			> 2번째 찾은 위치 : 19
			> 3번째 찾은 위치 : 31
			ㄴ. 결과
			안녕하세요. 홍길동입니다. 이름은 이창익입니다. 별명도 홍길동입니다. 
		 */
				
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String word = "홍길동";
		int wordLength = word.length();
		
		int fromIndex = 0; // 찾기 시작 위치
		int index = -1; // 찾은 위치 저장
		int cnt = 1;
		
		// 2번째 찾았을 때의 위치만 저장	- 없거나 1개만 있을 때 어떻게 할건지도 생각.
		int start = -1;
		int end = start + wordLength;
		
		while (( index = data.indexOf(word, fromIndex)) != -1 ) {
			System.out.printf(">%d번째 찾은 위치 : %d\n", cnt, index);
			fromIndex = index + wordLength;
	
			if ( cnt == 2 ) {	// 2를 변수줘서 다르게 할 수도 있음	
				start = index;
				end = fromIndex;
			}
			cnt++; // cnt를 위에서 출력하자마자 증가시키면 if문에서 값의 직관성이 떨어진다. 마지막에 증가시켜 1이 아니라 2번째라고 볼 수 있도록
		
		} // while

		
		// String -> StringBuffer 변환 (문자열 수정할 것이기 때문)
		StringBuffer sb = new StringBuffer(data);
		System.out.println( sb );
		
//		int start = 19;		// index번호가 19니까 일단 결과 바뀌나 확인만
//		int end = 19 + wordLength;
		sb.replace(start, end, "김민곤");		// 어디서부터 어디까지를 대신할거냐
		
		String cdata = sb.toString();
		System.out.println( cdata );
	
	} // main

} // class
