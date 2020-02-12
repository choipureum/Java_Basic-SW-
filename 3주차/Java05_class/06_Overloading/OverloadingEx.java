package Java06_class.overloading;


public class OverloadingEx {
	public static void main(String[] args) {
			
		Overloading_01 o1 =new Overloading_01();
		
		System.out.println("===display()===");
		o1.display();
		
		//오버로딩 되었다
		System.out.println("===display(int,int)===");
		o1.display(11,22);	
		
		//-------------------------------------------------------
		//Overloading_02 풀기
		Overloading_02 o2 =new Overloading_02();
		System.out.println("111233의 문자수 : "+ o2.getLength(111233)); //숫자의 길이를 출력한다.			
		System.out.println("true의 문자수 : "+ o2.getLength(true));
		System.out.println("false의 문자수 : "+ o2.getLength(false));
		System.out.println("12.345의 문자수 : "+ o2.getLength(12.345)); //숫자만
	} 	
}

// < 메소드 오버로딩,Method Overloading >
//	+overload(과적하다)
//	+메소드를 중복 정의
//
//	-같은 이름의 메소드를 여러 개 정의하는 것
//	-비슷한 기능을 하는 추가 메소드를 개발하기 위해 별도의 이름을 사용하지 않고
// 	기존의 메소드 이름을 사용할 수 있게 해준다
//
//   < 메소드 오버로딩이 성립되는 조건 >
//		1. 매개변수의 데이터 타입이 다른 경우
//		2. 매개변수의 데이터타입의 개수가 다른 경우
//
//    **반환 데이터 타입은 오버로딩과 상관없다
