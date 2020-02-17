package Java07_inherit;

class Parent2{ // Parent로 했을때 에러 발생 ->같은 패키지 안에 있는 객체명은 같은 것으로 인식한다 
	//원래 이름은 Java07_inherit.Parent.java가 원래이름
	protected int num;
	//private int num;을 할시에 상속 불가
	
	public void display() {
		System.out.println("부모 메소드");
	}	
}
class Child2 extends Parent2{
//	private int num; //이렇게 부모와 자식이 같은 이름의 두개라면 밑에는 어떻게 될까?-->***
	//그냥 cirl+space 를 누르면 바로 기본적으로 부모 클래스의 메소드를 바로 오버라이드 할 수 있다
	@Override
	public void display() {	
		super.display(); //super는 부모 메소드에서 불러오는것
		System.out.println("오버라이딩 메소드");
		num=100; //상속받은 멤버필드가 private라면? 
		//private라면 오버라이드 , 상속받아도 안된다 이럴땐? ==>접근제한자를 protected로 해야한다
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		Child2 c= new Child2();
		c.num=123; //*** protected자체는 같은 패키지 공유기때문에 원래 상속 받으면 된다. 근데
		//자식 클래스에서 private로 덮어씌우면서 버그성 문제가 발생한다. private로 인식 -->이렇게 쓰면 안된다
		c.display();
		Parent2 p=new Parent2();
		
		p.num=13;
		p.display();
		System.out.println("------------------");
		
		Parent2 pc = new Child2(); //Parnet2타입 <-Child2 변수 저장 (자동 형변환)
		//** 부모클래스가 자식클래스를 받아준다 **	
//		Child2  cp = new Parent2(); //Child <--Parent 는 에러 발생(type mismatch)
//		Child2  cp = (Child2)new Parent2(); //ClassCastException 에러발생
		
		pc.display(); //child2의 메소드 호출(동적바인딩)
		pc.num=1234; //Parent2의 변수 사용(정적바인딩)
		//?? -->헷갈린다 그래서 메소드는 오버라이딩, 멤버필드는 따로 하는 것이 좋다
		((Child2)pc).num=123; //-->Child2의 num을 불러온다
		
	}
}

//< 상속, Inheritance > 
//-(2~3개정도 사용해준다)
//- 목적 : 클래스 코드의 재사용
//- 기존의 클래스 코드를 재사용하여 새로운 클래스를 작성할 수 있게 해주는 문법
//	** 코드의 재사용
//	기존의 코드를 이용하여 새로운 코드를 개발하는 것
//	(필요한 부분은 수정하고, 추가하기도 한다)
//
//- 클래스의 중복되는 코드를 하나의 클래스로 관리할 수 있게 해준다
//- 상속을 주는 클래스의 코드를 변경하면 상속을 받는 클래스들 전부 반영된다
//
//	+상속을 주는 클래스 : 부모 ,슈퍼, 상위, ,Based(기준이 되는) 클래스
//	+상속을 받는 클래스 : 자식, 서브 ,하위, Derived(유도된,파생된) 클래스
//
//-상속의 문법
//	
//	class Parnet{
//	   int n1;
//	   int n2;
//	   String name;
//	}
//	
//	class Child extends Parent {
//		
//	}
//		child 클래스는 parent 클래스의 멤버필드를 상속받음(extends 부모클래스명)
//		child 클래스는 필드를 선언하지 않았지만 가지고 있는 것처럼 사용가능
//
//
//< 메소드 오버로딩, overloading > 
//- 메소드 중복정의 
//- 같은 이름의 메소드를 매개변수의 개수나 타입을 다르게 하여 다른 메소드를 정의하는 것
//
//< 메소드 오버라이딩, overriding >
//- 메소드 재정의(수정)
//- 상속받은 메소드를 자식클래스가 새롭게 정의하는 것
//



