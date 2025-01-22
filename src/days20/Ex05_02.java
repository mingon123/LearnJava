package days20;

import java.util.TreeSet;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오후 12:18:10
 * @subject
 * @content
treeSet 문자열 정렬 및 범위검색
 */
public class Ex05_02 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");
		ts.add("alien");
		ts.add("bat");
		ts.add("car");
		ts.add("Car");
		ts.add("disc");
		ts.add("dance");
		ts.add("dzzz");
		ts.add("dzzzz");
		ts.add("elephant");
		ts.add("elevator");
		ts.add("fan");
		ts.add("flower");
		
		System.out.println( ts );
		
		System.out.println( ts.subSet("a", "d")); // d는 포함 X
		// [abc, alien, bat, car]
		
		System.out.println( ts.subSet("c", "dzzz")); 
		// [car, dance, disc]
		
		
		

	} // main

} // class
