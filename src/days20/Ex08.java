package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오후 3:16:26
 * @subject
 * @content

List - 중복O, 순서O
Set - 중복X, 순서X
Map - key, value

 */
public class Ex08 {

	public static void main(String[] args) {
		// HashMap / Hashtable
		// MVC
		// days17.1차조편성.txt - 3조
		// ArrayList X3 - 각팀
		// HashMap	key(팀명)	value(팀원)
		
		String [] 팀1 = { "박정현", "김하은", "김민곤", "박예진", "[양희동]" };
		String [] 팀2 = { "[주정호]", "최지우", "김대원", "이찬희", "라일락" };
		String [] 팀3 = { "윤형식", "오재문", "[박세훈]", "유예나", "권용범" };

		// String [] 팀1 -> ArrayList
		ArrayList<String> team1 = new ArrayList<String>();
		// [방법1]
		for (int i = 0; i < 팀1.length; i++) {
			team1.add(팀1[i]);
		}

		// [방법2]
		List<String> list2 =  Arrays.asList(팀2);
		ArrayList<String> team2 = new ArrayList<String>(list2);

		List<String> list3 =  Arrays.asList(팀3);
		ArrayList<String> team3 = new ArrayList<String>(list3);
		
		
//		HashMap<String, ArrayList<String>> hm = new HashMap<>(); // 정렬 안됨
		LinkedHashMap<String, ArrayList<String>> hm = new LinkedHashMap<>(); // 링크드해쉬맵 = 삽입순서대로 정렬
		hm.put("1조", team1);
		hm.put("2조", team2);
		hm.put("3조", team3);
		
		// 출력
		printHashMap(hm);
		
	} // main

	private static void printHashMap(HashMap<String, ArrayList<String>> hm) {	

		Set <Entry <String, ArrayList <String>>> eset = hm.entrySet();
		Iterator <Entry <String, ArrayList <String>>> ir = eset.iterator();
		int index = 1;
		
		while (ir.hasNext()) {
			Entry<String, ArrayList<String>> entry = ir.next();
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();			
			System.out.printf("%s (%d명) \n", key, value.size());		
			
			// 팀원들 출력
			Iterator <String> ir2 = value.iterator();
			index = 1;
			while (ir2.hasNext()) {
				String name = ir2.next();
				System.out.printf("\t%d. %s\n", index++, name);
				// // System.out.printf("\t%d. %s\n", value.indexOf(name)+1 , name);
			}
			
			
			// 내가푼거
//			int cnt = 1;
//			for (int i = 0; i < value.size(); i++) {
//				System.out.printf("\t%d. %s \n", cnt++, value.get(i));
//			}
			
		}
		
		
		// 1조 ( 5명 )
		// 1. 홍길동
		// 2. 홍길동
		// 3. 홍길동
		// 4. 홍길동
		// 5. 홍길동
		// 2조 ( 3명 )
		// 1. 홍길동
		// 2. 홍길동
		// 3. 홍길동		
		// 3조 ( 7명 )
		// 1. 홍길동
		// 2. 홍길동
		// 3. 홍길동
		// 4. 홍길동
		// 5. 홍길동		
		// 6. 홍길동		
		// 7. 홍길동		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
