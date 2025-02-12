package kr.s04.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

// 제목으로 검색

public class SelectSearchMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("제목 검색어:");
			String keyword = br.readLine();
			
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "SELECT * FROM test3 WHERE title LIKE '%' || ? || '%'";
			
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(1, keyword);
			
			// JDBC 수행 4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) { // 행이 없을 경우 처리
				System.out.println("번호\t제목\t작성자\t등록일");
				do{											// if문 쓰면 do~while문 사용해야함
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("title"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.println(rs.getDate("reg_date"));				
				} while(rs.next());
			} else {
				System.out.println("검색된 데이터가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}


// select는 3가지
// 1.while문
// 2.if~else + do~while문
// 3.do~while문
