package days12;
// days12.Ex05
// 단축키: alt+shift+s 로 get,set 메서드를 만듦

public class Person {

	// 필드
	private String name;
	private int age;
	private boolean gender;

	// 생성자
	public Person() {	}  // Ex05 17Line에 오류 안생기게 하려면 원형을 생성해둬야 한다.
	
	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
	}
	
	
	// 메서드
	
	// getter, setter + 메서드 일종( 필드 설정(초기화), 필드값 얻어가는 역할. )
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// The assignment to variable name has no effect
		this.name = name;
	}

	public int getAge() {
		return age;
//		retrun age+2; 이런식으로 반환값을 바꾸는 등 암호화할 수 있음
	}

	public void setAge(int age) {
		if( age >= 0 && age <= 120) {
			this.age = age;
		} else {
			// 강제로 오류(예외) 발생
			throw new RuntimeException("0~120 범위 밖...");
		}
	}
	
	public boolean isGender() {  // 필드가 boolean형일 때는 isGender가 추가
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
} // class
