package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오후 5:14:42
 * @subject
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {

		// E e = new R() 업캐스팅
		// R e2 = ( R) e; 다운캐스팅
		
		
//		Employee emp1 = new Employee("김민곤", "서울 강남구", "010-1111-2222", "2025.06.31");
		
		// 다운캐스팅 : 부모 -> 자식 형변환
		// Type mismatch: cannot convert from Employee to Regular
		
		// java.lang.ClassCastException: 
		// class days13.Employee cannot be cast to class days13.Regular (days13.Employee and days13.Regular are in module javaPro of loader 'app')
		// new Employee로 객체를 생성했기 때문에 Regular로 강제 형변환할 수 없다. = new Regular()을 했었다면 오류가 발생하지 않는다.
//		Regular emp2 = (Regular) emp1;
		
		System.out.println(" END ");
	} // main

} // class
