package Java11_generic;
import java.util.*;


public class Generic_09_Wildcard {	
	public static void display(List <?>list) { //List list는 List의 타입을 결정해주는게 좋다
		//<>사이에 무엇이 들어가든 성립하지 않는다 --> wildcard인 <?>를 작성
		
		for(Object i : list) {
			System.out.println(i);
		}
	}
	public static void display2(List<? extends Number> list) { //숫자 리스트만
		
	}
	public static void display3(List<? super String> list) { // Integer금지  String만(String의 상위클래스만 가능)
		
	}
	
	public static void main(String[] args) {
		List <Integer> list =Arrays.asList(10,20,30); //int [] arr ={10,20,30}; 과 같은개념
		display(list);
		
		List <String> list2 =Arrays.asList("a","b","c");
		display(list2);
		
		
		//-----------------------------
		Object o=null; 
		Integer i=null;
		o=i; //Object타입은 Integer의 부모클래스이므로 받아줄 수 있다
		
		//-------------------------------
		List<Object> o1 = null;
		List<Integer> o2 = null;
//		o1=o2; //에러 /
		//제네릭은 자바의 기본 상속구조를 무시한다
		List <?> l = null;
	}	
}	
//< 제네릭 클래스, 제네릭 인터페이스 상속하기 >
//
//- 부모클래스(인터페이스)의 타입파라미터를 결정하면서 상속해야함
//- 부모타입에서 타입파라미터를 결정하지 않으면 자식클래스가 타입파라미터를 처리해야 한다
//
//	-> 타입에 대한 것을 미룰 수 있다
//	-> 자식클래스에서 지정한 타입파라미터로 사용한다
//
//
//< 와일드 카드, WildCard >
//
//- 타입 파라미터에서 어떤 타입으로든 사용가능하도록 지정되는 제네릭
//- <?> : 제한 없이 어떤 타입 파라미터로든지 사용할 수 있음( 안 좋음 -잘안씀)
//
//	**그나마 많이 쓰는 것
//- <? extends 상위타입> : 지정한 상위타입의 하위클래스로만 사용할 수 있는 타입파라미터
//- <? super 하위타입> : 지정한 하위타입의 상위클래스로만 사용할 수 있는 타입파라미터
// 

// -->제네릭은 API document에서 많이 쓰이기 때문에 알아둘 필요가 있다 예를 들면..
//public class ArrayList<E>{
//	  public ArrayList(Collection<? extends E> c){
//	 }
//	}
//
//	 ArrayList<Number> list = new ArrayList<>(new ArrayList<Integer>());
