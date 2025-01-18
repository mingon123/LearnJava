package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오전 11:45:34
 * @subject
 * @content 
 		
  		싱글톤( Singleton ) 패턴 - 특정클래스에 대해 1개 객체 생성 패턴.
		  ㄴ싱글톤 패턴은 일반적으로 자원관리(DB 처리 객체), 설정 정보 관리, 로깅 등을 위한 클래스에서 자주 사용된다.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		// The constructor BoardDAO() [is not visible] : 접근지정자 때문에(defalut 생성자가 private이기 때문에)
 		BoardDAO dao1 = new BoardDAO();
		System.out.println( dao1.hashCode() );	// 코드가 다르다면 다른 객체로 생각
		BoardDAO dao2 = new BoardDAO();
		System.out.println( dao2.hashCode() );
		BoardDAO dao3 = new BoardDAO();
		System.out.println( dao3.hashCode() );
		*/
		
		// BoardDao.dao  X  getter/setter
		
		BoardDAO dao = BoardDAO.getInstance();
		
		// days14.BoardDAO@3ac3fd8b
		System.out.println( dao );
		
		dao = BoardDAO.getInstance();
		// days14.BoardDAO@3ac3fd8b - 같다 == 객체를 1개만 생성한다.
		System.out.println( dao );
		
	} // main

} // class


// 싱글톤 패턴  		  CRUD
// Lazy Initialization 방식
//Thread-Safe 방식
class BoardDAO { // Data Access Object
	
	private static BoardDAO dao;
	
	private BoardDAO() {	}

	/* 클래스 메서드
	// 인스턴스 메서드 -> static 붙여서 클래스 메서드로 만듦
	public static BoardDAO getInstance() {
		// Cannot use this in a static context(문맥, 배경, 환경) : 객체가 생성되기 전에 static은 먼저 올라가기 때문에 클래스 메서드에서는 this 사용 불가
		// return this.dao;
		if( dao == null ) {
			dao = new BoardDAO();
		}
		return dao;
	}
	*/
	
	// Double-Checked Locking (이중 확인 잠금) 방식 
	public static BoardDAO getInstance() {
		if (dao == null) {
			synchronized (BoardDAO.class) {
				if (dao == null) {
					dao = new BoardDAO();
				}
			}
		}
		return dao;
	}
	
} // class


	



