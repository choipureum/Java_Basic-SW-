package Java08_abstract.interfaceEx;


class Parent1{
	public void out() {
		System.out.println("부모 1번");
	}
}
class Parent2{
	public void out() {
		System.out.println("부모 2번");
	}
}
//class Children extends Parent1, Parent2{ //다중상속으로 에러발생
	//어떤 부모클래스의 out을 상속받아야하는지, 호출해야하는지 모호함
	//자바는 extends를 하나의 클래스만 하도록 만들어져 있음
//}


public class InterfaceEx_02 extends Child{
	public static void main(String[] args) {
		Child c = new Child();
		c.out();
		
		System.out.println("----------");
		
		//extends 한 클래스는 부모클래스가된다
		
		Parent p; //부모클래스 타입 객체 변수
		p= new Child(); //부모클래스 <- 자식클래스
		p.out(); // 자식클래스의 메소드 호출(동적 바인딩, 인스턴스 확인)
		
		System.out.println("-----------");
		
		Inter_01 i1; //인터페이스 객체 변수
		//implements한 인터페이스도 부모 타입이 된다
		
		//변수 선언은 추상화처럼 가능
//		i1=new Inter_01(); //당연히 실체화는 불가(에러)
		i1= new Child(); //부모인터페이스<-자식 클래스
		i1.out(); //자식클래스의 메소드 호출(동적바인딩, 인스턴스 확인)
			
	}
}
