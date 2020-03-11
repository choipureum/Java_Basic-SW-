package Java11_generic;

public class Generic_06_Extends {
	public static void main(String[] args) {
		
		print(123);
		print(23.42);
//		print("Apple"); (extends Number)를 적게되면 에러가 발생 -> String 이기때문
		//제네릭 메소드에 모든 타입이 다들어가게된다 -> 타입안정성에 맞나?
		
	}	
	//제네릭메소드에 여러 타입을 받지만 그래도 뭔가 제약을 주고싶을때 원하는 클래스를 상속받아준다
	//Number 는 숫자를 표현
	public static<T extends Number>void print (T t){
		System.out.println(t);
	}
}
//< 제네릭 타입 제한하기 >
//
//<T> : 어떤 타입 파리미터든지 허용하는 타입파라미터 T
//<T extends 부모클래스타입 > : 지정된 부모클래스타입의 하위클래스들만 허용하는 타입 파라미터 T
//
//- 특정 클래스의 하위 클래스로만 타입 파라미터를 허용할 수 있도록
//제한하고 싶을 때 사용한다
//
//- 인터페이스로 설정하는 것도 가능하다
//
//ex) <T extends Number>
//	->Byte, Short, Integer, Long, Float....
//
//	->String, Point, Person 등등 Number와 상속관계가 아닌 타입은 불가능
