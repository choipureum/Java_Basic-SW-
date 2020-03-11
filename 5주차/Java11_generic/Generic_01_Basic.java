package Java11_generic;
import java.util.*;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList(); 
		//타입 파라미터 E를 결정하지 않아 Object로 사용됨
		
		List <String> list2 = new ArrayList<String>(); // 원래 뒤에도 이렇게 Generic타입을 적어야 했다.
		List <String> list3 = new ArrayList<>();// 최근엔 이렇게 생략가능
		//타입 파라미터 E -> String으로 지정
		
		list2.add("A");
		//list2.add(123); //에러 String만 들어가야한다
		
		//Wrapper클래스가 <>안에 들어가야한다 (기본데이터타입 사용불가) char->Character
		List<Integer> list4 =new ArrayList<>();
		//---------------------------
		//타입안정성
		// 개발자가 의도한 데이터 타입으로만 사용되는 것
		
		String str1= (String) list.get(0); //(String)이 없으면 에러발생 ->타입 형변환필요 (제네릭의 이유이다)
		String str2 = list2.get(0);
		
	}
}

//< 일반화 프로그래밍 > 
//
//- 자료형을 일반화시켜서 프로그래밍 하는 것
// 일반화--> 데이터타입<T>
//
//- 자바에서는 제네릭을 이용하여 구현한다
//
//- ex)
//	public void out(String var){}
//	public void out(Integer var){}
//	public void out(Boolean var){}
//
//		--> public <T> void out(T var){}
//
//	장점 :  중복코드가 줄어든다, 재사용성 증가

//< 제네릭 , Generic >
//
//- 클래스 또는 메소드에서 사용되는 다양한 데이터타입을 일반화시켜 정의하는 방법
//- 타입 안정성이 제공된다
//	**타입안정성, Type Safety
//		: 객체 또는 메소드가 의도하지 않은 타입으로 사용되는 상황을 방지하는 것
//		 개발자가 의도한 데이터타입만 사용하도록 제한하는 것
//
//- 클래스와 메소드에 적용할 수 있다
//- 불필요한 형변환을 줄일 수 있다
//- 자주 사용되는 제네릭 타입 파라미터 이름
//
//	T - Type
//	E - Element
//	K - Key
//	V - Value
//	N - Number
