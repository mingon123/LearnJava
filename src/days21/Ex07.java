package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 4:37:03
 * @subject
 * @content 
 
 		[ 메모리 스트림 ] 
 		- 주로 다른 곳에 입, 출력하기 전에 메모리 상에 데이터를 임시로 저장해서 사용할 목적
 		byte    ByteArray[IS] / ByteArray[OS] 바이트스트림			InputStream/OutputStream
 		char	CharArray[R] / CharArray[W]	  문자 스트림			Reader/Writer
 		String  String[R] / String[W]		  문자 스트림

 		
메모리상에 올라가면 속도가 빠름
String-> 06_03 문제해결(class명바꾸기)에 사용*
StringReader/StringWriter은 자주 사용됨
 */
public class Ex07 {

	public static void main(String[] args) {
		
		byte [] buf = { 0,1,2,3,4,5,6,7,8,9 };
		
		ByteArrayInputStream bais =new ByteArrayInputStream(buf);		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int b;
		while ( ( b = bais.read() ) != -1 ) {
			System.out.println( b);
			baos.write(b);
		} // while
		
		byte [] outbuf = baos.toByteArray();
		System.out.println( Arrays.toString(outbuf) );
		
		
	} // main

} // class
