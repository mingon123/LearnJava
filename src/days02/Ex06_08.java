package days02;

public class Ex06_08 {

	public static void main(String[] args) {
		// '0' = 48, 'A' = 65, 'a' = 97
		System.out.println('0' - 5); // 48 - 5 = 43
		
		// 대소문자 변환( +32, -32)
		// 대문자 + 32 = 소문자
		// 소문자 - 32 = 대문자
		char a = 'A';
		System.out.printf("%c \n", a + 32);

		// '\유'는 유니코드를 말함
		char c = '\u0041'; // 'A'
		System.out.printf("%c \n", c);
	
		// 문자코드표 - encoding이랑 decoding이랑 언어가 다르면 문자가 깨진다.
		// 'A' -> Encoding -> 65 -> 2진수 저장
		//		<-Decoding <- 
		
		
		
		
		
		
		
		
		
	
	}

}
