package Java08_abstract.interfaceEx;

public class Child extends Parent implements Inter_01,Inter_02{ //상속은 반드시 하나만가능(단일 상속)
	//인터페이스는 여러개 가능, 어차피 충돌나지 않는다
	
	//아무것도 구현안해도 Parent에서 상속받은 out()메소드가 있기 때문에 에러가 나지 않는다
	@Override
	public void out(){	 //Parent에서 받은 out, interface에서 받은 out전부 	
		System.out.println("자식클래스");		
	}
	
}
