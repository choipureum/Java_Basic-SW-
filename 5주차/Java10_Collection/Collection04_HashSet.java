package Java10_collection;
import java.util.*;

public class Collection04_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(1);
		set.add(1);//중복제거
		set.add(2);
		set.add(3);
		System.out.println("Set : " +set);
		
		Iterator iter = set.iterator(); //반복자 생성
		//set의 모든 요소 출력하기
		//iter 사용법
		while(iter.hasNext()) {
			System.out.println(iter.next()); //iterator에 값이 있다면 출력 
		}
		
		Object [] arr = set.toArray(); // set에 있는 모든 값을 배열로 변환해서 넣어준다.	    
		System.out.println("Object Array : "+Arrays.toString(arr)); //Collections, Arrays.등 이건 s앞의 타입의 메소드를 사용할수잇다.
		Arrays.sort(arr); //배열 정렬하기
		
		//인덱스를 이용한 배열 전체 출력
		//foreach 문		
		for(Object i : arr) {
			System.out.println(i);
		}
		// set를 이용한 ArrayList 만들기
		List list =new ArrayList(set);
		System.out.println("List : "+list);
		
		//--------------------------------------------
		//LinkedHashSet는 HashSet와 모두 같다, 데이터 입력 순서가 생기는게 유일한 차이점
		Set set2 = new LinkedHashSet();
		
		// 정렬상태를 항상 유지 (대신 좀 느리다)
		Set set3 = new TreeSet();
		
		//--------------------------------------------
		
		System.out.println("크기 : "+set.size());
		System.out.println("비었나? : "+set.isEmpty());
		System.out.println("222가 존재하는가? : "+set.contains(222));
		System.out.println("30을 제거 : "+set.remove(30)); //제거하면 true, 없으면 false
		
		System.out.println(set);
		set.clear(); //모든 요소 제거
		System.out.println(set);
	}
}


//< Set 인터페이스 > 
//
// - 집합
// - 데이터 모음, 묶음 
//
// - 데이터의 삽입 순서를 유지하지 않음
// - 인덱스 없음
//
// - 중복 데이터를 허용하지 않음
// - 객체의 해시코드를 기준으로 중복판단
//
//
//   + interface Set의 구현체(class) 
//	
//		-class HashSet
//			가장 기본이 되는 Set 구현체
//			다른 Set에 비해 접근(데이터처리)이 빠른 편
//
//		-class LinkedHashSet
//			데이터 입력 순서 유지
//			인덱스는 없음
//
//		-** class TreeSet **
//			정렬기능 추가
//			기본적으로 오름차순 정렬
//			
//			++단점++
//			Set생성하는 작업이 느린 편
//			데이터 추가/삭제도 느린 편
//
//			++장점++
//			대신 탐색이 아주 빠르다
//



