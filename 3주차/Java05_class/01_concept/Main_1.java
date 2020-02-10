package Java06_class;
import java.util.*;


// 실행 클래스 (main()메소드를 가진 클래스)
public class Main_01 {
	public static void main(String[] args) { //Class_01이랑 연동해보자
		int num;
		
		//---------------------------------
		Class_01 c01; //Class_01이라는 타입의 객체 변수 c01선언(참조형 변수)
		c01 = new Class_01(); // new  + 같은 데이터타입() 형태//Class_01타입의 객체(인스턴스) 생성
		//사용자 정의 타입이라고 하기도 한다
		//c01타입에서 선언한 객체들에 초기화도 가능
		{
		c01.str ="Apple";
		c01.num = 100;  
		}
		//c01객체의 멤버필드 num, str출력하기 (객체 내부의 값 활용)
		System.out.println(c01.str);
		System.out.println(c01.num);
		
		//c01객체의 멤버메소드 display()사용(호출,call)
		c01.display();  //메소드 출력
		//메소드를 호출 할 때에는 메소드명을 적고()괄호를 붙인다
		
		//-----------------------------------------------
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		
		c02.num =200;
		c03.num =300;
		c04.num =400;
		
	}
}


//<객체 지향 프로그래밍>
//+Obeject Oriented Programming, OOP
//
//-객체들의 상호작용(데이터 전달)을 통해 프로그램이 동작되도록 작성하는 프로그래밍 기법
//*객체(Object) : 1.프로그램에서 구현하고자하는 모든 대상
//               2.현실 세계의 대상, 객체(Object) ------->>>클래스,Class-------->>>인스턴스(Instance) =객체
//						                    (추상화작업)
//		       ex)사람(이름,나이, 발 사이즈 등등)                                Person p1;
//		        Class Person(String name, int age)			              p1.name ="개똥이"
//	            								                          p1.age =26;
								//										   Person p2;
								//										   p2.name ="개똥이" 
								//										   p2.age =26;
//
//*클래스(Class)
// +객체의 정보 중 프로그램에서 필요로 하는 것들만 코드화한 것
// +객체를 추상화한 것
//
//
//**추상화,Abstraction
//+현실 세계의 대상을 나타내는 객체의 공통으로 존재하는 속성, 기능, 행위 등을 개념화하는 작업
// -->프로그램에서 필요한 요소들만 뽑아서 정리한 것
//
// +프로그램에서 필요한 주요 관심사만 고려한다
// +불필요하거나 중요하지 않은 요소는 무시한다

//   <인스턴스, Instance>
//   -클래스 정의 코드를 통해서 생성된 객체
//   -메모리에 생성된 객체
//   
//   +인스턴스화,Instanciate
//    -실체화
//    -메모리에 실체화하는 작업
//    -클래스 정의 코드를 통해 메모리에 실제 저장 공간을 생성하는 일(new 연산자 사용)




//   **설계도 ->건물
//   **클래스 ->인스턴스
//   








