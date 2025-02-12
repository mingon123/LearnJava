package kr.s06.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.util.DBUtil;

// 트랜잭션 : 여러 값을 동시에 바꿀 때 하나라도 false가 나오면 전체가 ROLLBACK 되도록 하는 작업(데이터 왜곡 제거)
// test1 테이블 사용

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			
			// 트랜잭션을 수동 처리하기 위해 auto commit 해제
			conn.setAutoCommit(false);
			
			sql = "INSERT INTO test1 VALUES ('서울',500)"; // 테스트 목적 상 ? 안쓰고 그냥 직접 입력 
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('부산',400)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			// 테스트용으로 오류가 있는 SQL문 사용
			sql = "INSERT INTO test1 VALUES ('제주',300"; 	// 오류나는 문장 입력
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();

			// 정상적으로 작업 완료되면 commit
			conn.commit();
			System.out.println("작업 완료!!");
			
		} catch (Exception e) {
			e.printStackTrace();
			// 예외가 발생했을 경우 rollback
			try {
				conn.rollback();
			} catch (SQLException se) {
				se.printStackTrace();
			}			
		} finally {
			// 자원정리
			DBUtil.executeClose(null, pstmt3, null);
			DBUtil.executeClose(null, pstmt2, null);
			DBUtil.executeClose(null, pstmt1, null);
		}
	}
}
