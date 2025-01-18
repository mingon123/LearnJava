package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 2:09:19
 * @subject
 * @content
 
  		클래스를 설계할 때
  		추상화 작업 언제/어떻게 해야하는지 이해...
 */
public class Ex05 {

	public static void main(String[] args) {
		

		
	} // main
	
} // class


/*
//해병대원
class Marine{
	int x, y; // 현재위치
	void move(int x, int y) { }
	void stop() { }	
	
	void stimPack() { } 
}

// 탱크
class Tank{
	int x, y;
	void move(int x, int y) { }
	void stop() { }
	
	void changeMode() { }  // 공격모드 변환하는 메서드
}

class DropShip{
	int x, y;
	void move(int x, int y) { }
	void stop() { }
	
	void load() { } // 수송선에 짐을 올리는 메서드
	void unload() { } // 수송선에 짐을 내리는 메서드
}
*/

/*

// 추상화 - 공통부분을 따로 빼는 것.
// 유닛 - Marine, Tank, DropShip

abstract class Unit{	
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}

//해병대원
class Marine extends Unit{
	void stimPack() { }

	@Override
	void move(int x, int y) {

	}

	@Override
	void stop() {

	} 
}

//탱크
class Tank extends Unit{
	void changeMode() { }  // 공격모드 변환하는 메서드

	@Override
	void move(int x, int y) {

	}

	@Override
	void stop() {

	}
}

class DropShip extends Unit{
	void load() { } // 수송선에 짐을 올리는 메서드
	void unload() { } // 수송선에 짐을 내리는 메서드
	@Override
	void move(int x, int y) {

	}
	@Override
	void stop() {
		
	}
}

*/





