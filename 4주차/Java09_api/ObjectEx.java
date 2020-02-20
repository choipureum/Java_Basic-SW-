package Java09_api;


class Point implements Cloneable {
	int x; //x좌표
	int y; //y좌표
	

	public Point(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	
	//toString()단축키 : alt + shift + s, s (자동으로 이쁘게 정리해서 리턴해준다 )	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {	
		//내용이 같은지(equals메소드는 새로 이렇게 작성해주어야한다) -->아니면 객체비교
		//얕은복사 깊은복사 차이
	    if(this.x==((Point)obj).x && this.y ==((Point)obj).y) {
			return true;
	    }
	    
	    return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {		
		return super.clone();
	}

}

public class ObjectEx {
	public static void main(String[] args) {
		Object obj =new Object();
		Point p1=new Point(10, 20);
		
		System.out.println(obj.toString()); //java.lang.Object@2a139a55
		System.out.println(p1.toString()); //Java09_api.Point@15db9742
		//오버라이드 -->(10,20)
		System.out.println("--------------");
		//Sysout의 전달인자로 객체가 사용되면
		//toString 반환값을 출력한다
		System.out.println(obj);  //java.lang.Object@2a139a55
		System.out.println(p1);  //Java09_api.Point@15db9742
		//오버라이드 -->(10,20)
		
		System.out.println("--------equals----------");
		
		Point p2= new Point(11,22);
		Point p3= new Point(11,22);
		Point p4= p2;
		
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
		System.out.println("p4 : "+p4);
		
		//동일성을 비교하는 코드-identity
		//	같은 객체인지 확인, 같은 참조대상을 가리키고 있는지 확인
		// ==연산자
		System.out.println("p2==p3 : "+(p2==p3));
		System.out.println("p2==p4 : "+(p2==p4));
		
		System.out.println("-------------------");
		
		//동등성을 비교하는 코드
		// 같은 값인지 확인, 참조대상의 값이 같은 값인지 확인
		// equals()메소드
		System.out.println("p2.equals(p3) : "+p2.equals(p3));
		System.out.println("p2.equals(p4) : "+p2.equals(p4));
		
		System.out.println("------hashcode-------");
		System.out.println("p2 : "+p2.hashCode()); //주소값이 십진수값으로 변환되서 출력
		System.out.println("p3 : "+p3.hashCode()); //오버라이딩 안해도된다
		System.out.println("p4 : "+p4.hashCode());
		
		System.out.println("---------------------");
		String s1= new String("Apple");
		String s2= new String("Apple");
		String s3= new String("Banana");
		String s4=s1;
		
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s2 : "+s2.hashCode());//다른 저장소에 저장했지만 s1과 같다
		System.out.println("s3 : "+s3.hashCode());//이유는?
		System.out.println("s4 : "+s4.hashCode());//
		// 문자열 String은 hashcode()메소드를 오버라이딩 하고 있다
		// 문자열의 **내용물(각 char데이터)를 가지고 
		// 재생산된 고유값을 반환한다
		
		System.out.println("-----clone--------");
		
		Point p_ori =new Point(33,44);
		Point p_clone1 =p_ori; //(얕은 복사);
		
		//생성자를 이용한 깊은 복사
		Point p_clone2 = new Point(p_ori.x,p_ori.y); 
		
		//clone()을 이용한 객체 복사(깊은 복사)
		Point p_clone3 =null;
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}  //clone 은 사용하려면 Objcet를 상속받은 곳이어야한다
//		물론 메인메소드도 Object를 상속받지만 p_ori에서는 clone이 정의되어있지 않으므로 건너건너는 불가능
// 		그렇다면 Point쪽에서 다시 재정의해줘야한다 클론을	
		
		System.out.println(p_clone3);
		System.out.println("p_ori.equals(p_clone3) : "+p_ori.equals(p_clone3));
		System.out.println("p_ori==p_clone3 : "+(p_ori==p_clone3));
	}
}

//< API, Application Programming Interface >
//
//-프로그램을 개발하기 위해 만들어진 코드들
//
//-응용프로그램이 운영체제(OS)나 기타 시스템과 상호작용(통신)을 할때 
//사용되는 메시지 형식의 모음(메소드들)
//
//-프로그램을 개발하기 위해 자바에서 제공해주는 기본적인 클래스들
//-JDK에 같이 배포된다
//
//
//< Object 클래스 >
//
//-패키지 : java.lang
//-자바의 모든 클래스의 최상위 부모 클래스
//-모든 클래스는 Object를 상속받고 있다
//-자바 프로그래밍의 기본이 되는 클래스이다
//
//
//< Object 클래스의 메소드 > 
//
//-재정의(override) 불가 메소드
//	//스레드 동기화에 사용
//	+ notify
//	+ notifyAll
//	+ wait
//
//	//클래스의 타입 정보를 반환(Class타입)
//	+ getClass
//
//-재정의(override) 가능 메소드
//
//	+ toString
//		: 객체를 설명하는 문자열 반환
//		: 기본리턴값 -"데이터타입@참조값"형식의 문자열
//		: Sysout 메소드의 전달인자 객체를 사용하면 해당 객체의 toString() 반환값을
//			출력한다	 
//	+ equals
//		: 객체가 같은 값을 가지고 있는지 비교하는 코드로 재정의해서 사용한다(안하면 그냥 객체비교)-identity비교가 되버림
//		: 동등성을 비교해야하기때문에 재 정의해야한다(같은 값을 가지는지)
//	+ hashcode
//		: 객체의 고유값을 반환한다
//		: 기본동작으로는 객체의 참조값을 10진수(int)로 반환한다
//		**String은 같은 데이터라면 같은 Hashcode를 반환한다
//		**String은 동등한 객체에서 같은 Hashcode를 반환한다
//	+ clone
//		: 객체 복사 메소드
//		: protected 접근제한자로 설정되어있다
//		: 사용하려는 클래스에서 public으로 오버라이딩한 후 사용한다
//		: 반환타입이 Object이므로 형변환 필요하다
//		: 예외처리구문(try-catch)을 추가해야한다
//		: clone()을 구현하는 클래스는 interface Cloneable을 상속해야한다
//		: 깊은 복사가 이루어진다
//		
//	+ finalize
//		: GC(Garvage Collector, 가비지 컬렉터)가 객체를 파괴할 때 호출하는 메소드
//		: 호출하는 메소드 (쓰지마시오!!!)
//
