package days05;

public class Ex05_02 {

	public static void main(String[] args) {
		
		
		// 1번 문제
        // *
        // **
        // ***
        // ****

//		for (int i = 1; i <= 4; i++) { 
//			for (int star = 1; star <= i; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} //for i
		
		
		
		
        // 2번 문제
        // ****
        // ***
        // **
        // *
        
//		for (int i = 0; i <= 4; i++) {
//			for (int star = 1; star <= 4-i; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} //for i
		

		
		
        // 3번 문제
        // ___*
        // __**
        // _***
        // ****

//		for (int i = 1; i <= 4; i++) {
//			for (int line = 1; line <= 4-i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <= i; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} //for i		

		
		
		
//         4번 문제
//         ****
//         _***
//         __**
//         ___*

//		for (int i = 0; i < 4; i++) {
//			for (int line = 1; line <= i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <= 4-i; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} //for i

		
		
		
        // 5번 문제 ( 이등변 삼각형 )
        // __*
        // _***
        // *****

//		for (int i = 1; i <= 3; i++) {
//			for (int line = 1; line <= 3-i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <=i*2-1; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} // for i


		
		
        // 6번 문제( 마름모 )
        // __*
        // _***
        // *****
        // _***
        // __*

//        for (int i = 1; i <= 3; i++) {
//			for (int line = 1; line <= 3 - i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <= i*2-1; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} // for i
//        
//        for (int i = 1; i <= 2; i++) {
//			for (int line = 1; line <= i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star < (3-i)*2; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} // for i
		
		
		
		
		// 7번 문제  Ex05_07.java
        // *
        // _*
        // __*
        // ___*
        // ____*

//		for (int i = 0; i < 5; i++) {
//			for (int line = 1; line <= i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <= 1; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} // for i
		
		
		
		
		
        // 8번 문제  Ex05_08.java
        // ____*
        // ___*
        // __*
        // _*
        // *

//		for (int i = 1; i <= 5; i++) {
//			for (int line = 1; line <= 5-i; line++) {
//				System.out.printf("_");
//			} // for line
//			for (int star = 1; star <= 1; star++) {
//				System.out.printf("*");
//			} // for star
//			System.out.println();
//		} // for i
		
		
		
        // 9번 문제  Ex05_09.java
        // *___*
        // _*_*
        // __*
        // _*_*
        // *___*

//		for (int i = 3 ; i > 0; i--) {
//			if ( i%3==0) {
//				System.out.printf("*");	
//			} // if
//			
//			if ( i%3!=0 ) {
//				for (int line = 1; line <= i ; line++) {
//					System.out.printf("_");
//					if (i==1) {
//						System.out.printf("_");
//					} // if
//					for (int star = 1; star <= 1; star++) {
//						System.out.printf("*");
//					} // for star
//				} // for line			
//			} else {
//				for (int line = 1; line <= 3; line++) {
//					System.out.printf("_");
//				} // for line
//				for (int star = 1; star <= 1; star++) {
//					System.out.printf("*");
//				} // for star
//			} // else	
//			System.out.println();
//		} // for i
//
//		for (int i = 1; i <= 2; i++) {
//			if (i%2==1) {			
//				for (int line = 1; line <= 2; line++) {
//					System.out.printf("_");
//					for (int star = 1; star <= i; star++) {
//						System.out.printf("*");
//					} // for star
//				} //for line				
//			} else {
//				System.out.printf("*");
//				System.out.printf("_");
//				for (int line = 1; line <= 2; line++) {
//					System.out.printf("_");
//				} // for line
//				for (int star = 1; star <= 1; star++) {
//					System.out.printf("*");
//				} // for star
//				System.out.println();
//			} // else
//			System.out.println();
//		} // for i
		
		
		
		
	} //main

} // class

