package days02;

//논리형(boolean)

public class Ex06_02 {

	public static void main(String[] args) {
		
		// 성별: 남(true), 여(false) 설정해서 처리
		// 변수 선언 형식 : 자료형 변수명 [=초기값];
		boolean gender;

		// Type mismatch: cannot convert from int to boolean - 0을 int형으로 인식하는데 gender는 boolean형이라 왼쪽과 오른쪽의 타입이 다름
		//gender = 0;
		
		gender = false;
		
		//Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%B' - 인자가 빠짐, 아래처럼 인자 횟수를 맞춰줘야함
		//System.out.printf("성별: %b - %B \n", gender);
		System.out.printf("성별: %b - %B \n", gender, gender);
		
		//1번만 입력하고 같은 값 계속 쓸거면 %1$b처럼 1$를 붙여주면 됨
		System.out.printf("성별: %1$b - %1$B \n", gender);
		
		
		/*
		 printf()
		 			conversion(변환 단어) : printf 위에 커서 올리고 'Format string syntax' 클릭하여 확인 
		 string			s
		 int			d o x
		 double			f e g a
		 char			c C
		 boolean		b B
		 */
		
		//메뉴 - search - quick search : 내 코드에 있는 단어 찾는 방법
	}

}
