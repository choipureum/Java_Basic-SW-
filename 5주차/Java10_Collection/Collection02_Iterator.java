package Java10_collection;

import java.util.*;


public class Collection02_Iterator {
	public static void main(String[] args) {
		
		List list =Arrays.asList("A","B","C","D","E"); //여러개 넣을수있는 가변인자 
		//asList : 정적 메소드 , 리스트의 선언과 동시에 초기화
		System.out.println(list);
		
		//반복자, Iterator
		// Collection의 모든 요소들을 순차적으로 읽어오는 방법 (접근 방법)을 표준화한 것
		Iterator iter; //반복자
		iter =list.iterator(); //list의 iterator 생성하기
		
		//iter가 있는동안 계속해서 받고 출력(for each문과 비슷한 모양)
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
