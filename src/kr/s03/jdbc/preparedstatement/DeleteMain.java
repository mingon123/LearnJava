package kr.s03.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "DELETE FROM test2 WHERE id=?"; // FROM 앞에 *안들어감
			
			// JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(1, "sky");
			
			// JDBC 수행 4단계 : SQL문을 실행해서 테이블의 행을 삭제
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
