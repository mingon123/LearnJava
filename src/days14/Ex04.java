package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 12:33:05
 * @subject
 * @content

		추상화
		abstract 키워드
		  ㄴ 메서드 : 추상메서드
		  ㄴ 클래스 : 추상클래스
		  
		추상 클래스는 미완성 클래스
				는 공통적인 부분(멤버)만을 미리 선언한 클래스.     추상클래스는 자체(혼자)로는 역할을 못함.
		Employee 추상 클래스 선언
		
		 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 추상메서드가 없어도 추상 클래스로 선언 가능하다.
		// 의미) 객체를 생성하지 마라
		// Player p1 = new Player();
	
		
		// 추상클래스도 일종의 클래스이기 때문에 업캐스팅 가능하다.
		// AudioPlayer p = new CDPlayer();
		Player p = new CDPlayer(); 
		p.play(0);
		p.stop();
		
	} // main

} // class


abstract class Player{ // 추상메서드가 없어도 abstract를 붙이면 추상클래스가 됨 - 이 클래스로 객체 생성하지 말고, 자식들로부터 객체를 생성해라.
	// 필드
	boolean pause; // 작동 중지
	int currentPos; // 현재 위치

	// 생성자
	public Player() {  }
	
	// 메서드
	abstract void play(int pos);
	abstract void stop();
}


// 추상클래스를 상속...
abstract class AudioPlayer extends Player{ 
	
	// 추상클래스로부터 물려받은 추상메서드를 모두 오버라이딩하지 않으면 그 클래스도 추상 클래스가 된다. 
	// -> play는 오버라이딩했지만, stop은 오버라이딩하지 않음
	@Override
	void play(int pos) {
		System.out.println("추상메서드를 오버라이딩 완료!!!");
	}
	
} // class


class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("추상메서드를 오버라이딩 완료!!");
	}
	
	// 필드
	// 생성자
	// 메서드
}



