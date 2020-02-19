package Java08_abstract.interfaceEx;

abstract class TestClass{
	public abstract void method();
}
// 인터페이스 : 1.상수를 모아둘때
//			 2.반드시 메소드를 구현해야할때(개발 가이드용)
interface TestInterface{//형태는 클래스랑 같지만 용도가 다르다
//	int num; final필드라고해서 에러가 난다
//	int num을 선언하면 사실 public static final int num이다(나머지 생략되어있다)
	//***선언과 동시에 초기화가 반드시 필요한 케이스이다
	int MAX=2000;
	static int S =400;
	public static final int F=200; //전부 정적 상수 객체로 된다 (인터페이스의 특징)
	//가독성을위해 다 써주어라!!!
		
	//abstract 키워드가 없어도 추상메소드로 만들어짐
	public abstract void display();
	public void out(); //위와 동일하다
		
	
}

class Test extends TestClass implements TestInterface{ //display, out 메소드의 추상메소드를 가지고 있다
	
	int t=MAX; //위의 맥스값을 쓸수도 있다
	@Override
	public void method() { //반드시 구현해야만 한다
		
	}
	
	//(TestInterface)의  추상메소드를 무조건 구현해야한다
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		
	}
	
}




//< 다형성, Polymorphism > 
//- 상속관계에 있는 클래스들에서 나타나는 특징 
//
//- 부모클래스 타입으로 자식클래스 타입들을 대신하여 코드를 작성할 수 있게된다
//	+이미 만들어둔 부모클래스 타입을 상속하여 중복으로 작성하지 않아도 된다
//	+코드 재사용성이 증가된다
//
//-부모클래스 타입의 매개변수를 자식클래스 타입들 대신 사용될 수 있다
//
//	public void method(Parent p){
//		}
//	-->오버로딩해야하는 메소드의 수를 줄일 수 있다
//
//< 인터페이스, interface > 
//-추상메소드만 만들 수 있다
//
//- 추상메소드와 상수만 멤버로 가지는 일종의 추상 클래스
//
//- 멤버필드는 public static final 이 기본적으로 적용된다
//
//- 멤버메소드는 abstract가 기본적으로 적용된다
//
//	+멤버필드에 public static final 중 무엇이든 적용하지 않아도 전부 자동 적용
//	+멤버메소드에 abstract를 적용하지 않아도 자동 적용
//
//- 인터페이스 사용 목적(용도)
//	+상수 모음집 : 상수들만 모아 따로 관리하기 위해 사용
//	+메소드 개발 가이드 : 개발해야하는 메소드의 형식을 강제하기 위해 사용
