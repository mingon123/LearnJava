package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 3:22:26
 * @subject
 * @content

		인터페이스 설명 예제.
		
		[인터페이스 사용 장점]
		1. 개발 시간을 단축.
			인터페이스
			 추상메서드();
			 추상메서드();
			 추상메서드();
			
			class 클래스명 implements 인터페이스 {
				추상메서드();
				추상메서드();
				추상메서드();
			}
		2. 표준화 가능.
			move() {}
			attack() {}
		3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수도 있다.	- Repairable

		예) DBMS - Oracle / MS SQL / My SQL 등등
				연결
				CRUD
		
		  IDBConn <- 인터페이스로 db관리
		
		등등.. (많은 장점이 있다)
	
 */
public class Ex07 {

	public static void main(String[] args) {
		// [오라클 DBMS 사용해서 DB 처리]
		IDBConn dbconn = new OracleDBConn();
		
		// [MS SQL DBMS}
//		IDBConn dbconn = new MSSQLDBConn();
		
		dbconn.open();
		dbconn.select();
		
		/*
		인터페이스를 사용하면 유지보수가 훨씬 쉽다. 
		-> DB가 바뀌어도 new 객체만 바꾸면 되니까
		
		JDBC == 모든 DBMS를 연결하는 표준인터페이스
		JDBC -> JDBC Driver
				MS SQL JDBC Driver
				Oracle JDBC Driver
		*/
		
		
	} // main
	
} // class












