package Java10_collection;
import java.util.*;


public class Collection01_ArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList(); //List 선언
		//자료구조에서 자주 사용되는 동작(로직, 알고리즘)
		
		//CRUD 작업
		//Create -추가/삽입
		//Read   -조회/탐색
		//Update -수정/변경
		//Delete -삭제/제거
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		//--------------------------------------
		System.out.println(list.get(0));//1번째 인덱스
		//--------------------------------------
		//모두출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//수정
		list.set(1, "Orange"); //2번째 Orange로 변환
		System.out.println(list);
		
		//삭제
		list.remove(1); //2번째삭제
		list.remove("Cherry");//Cherry찾아서 삭제
		System.out.println(list);
		
		list.add("Tomato"); //가장뒤에 삽입
		System.out.println(list);
		
		//-----------contains----------
		
		System.out.println(list.contains("Tomato")); //해당 object를 포함하면 true반환
		System.out.println(list.isEmpty()); //비었는가? true or false
		
		//--------------------------------
		List l = null; //리스트 생성안함(아예 존재하지않음)
		List ll=new ArrayList(); //리스트는 생성했지만 안에가 없다(요소가 없다)
		System.out.println(l); 
		System.out.println(ll);
		if(ll.isEmpty()) {System.out.println("안이 비었다");} //정상
		if(l==null) {}//정상
		if(ll==null) {System.out.println("안이 비었다");} //이건안나옴
		
		//----------------------------------------
		list.add(123);
		list.add(true);
		list.add(3.14);
		System.out.println(list); //다른 타입도 모두 받을 수 있다
		
		//---------------------------------------
		
		for(Object element : list) {
			System.out.print(element+" ,");
		}
		System.out.println();
		//----------------------------------------
		
		list.clear();
		System.out.println(list); //비워주는메소드
		list=null; //객체 삭제 (GC동작) -리스트 자체를 없애버림
	}
}
//
//< 컬렉션, Collection > 
//:자료 구조, Data Structure
//
//- 컬렉션 프레임워크, Collection Framework
//	** 컬렉션 : 데이터 모음, 다수의 데이터
//	** 프레임워크 : 체계적인 프로그래밍 방식(방법,도구)
//
//- 자바에서 제공하는 기본 자료구조 API
//
//- List(선형), Set(비선형), Map(비선형) (굉장히 많이 사용한다)
//
//
//
//
//< 자료 구조 , Data Structure > 
//
//- 프로그램에서 사용되는 데이터를 효과적으로 저장하고 관리하는 전략
//- 프로그램의 알고리즘 형태에 어울리는 방식으로 데이터를 배치한 것 (논리적)
//
//
//< 배열, Array > 
//- 가장 기본적인 형태의 자료구조
//- 선형 구조, Linear
//
//		** 선형구조 <--> 비선형 구조
//
//< List 인터페이스 >
//
//- 목록,리스트
//- 데이터를 일렬로 배치하는 자료구조(선형구조)
//- 요소(Element)를 인덱스로 관리한다
//- 리스트에 요소가 추가될 때 인덱스를 자동으로 부여한다
//- 데이터의 삽입순서를 유지한다
//- 배열과 비슷한 구조
//
//< interface List의 구현체 >
//
//	+ArrayList

//	:단순 연결 리스트
//	배열과 거의 비슷한 동작을 하는 클래스
//	배열과 달리 공간의 크기를 확장하거나 축소할 수 없다
//	빠른편이다 (배열에 비해서 크게 느리지 않은편)
//	
//
//	+LinkedList
//
//	+Vector
