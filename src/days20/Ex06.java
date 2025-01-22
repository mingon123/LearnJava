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
		
		System.out.println(hm.containsKey("admin"));
		
		while ( !hm.isEmpty() ) {
			hm.get("admin");
			System.out.println(hm.get("admin"));
			
			hm.replace("admin", "김대원");
			System.out.println( hm );
			
			break;
		}
		
	} // main

} // class


