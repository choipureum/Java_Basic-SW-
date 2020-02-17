package Java07_inherit;

class Parent5{
	public void display() {
		System.out.println("부모 메소드");
	}
}

final class Child5 extends Parent5{ //자식클래스 //class앞에 final을 할 경우 상속을 줄 수 없는 클래스로 선언된다
	@Override
	public final void display() { // public final void로 final을 선언하면 더 이상 확장할 수 없다. 최종이라는 뜻//끝맺음
		System.out.println("자식 클래스 오버라이딩");
	}
}
//class GrandChild extends Child5{ //손자 클래스라고는 하지는 않지만 그런 것 //final을 선언한 Child5를 상속받을 수 없다
//	@Override
//	public void display() {		
//		System.out.println("2번 재정의된 메소드");
//	}
//}

public class InheritEx_05 {
	public static void main(String[] args) {
//		GrandChild gc =new GrandChild();
//		gc.display(); //2번 재정의된 메소드
		//final을 Child5에 해줄경우 자식 클래스 오버라이딩이 나온다
		
	}
}
//< final 키워드 > 
//-더 이상 확장할 수 없도록 설정하는 키워드
//
//+final 키워드 적용 위치
//	+변수 : 딱 한번만 초기화(대입)할 수 있도록 설정한다(이름있는 상수)
//		ex) public final int MAX =5;
//		    public static final int LEN =10; (static final로 사용하는 경우가 많다)(공유자원)
//
//	+메소드 : 더 이상 오버라이딩할 수 없도록 설정
//		ex) public final void out(){
//			//자식클래스에서 재정의 불가
//			}
//	+클래스 : 더 이상 자식클래스를 생성할 수 없도록 설정
//		ex) public final class Child{
//			//자식클래스를 만들 수 없음
//			//상속을 줄 수 없게 만듬
//			}
