package Java05_array;

import java.util.Arrays;

public class Array_04 {
	public static void main(String[] args) {
		
		//문자열, String
		//char형의 집합 char[]의 개념을 사용한다
		
		String str ="Apple"; //문자열
		char[] chArr = {'A','p','p','l','e'}; //char형 배열
		System.out.println("문자열의 길이 : "+ str.length()); //문자열의 길이
		System.out.println("char형 배열의 길이  : "+chArr.length); //배열의 길이
		
		System.out.println("문자열의 세번째 글자 : "+ str.charAt(2));
		System.out.println("char형 배열의 다섯번째 글자 : "+ chArr[4]);
		
		System.out.println("-------------------------------------");
		
		//문자열의 글자를 하나씩 출력하기
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("--------------------------------------");
		for(int i=0;i<chArr.length;i++) {
			System.out.println(chArr[i]);
		}
		//**********************************
		
		//String ->char[] 변환 :toCharArray()
		char[] converted =str.toCharArray();
		System.out.println(Arrays.toString(converted)); //[A, p, p, l, e]
		
		//char[] ->String 변환 : new String()
		String restore =new String(converted);
		System.out.println(restore); //Apple

	}
}
