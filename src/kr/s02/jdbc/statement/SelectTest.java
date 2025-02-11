package kr.s02.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			// JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			// JDBC 수행 2단계 : Connection 객체 생성(오라클 접속 인증)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			
			// SQL문 작성
			sql = "SELECT * FROM test1";
			
			// JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 레코드를(복수) 전달받아서 ResultSet 객체에 담아서 반환
			rs = stmt.executeQuery(sql);
			
			System.out.println("ID\t나이");
			//ResultSet에 보관된 결과집합에 접근해서 행단위로 데이터를 추출
			while (rs.next()) {
				// 컬럼명을 통해서 데이터를 반환
				System.out.print(rs.getString("id"));
				System.out.print("\t"); //아이디 명시 후 간격 띄움
				System.out.println(rs.getInt("age"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			
		}
		
		
		
		
		
		
	} // main
} // class
