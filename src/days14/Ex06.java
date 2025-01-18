package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 2:20:07
 * @subject
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		[ 인터페이스(interface) ]
		1. 자바 자료형
			1) 기본형 8가지
			2) 참조형 ( 배열, 클래스, 인터페이스 )
		2. 일종의 추상 클래스이다.
		3. 차이점	- (추상클래스와 차이점)
			1) 일반 메서드 선언 X
			2) 100% 추상 메서드
			3) 필드 선언 X, 상수만 선언      == 변수 선언 못함
		4. 인터페이스는 그 자체만으로 사용되지 않고, 다른 클래스를 작성하는 데 도움을 줄 목적의 클래스
		5. 모든 필드는 public static final 이다.
			interface IX{
				int age;
				== public static final int age;과 같은 의미이다.
			
				void test();
				== public abstract void test(); 와 같다.
			}
		6. 모든 메서드는 public abstract 이다.
		7. JDK1.8부터 인터페이스 안에
			1) static 메서드
			2) default 메서드
			를 선언할 수 있다.
		8. 인터페이스끼리 상속이 가능하다.					== 인터페이스도 추상 클래스의 일종이고, 추상클래스도 클래스로 생각하기 때문
			extends 키워드를 사용한다.
		9. 인터페이스를 구현할 때는 implements 키워드를 사용한다.
			interface List{
			}
			
			class Sample implements List{
			}
		10. 클래스는 다중 상속을 지원하지 않지만 인터페이스를 사용해서 다중 상속이 가능하다.
		
		11. 인터페이스 선언 형식
			[접] interface 인터페이스명 [extends 인터페이스...] {
				// 상수만
				// 추상 메서드만
				
				// JDK1.8~
				// static 메서드 또는 default 메서드
			}
		 */

	} // main

} // class


// (군사)부대, 한 사람, 단일체
class Unit {

	// 필드
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
	int currentHP; // 현재 유닛의 체력
	
}

// 하늘 유닛
class AirUnit extends Unit {
	// 필드, 메서드 선언X
}

// 땅 유닛
class GroundUnit extends Unit {
	// 필드, 메서드 선언X
}

interface Movable {
	// 상수, 추상메서드 + static, default 메서드만 선언.
	void move(int x, int y);	// 앞에 public abstract 생략
}

interface Attackable {
	void attack(Unit unit); // 매개변수(unit) == 공격대상유닛
}

// 인터페이스의 다중 상속
interface Fightable extends Movable, Attackable {
	
}

class Fighter implements Fightable {  // 구현할 때는 implements 사용

	@Override
	public void move(int x, int y) {
		// 구현 코딩..
	}

	@Override
	public void attack(Unit unit) {
		// 구현 코딩..
	}
	
}


// [용도]
// 이 인터페이스를 구현한 클래스는 수리가 가능한 클래스(유닛)이다.		- 아무것도 없는 인터페이스의 용도
interface Repairable {
	// 상수, 추상메서드, static, default메서드 X
}

// 탱크
class Tank extends GroundUnit implements Fightable, Repairable{

	// 필드
	// x,y
	// currentHp
	
	@Override
	public void move(int x, int y) {
		// 바퀴로 이동
	}

	@Override
	public void attack(Unit unit) {
		// 포를 쏘는 공격
	}
	
}

// 해병대원
class Marine extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// 구현
	}

	@Override
	public void attack(Unit unit) {
		// 구현
	}
	
}

// 수송선
class DropShip extends AirUnit implements Fightable, Repairable {

	@Override
	public void move(int x, int y) {
		// 구현
	}

	@Override
	public void attack(Unit unit) {
		// 구현
	}
	
}

//
class SCV extends GroundUnit implements Repairable {
	
	SCV() {	// 생성자
		
	}
	
	// 수리 기능의 메서드
	// Repairable t = new Tank(); 	// 업캐스팅
	// Repairable t = new DropShip();
	// Repairable t = new SCV();
	
	// implements를 안하면 전부 하나씩 메서드를 선언해야하는데 다형성에 의해 하나만 선언해도 가능
	void repair(Repairable target) { // Tank, DropShip, SCV	-> 업캐스팅, 매개변수 다형성 설명 가능
		if ( target instanceof Unit ) {
			Unit u = (Unit) target;
			System.out.println("해당 유닛을 수리 완료!!!");
		}
	}
	
	
	/*
	// implements를 안하면 하나씩 전부 메서드를 선언해야 함
	void repair(Tank t) { // Tank, DropShip, SCV
		
	}
	void repair(DropShip t) { // Tank, DropShip, SCV
		
	}
    void repair(SCV t) { // Tank, DropShip, SCV
		
	}
	*/
	
	
}








