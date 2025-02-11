package kr.s02.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 자바는 자동 커밋 try하고 캐치문 갈때 자동커밋함 : 오토커밋

public class InsertTest {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			// JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			// JDBC 수행 2단계 : Connection 객체 생성(오라클 접속 인증)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			
			// SQL문 작성
			sql = "INSERT INTO test1 (id,age) VALUES ('s''t',10)"; // [주의] ; 쓰면 안됨 , primary key 제약조건을 지정안해서 같은 값 중복가능, stmt문제(1) : ''작은따옴표 사용시 에러(2개사용하면 '출력)
			 													   															// stmt문제(2) : 데이터를 직접 명시하기 때문에 보안에 문제(가공X)
			// JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문을 실행해서 하나의 행을 삽입
			// 삽입 작업 후 삽입한 행의 갯수를 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"개의 행을 추가했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			if(stmt!=null) try {stmt.close();} catch (SQLException e) {}  			// 열린 역순으로 닫음
			if(conn!=null) try {conn.close();} catch (SQLException e) {} 
		}
		
	} // main
} // class








