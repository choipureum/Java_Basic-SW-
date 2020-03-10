package Java10_collection;

import java.util.Stack;

public class Collection07_Stack {
	public static void main(String[] args) {
		
		Stack s = new Stack(); //스택선언
		//넣기
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		
		System.out.println(s);
		
		//출력
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		//기능들
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.empty()); 
		
		//s.add와 s.push모두 같은기능을한다 하지만 push를 사용해야 stack을 사용하는 걸 알수 있다
		
		//---------------------------------
		s.push("Grape");
		s.push("Orange");
		s.push("Peach");
		
		//stack 비어있지 않으면 반복한다
		//stack 데이터가 있으면 반복한다
		while(!s.empty()) {
			System.out.println(s.pop());
		}
	}
}
//< 스택, Stack >
//
//	-LIFO, 후입선출
//	-FILO, 선입후출
//	
//	-가장 마지막(최근)에 입력된 데이터를 가장 먼저 사용한다
//	-자바에서는 컬렉션의 Stack 클래스 타입으로 자료구조를 제공한다
//	-메소드 호출 스택(Call Stack)에서 사용되는 알고리즘이다
//
 //< Stack 주요 메소드 > 

//	- push() :데이터 입력, 스택에 데이터 추가
//	- pop() : 데이터 출력, 스택에서 데이터 반환 및 제거
//	- peek() : 데이터 확인, 다음 pop()될 데이터 확인 (제거 X)
