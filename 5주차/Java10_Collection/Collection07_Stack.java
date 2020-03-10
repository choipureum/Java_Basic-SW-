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
