package days20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오전 11:24:56
 * @subject
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};

		// (문제1) a U b 합집합 : 1 2 3 4 5 6 7 8
		
		/*
		// [2]
		// int [] -> ArrayList
		ArrayList<Integer> aL = new ArrayList<Integer>();
		ArrayList<Integer> bL = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) aL.add(a[i]);
		for (int i = 0; i < b.length; i++) bL.add(b[i]);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(aL);
		hs.addAll(bL);
		
		System.out.println( hs );
		*/
		
		
		// [1]
		/*
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a) {
			hs.add(i);
		} // foreach

		for (int i : b) {
			hs.add(i);
		} // foreach
		System.out.println( hs );
		 */
	
		
		
		// [문제2] a - b 차집합

//		HashSet<Integer> hs = new HashSet<Integer>();
//		for (int i : a) {
//			hs.add(i);
//		} // foreach
//	
//		for (int i : b) {
//			hs.remove(i);
//		} // foreach
//		System.out.println(hs);
		
		
		// [문제3] a n b 교집합
	

		
		
		
		
		
		
		
		
		
	} // main

} // class
