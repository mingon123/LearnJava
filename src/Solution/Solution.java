package Solution;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
    	
    	Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if ( !a.matches("[a-z]") ) a = a.toUpperCase();
        if ( !a.matches("[A-Z]") ) a = a.toLowerCase();
        
        System.out.println(a);
        
        
    }
}
