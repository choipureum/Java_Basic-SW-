package Java10_collection;
import java.util.*; //Collection FrameWork는 대부분 java.util.에있다


public class Collection05_Map {
	public static void main(String[] args) throws Exception{
		
		Map map = new HashMap();
		
		//삽입
		//데이터타입과 관련없이 모든 값 입출력가능(Object형)
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println("Map : "+map); //key와 value를 = 으로 표현해준다
		
		//조회
		System.out.println(map.get(1)); //key에 해당하는 value를 반환해준다
		System.out.println(map.get(4)); //없으면 null반환 에러 X
		
		map.put("D", "Durian");
		System.out.println(map.get("D"));
		
		map.put(2, "Orange"); //동일한 key값 -> 덮어 씌워져서 원래 Banana는 없어진다
		map.put(4, "Apple"); //새롭게 4 key로 등록되고 Apple이 value로 등록
		System.out.println(map);
		
		//내용포함 유무 알기
		System.out.println("key 5가 있니? : "+map.containsKey(5)); //key 5가 있는가?
		System.out.println("value Apple이 있니? : "+map.containsValue("Apple"));
		
		//-->활용
		if(!map.containsKey(5)) { //map에 5라는 key가 존재하지 않는다면
			map.put(5, "Grape");
		}
		
		try {
		String str=(String)map.get(555); //key가 1인 "Apple"을 String으로 바꾸어서 str에 저장
		System.out.println(str);
		System.out.println(str.length()); //str의 길이
		}catch(NullPointerException e) {
			System.out.println("해당 key에 자료가 없습니다");
		}
		
		System.out.println(map);
		System.out.println("map의 크기 : "+map.size());
		System.out.println("map이 비었나요?"+map.isEmpty());
		
		//remove 오버로딩
		map.remove(1);  //key 1인 Entry쌍을 제거
		System.out.println(map);
		System.out.println(map.remove(2, "Orange")); //key에 해당 value를 지웠으면 true 아니면 false
		System.out.println(map.remove(3, "Durian")); //해당key에 Durian이 없기때문에 false출력(못지움)
		
		
		//-----------------------------------------
		//null값 처리
		map.put(null,"Bob"); //null=Bob //key가 null인 상황은 논리적으로 안좋음,쓰지마라
		map.put(10, null); //10=null //이건 충분히 가능
		//위의 사항 둘다 처리가된다
		System.out.println(map);
		
		map.put(null, null);  //이것도 처리는 된다
		System.out.println(map);
		
		//**map은 iterator가 없다 -->다뤄주려면 Set를 이용해야한다
		//map에서 set을 추출하는 법
		Set keySet = map.keySet(); //map에서 key만 빼서 Set로 넣어주는 법
		Set entrySet = map.entrySet(); //map에서 entry한 쌍자체를 꺼내서 Set에 담아주기
		//value만 빼주는건 의미가 없다 ->중복처리가 안되기때문에 value가 중복이면 다 날아감 
		System.out.println(keySet);
		System.out.println(entrySet);
		
		//set에서 Iterator돌리기
		Set keys =map.keySet(); //Keyset
		Iterator iter =keys.iterator();
		
			//Key Set Iterager반복
		while(iter.hasNext()) {
			Object key = iter.next();
			System.out.println(map.get(key)); //key에 해당하는 value출력
		}
}
}

//
//< Map 인터페이스 >
//
//- 매핑 관계를 활용
//
//- key, value의 쌍으로 매핑되어 있는 구조
//- key, value 쌍(pair), Entry라고 함
//
//- key : 기준값
//- value : 키에 대응하는 데이터
//
//+ 맵 자료구조에서 당연히 
//	key는 중복불가, value는 중복가능
//
//	*이미 존재하는 데이터의 key에 대응하는 value가 삽입되면
// 	 기존의 데이터에서 value만 새로운 값으로 교체한다.
//
//	*이미 존재하는 데이터와 key값만 다른 쌍일 경우 value는 같은 값이 
//  	기존에 존재해도 아무 상관없이 새로운 key에 새롭게 삽입된다
//
//< 매핑, Mapping >
//
// - 데이터와 데이터 사이의 관계
// - 두 집합의 원소들 간의 대응 관계
//
//	+일대일 매핑(1:1)
//	+일대다 매핑(1:M) : one to many
//	+다대일 매핑(M:1) : many to one
//	+다대다 매핑(M:N) : many to many
//
//
//< interface Map의 구현체 (class) > 
//
// -class HashMap
//	key중복을 허용하지 않는다
//	
//	key 중복검사는 hashcode()의 반환값이 같고 equals()의 반환값이 true일때로 반환한다
//	(동일성, 동등성 둘 다 만족할 때 중복 key로 판단한다)
//
// -class Hashtable
//	HashMap과 같다
//
//	동기화처리 되어있다(Thread safe하다)
//
// -class Properties
//	조금다름(특별) 나중에
//
//
//
//

