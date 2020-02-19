package Java08_abstract.interfaceEx;



interface InterA{
	public abstract void getA() ;
			
}
interface InterB{
	public abstract void getB() ;
			
}
interface InterC extends InterA,InterB{ //**인터페이스 끼리의 상속은 extends를이용해야한다
	//**그리고 인터페이스는  다중상속이 가능하다
	public abstract void getC() ;
			
}
class Child03 implements InterC{ //getA,getB,getC를 추가해야만 한다(InterA~C까지 상속)
	@Override
	public void getA() {
		// TODO Auto-generated method stub
		
	}
	@Override
		public void getB() {
			// TODO Auto-generated method stub
			
		}
	@Override
	public void getC() {		
	}
}

//public class InterfaceEx_03 {
//
//}
//< 클래스와 인터페이스의 상속 > 
//
//-클래스가 인터페이스를 상속(구현)할 때 : implements
// (여러개의 인터페이스 상속 가능)
//
//-클래스가 클래스를 상속할 때 : extends
// (한개 클래스만 상속 가능)
//
//-인터페이스가 인터페이스를 상속할 때 : extends
// (여러 개 인터페이스 상속 가능)
//
//**인터페이스가 클래스를 상속하는 건 안된다
