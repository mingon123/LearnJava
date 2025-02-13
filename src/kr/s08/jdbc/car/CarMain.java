package kr.s08.jdbc.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
	private BufferedReader br;
	private CarDAO car;
	
	public CarMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			car = new CarDAO();
			callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	// 메뉴
	private void callMenu() throws IOException{
		while(true) {
			System.out.print("1.등록,2.목록보기,3.상세정보,4.정보수정,5.정보삭제,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {
					// 정보등록
					System.out.print("이름:");
					String name = br.readLine();

					System.out.print("색상:");
					String color = br.readLine();
					
					System.out.print("제조사:");
					String maker = br.readLine();
					
					// 가격은 0~99999999까지이므로 이걸 검사해주는 함수
					int price = parseInputData("가격:");
					
					car.insertCar(name, color, maker, price);
				
				} else if(no == 2) {
					// 목록보기
					car.selectCar();

				} else if(no == 3) {
					// 상세정보
					car.selectCar();
					System.out.println("선택한 자동차 관리 번호:");
					int num = Integer.parseInt(br.readLine());
					System.out.println("------------");

					int count = car.checkRecord(num);
					if(count==1) {
						car.selectDetailCar(num);
					} else if(count==0) {
						System.out.println("번호를 잘못입력했습니다.");
					} else {
						System.out.println("정보 처리 중 오류 발생");
					}
					
				} else if(no == 4) {
					// 정보 수정
					car.selectCar();
					System.out.println("수정할 자동차 정보의 관리 번호:");
					int num = Integer.parseInt(br.readLine());
					int count = car.checkRecord(num);
					
					if(count == 1) {
						 car.selectDetailCar(num);
						 System.out.println("-------------------");
						 
						 System.out.print("이름:");
						 String name = br.readLine();
						 
						 System.out.print("색상:");
						 String color = br.readLine();
						 
						 System.out.print("제조사:");
						 String maker = br.readLine();

						 // 가격은 0~99999999까지이므로 이걸 검사해주는 함수
						 int price = parseInputData("가격:");
						 
						 car.insertCar(name, color, maker, price);
					} else if (count == 0) {
						System.out.println("번호를 잘못 입력했습니다.");
					} else {
						System.out.println("정보 처리 중 오류 발생");
					}

				} else if(no == 5) { 
					// 정보 삭제
					car.selectCar();
					
					System.out.print("삭제할 정보의 관리 번호:");
					int num = Integer.parseInt(br.readLine());	
					// 전달한 번호로 레코드 존재 여부 체크
					int count = car.checkRecord(num);
					// 1:존재, 0:미존재, -1:오류
					if(count==1) car.deleteCar(num);
					else if(count==0) System.out.println("번호를 잘못입력했습니다.");
					else System.out.println("정보 처리 중 오류 발생");
				} else if(no == 6){
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[숫자를 입력 가능]");
			} finally {
				
			}
			
		}
	}
	
	public int parseInputData(String item) throws IOException {
		while (true) {
			System.out.print(item);
			try {
				int num = Integer.parseInt(br.readLine());
				
				// 0이하면 오류 발생
				if(num<=0 || num > 999999999) {
					throw new NotAcceptableValueException("1~999,999,999까지만 입력 가능");
				}
				return num; // 정상값 반환
			} catch(NumberFormatException e) {
				System.out.println("[숫자를 입력하지 않았거나 숫자 입력 범위를 초과했습니다.]");
			} catch(NotAcceptableValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new CarMain();
	}
}
