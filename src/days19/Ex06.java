package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**2025. 1. 21.오후 12:21:41
 * 
 * 

 */
public class Ex06 {

	public static void main(String[] args) {
		
		// 1. String[] -> ArrayList 변환
		String [] names = {"박예진", "양희동", "박정현", "주정호", "이찬희" };
		
		// [1]
//		ArrayList list = new ArrayList();
//		for (int i = 0; i < names.length; i++) {
//			list.add( names[i] );
//		}
//		System.out.println( list );
		
		// [2] String[] -> List
		List list = Arrays.asList(names);
		// list.get(0)
		// list.size();
		// list.sort(null);			// List로 받아도 이렇게 사용 가능
		System.out.println( list );
		
		// [2-1] String[] -> ArrayList
		ArrayList list2 = new ArrayList(list); // 매개변수 다형성, 생성자

		
		// 2. ArrayList -> String[] 변환
		
		// [1]
//		ArrayList list2 = new ArrayList(list); // 매개변수 다형성, 생성자
//		String [] names2 = new String[ list2.size() ];
//		int index = 0;
//		Iterator ir = list2.iterator();
//		while (ir.hasNext()) {
//			String name = (String) ir.next();
//			names2[index++] = name;
//		}
//		System.out.println(Arrays.toString(names2));
		
		
		// [2] ArrayList.toArray() -> String [] 변환
//		ArrayList list2 = new ArrayList(list);
		/*
		Object [] arr = list2.toArray();
		System.out.println(Arrays.toString(arr));
		*/
		
		// Object[] -> String[] 변환
		// 오류메세지 : Exception in thread "main" java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.String; ([Ljava.lang.Object; and [Ljava.lang.String; are in module java.base of loader 'bootstrap')
//		String [] arr = (String[]) list2.toArray();
//		System.out.println(Arrays.toString(arr));		
		
		// [1]
		String [] arr = (String[]) list2.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));		

		// [2]
		String [] strArr = (String[]) list2.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
	}

}
