package kr.s04.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

// 번호를 기준으로 검색

public class SelectDetailMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호:");
			int num = Integer.parseInt(br.readLine()); // 입력받은 번호를 int로 변환
			
			System.out.println("-------------------------------");
			
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "SELECT * FROM test3 WHERE num=?";
			
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			// JDBC 수행 4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			System.out.println();
			if(rs.next()) {								// 명백히 값이 1개면 if가능
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("작성자 : " + rs.getString("name"));
				System.out.println("내용 : " + rs.getString("memo"));
				
				String email = rs.getString("email");
				if(email == null) email = ""; // email값 입력 안하면 빈 문자열로 반환
				
				System.out.println("이메일 : " + email);
				System.out.println("작성일 : " + rs.getDate("reg_date"));
			} else {
				System.out.println("검색된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
