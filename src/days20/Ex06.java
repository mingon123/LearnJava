package days20;

import java.util.HashMap;

public class Ex06 {

	public static void main(String[] args) {
		/*
		[ Map 인터페이스를 구현한 컬렉션 클래스 ]
		1. Hashtable, HashMap 컬렉션 클래스
					  :새로운 버전 [권장]
			Vector	    Arraylist
			동기화O	    동기화X
		   StringBuffer StringBuilder
		 
		2. key + Value 한쌍으로 관리 , 
			Entry(엔트리) : key+Value
			
		3. Hash : 해싱이라는 기법을 사용하여 데이터를 저장 -> 검색 성능 뛰어남
		
		4. 해싱기법
		  1) 해시함수( hash function )를 이용해서 데이터를 해시테이블( hash table )에 저장하고 검색하는 기법
		  2) 해시함수는 데이터가 저장되어 있는 곳을 알려 주기 때문에 다량의 데이터 중에서 원하는 데이터를 빠르게 검색할 수 있다.
		
		5. 배열과 링크드리스트 구조의 조합된 형태
		
		 */
		
		// E : element
		// T : type
		// K : key
		// V : value
		HashMap<String, String> hm = new HashMap<>();	// key 중복X, value 중복O
		hm.put("kenik", "이창익");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		// {hong=홍길동, kenik=이창익, admin=관리자}
		System.out.println( hm );
		
		
		// [문제] key값이 "admin" 이름 출력해보고, "김대원"으로 수정
		
		String key = "admin";
		if ( hm.containsKey(key) ) {
			String value = hm.get(key);
//			System.out.println( value );
			hm.put(key, "김대원");	// put으로도 값을 바꿀 수 있음
//			hm.replace(key, value, "김대원");
		}	
		System.out.println( hm );
		System.out.println( hm.get(key) );
		
		
		// 다른 함수들 살펴보기
		
		// hm.clear();
		// boolean hm.containsValue("홍길동") value값 있는지 확인
		
		// ***hm.entrySet();
		//	  hm.keySet();
		//	  hm.values();	// key값은 중복안되는데 value는 중복되기 때문에 Set이 아닌 values
		
		
		// hm.equals(key);
		
		// value hm.get(key)
		
		// hm.isEmpty()
		
		// hm.wait(); // 쓰레드에서 사용
		
		// hm.size() 
		
		// hm.replace(key, key);
		
		// hm.remove(key);
		// hm.remove(key, value);
		
		// hm.replace(null, null);
		
		// 병합
		// hm.merge(key, key, null)

		
		System.out.println( hm );
		
		
	} // main

} // class


