package days20;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오후 2:30:21
 * @subject
 * @content

 파일 읽어와서 'A'(20) ##### 막대그래프로 표시
 days17.Ex10.java 복사
 days17.Ex10_02.java
 */
public class Ex07 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days16\\Ex05.java";

		//		  key		value
		// 한문자 'A','B'.. 	개수
		// p	  'p'		1
		// a	  'a'		1
		// c
		// : 
		// a	  'a'		2 	- 기존에 있다면 value 1증가
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char one = '\u0000';
		int code = -1;
		try (FileReader reader = new FileReader(fileName)) { 
			while ( ( code = reader.read() ) != -1 ) {
				one = (char) code;
				if( hm.containsKey(one) ) { // 해당 존재하면 value+1
					int oldValue = hm.get(one);
					hm.put(one, ++oldValue);
				} else { // 'a', 1
					hm.put(one, 1);
				}
			} // while
		} catch (Exception e) {
			System.out.println(e);
		}		
		
		
		// [문제] 정렬 후 출력 - 해보기
		
		//		k v
		// 출력 'A'(20)
		
		
		Set<Entry<Character, Integer>> es = hm.entrySet();// <Entry<key, value>>
		Iterator <Entry <Character, Integer>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = ir.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();	// int도 가능
			
			System.out.printf("%s(%d) \t %s\n", key, value, "#".repeat(value));
		}

		
		
		
		System.out.println(" end ");
	} // main

} // class
