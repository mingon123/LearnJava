package kr.s04.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

// 리스트 전부 출력

public class SelectListMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "SELECT * FROM test3 ORDER BY num DESC";
			
			// JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// JDBC 수행 4단계 : SQL문 실행 결과를 ResultSet에 담아 반환
			rs = pstmt.executeQuery();
			System.out.println("번호\t제목\t작성자\t등록일");					
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("title"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.println(rs.getDate("reg_date"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
}
