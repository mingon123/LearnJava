package kr.s02.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
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
			// JDBC 수행 2단계 : Connection 객체 생성(오라클 접속을 위한 인증)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			
			System.out.println("test1 테이블을 생성합니다.");
			
			/*
			테이블을 생성하는 SQL문 작성.
			접속한 계정에 테이블명이 중복되면 에러가 발생하기 때문에 동일한 계정에서는 한번만 수행함
			 */
			
			// SQL문 작성
			sql = "create table test1 (id varchar2(10),age number(3))";
			
			// JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문 실행
			stmt.execute(sql);
			System.out.println("테이블이 정상적으로 생성되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {} // 줄바꿈하면 너무 길어져서 한줄로 처리
			if(conn!=null)try {conn.close();}catch(SQLException e) {} 
		}
		
	} // main
} // class


// 정리는 만들어진 객체 역순으로 정리, finally(정리)를 안하면 사용자가 많고, 사용이 누적될수록 느려짐.


