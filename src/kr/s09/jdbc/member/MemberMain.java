package kr.s09.jdbc.member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
	private BufferedReader br;
	private MemberDAO dao;
	private String me_id; // 로그인한 아이디 저장
	private boolean flag; // 로그인 여부
	
	public MemberMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new MemberDAO();
			// 메뉴 호출
			callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}	
		}
	}
	
	// 메뉴 호출
	private void callMenu() throws IOException {
		// 로그인 체크 영역
		while(true) {
			System.out.println("1.로그인,2.회원가입,3.종료:");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					// 로그인
					System.out.print("아이디(입력취소:0):");			// 0은 아이디로 못쓰게 설정
					me_id = br.readLine();
					
					// 0이면 입력 취소
					if(me_id.equals("0")) continue;
					
					System.out.println("비밀번호:");
					String me_passwd = br.readLine();
					
					flag = dao.loginCheck(me_id, me_passwd);
					if(flag) { // true
						System.out.println(me_id+ "님 로그인 되었습니다.");
						break;
					}
					System.out.println("아이디 또는 비밀번호가 불일치합니다."); // false
					
				} else if(no==2) {
					// 회원가입
				} else if(no==3) {
					// 종료
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[숫자만 입력 가능]");
			}
		}
		// 로그인 성공 후 회원제 서비스 영역
		while(flag) {
			System.out.print("1.상품목록,2.MY구매상품리스트,3.종료:");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					// 상품목록
					
				} else if(no==2) {
					// MY구매상품리스트
					
				} else if(no==3) {
					//  종료
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch(NumberFormatException e){
				e.printStackTrace();
			} 

		}
	}
	
	public static void main(String[] args) {
		new MemberMain();
	}
}
