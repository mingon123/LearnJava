package days06;

import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		
		// (1)
		// ****
		// ***
		// **
		// *
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		
		
		// (2)
		// ___*		i= 1, j = 3
		// __**		i= 2, j = 2
		// _***		i= 3, j = 1
		// ****		i= 4, j = 0
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4-i; j++) {
//				System.out.print("_");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		// (3)
		// **** 	i=1  공백 j=0
		// _***		i=2		 j=1 
		// __**		i=3		 j=2
		// ___*		i=4		 j=3
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 0; j < i-1; j++) {
//				System.out.print("_");
//			}
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// (4)
		// 이등변삼각형
		// __*		i=1	공백j=2	별j=1
		// _***		i=2	   j=1	 j=3
		// *****	i=3	   j=0   j=5
		//				3-i		i*2-1
		
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3-i; j++) {
//				System.out.print("_");
//			}
//			for (int j = 1; j <= i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 5; j++) {
//				// if (i+j>=4) System.out.print("*");
//				if(j-i<=2 && i+j>=4) System.out.print("*");
//				else System.out.print("_");
//			} // for j
//			System.out.println();
//		} // for i
		
		
		// (5)
		// 마름모		// 별 좌표
        // __*			13
        // _***		 22 23 24
        // *****  31 32 33 34 35
        // _***      42 43 44
        // __*			53
		
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				
//				if(j-i<=2 && i+j>=4 && i-j<=2 && i+j<=8) System.out.print("*");
//				else System.out.print("_");
//			} // for j
//			System.out.println();
//		} // for i
		
		
		
		
		
		
		
		
		// ****
		// ***_
		// **__
		// *___
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//				if (i+j <=5) {
//					System.out.print("*");
//				} else {
//					System.out.print("_");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
//		11 12 13 14
//		   22 23 24
//		      33 34
//			     44
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.print( i <= j ? "*" : "_" );
//				/*
//				if (i <= j) {
//					System.out.print("*");
//				} else {
//					System.out.print("_");
//				}
//				*/
//			} // for j
//			System.out.println();
//		}
//		
		
		
		
		
	}

}
