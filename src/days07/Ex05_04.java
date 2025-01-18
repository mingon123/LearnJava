package days07;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 전공자는 필수 공부

public class Ex05_04 {

	public static void main(String[] args) {
		
		// *** 람다와 스트림 ***
		IntStream st = new Random().ints(1, 46); // 랜덤하게 1~46까지 int값을 발생하는 stream을 만듦
		Stream<String> lotto = st.distinct().limit(6).sorted().mapToObj(i->i+", "); // 그 중 중복제거.6개 가져옴.오름차순 정렬.추가할 문자열
		lotto.forEach(System.out::print); // 출력
		

	} // main

} // class
