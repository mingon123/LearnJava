package days02;

public class Ex01 {
	public static void manin(String[] args) {
		
		//지역변수(local variable)는 반드시 초기화 해야 된다.
		String name = "김민곤";
		//The value of the local variable age is not used (변수를 선언하고 사용하지 않음)
		int age = 20;
		
		//The local variable name may not have been initialized (초기화 안할 시 뜨는 에러)
		//name cannot be resolved to a variable  (변수 선언 안했을 시)
		System.out.println(name);
	}
}
