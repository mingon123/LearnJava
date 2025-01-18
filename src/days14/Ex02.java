package days14;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오전 11:27:32
 * @subject
 * @content 
		
		매개변수 다형성
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// [ 오토박싱, 오토언박싱 ] X(아직안배움)
		// java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
		//                String format                    Object...args      
		// System.out.printf("%s", new Scanner(System.in), 100 , 'A');
		
		// 100   int  기본형 8가지
		// 'A'   char    "
		
		
		// 객체, Object 형태를 달라고 했는데 기본형인 int, char형을 줘도 되는 이유
		
		// 매개변수 다형성 : 자식 클래스이기 때문에 자동 업캐스팅되기 때문
		
		test(new ArrayList());
		test(new Vector());
		
//		ArrayList Arraylist = new ArrayList();
		List list = new ArrayList();
		
		// Collection c를 주라고 했는데 List list를 줘도 되는 이유 : 매개변수 다형성 - Collection이 List의 부모클래스이기 때문이다.
		ArrayList list2 = new ArrayList(list); // Collection c = List list
	} // main

	private static void test(List list) { // 매개변수 다형성 : ArrayList형태를 달라고 했는데 List를 줘도 되는 이유
//	private static void test(ArrayList arrayList) { // 매개변수 다형성
		//
		//
		//
	}

} // class
