package days23;

import java.io.Serializable;

public class UserInfo  implements Serializable{

	private static final long serialVersionUID = 2892176819632225432L; // 고유코드 자동완성
	String name;
	// transient : 직렬화 대상에서 제외시키는 키워드
	// 덧없는, 무상한, 일시적인..( 사전적 의미 )
	transient String password;
	int age;
	
	
	public UserInfo() {
		this("UnKnown", "1111", 0);
	}

	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
