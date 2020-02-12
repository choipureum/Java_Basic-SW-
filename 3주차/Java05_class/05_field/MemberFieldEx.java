package Java06_class.field;
import java.util.*;

public class MemberFieldEx {
	public static void main(String[] args) {
		//static이 붙어있으면 정적메소드이다
		MemberField_01 m1=new MemberField_01(); //처음 클래스명은 조금적고 alt+enter 자동완성 
		MemberField_01 m2=new MemberField_01(); //두번째는 new적고 바로 alt+enter하면 자동완성 가능
		MemberField_01 m3 =null; //NullPointer
		
		m1.setNum(100);
		m2.setNum(200);
//		m3.setNum(300); NullPointerException 에러발생(m3에서 문제, 참조를 할 대상이 없음)
			
		System.out.println(m1.getNum()); //100
		System.out.println(m2.getNum()); //200 출력	
		
		System.out.println(m1.getName()); //Alice --기능클래스에서 선언을 안해줬다면 null, 아니면 초기값
		System.out.println(m2.getName()); 
		
		System.out.println("================");
		MemberField_02 m4 =new MemberField_02();
		MemberField_02 m5 =new MemberField_02();
		//m4, m5공간 2개생성
		System.out.println(m4.city);
		System.out.println(m5.city);
		
		m4.city="Busan";
		System.out.println("===============");
		System.out.println(m4.city); //바뀐 Busan출력 
		System.out.println(m5.city); //원래 Seoul 출력
		MemberField_02.city="jeju";
		System.out.println(MemberField_02.city); //static일때 이렇게 쓰는게 낫다
		System.out.println(MemberField_02.getCity()); //private일때 static으로 이렇게 사용가능(객체생성없이가능)
		//city 를 static을 추가해준다면? ==> m5도 Busan이 출력된다
		
		//---------------------------------------------------------
		//MemberField_03
		MemberField_03 mf3 =new MemberField_03();
		mf3.method(0); //인스턴스 변수 num, 지역변수 num2호출 777,202	
	}
}

//<메소드에서 return 코드의 역할 >
//1. 반환값 지정
//2. 메소드 종료
//
//**return 데이터 타입이 void인 메소드는 반환값을 지정하지 않고 메소드를 종료시키는
// 역할만 수행할 수 있다. ex) return;
//
//** main()메소드에서 return 코드를 사용하면 프로그램이 종료된다(main()메소드가 특수하기
//때문에 종료를 의미)
//
//
//< 클래스, Class >
//-기본문법-
//[접근제한자][클래스식별자] class [클래스명]{
//	//멤버필드
//	//멤버메소드
//	}
//
//-접근제한자 : public 또는 안붙임(default) 
//	public - .java(확장자가 java) 파일의 이름과 같은 클래스명일 경우 붙일 수 있다
//	       - 하나의 JAVA파일 안에서 하나의 public 클래스만 정의할 수 있다
//	
//	default -public 클래스 이외의 클래스에서 사용
//
//-클래스 식별자
//	+클래스의 목적이 달라진다(abstract, final, static...등등)
//
//-클래스명 : 식별자, 첫 글자를 영어 대문자로 시작한다
//
//-멤버 필드 : 
//	-클래스를 구성하고 있는 변수와 상수(이름있는 상수)//주로 변수를 뜻함
//	-객체가 생성될 때마다 각각의 객체(인스턴스)마다 변수공간을 가지게 된다
//
//-멤버 메소드 :
//	-클래스(객체)의 기능, 행위를 정의한 코드
//
//< 객체 변수 선언하기 >
//	[클래스명][객체변수명];  ex)Scanner sc;
//
//< 객체 생성하기(인스턴스화)>
//	[객체변수명]= new [클래스명]();  ex)Scanner sc=new Scanner();
//
//< 객체의 멤버에 접근하기(참조하기) >
//	[객체변수명].[멤버필드명];  
//	[객체변수명].[멈버메소드명(); sc.nextInt();
//
//**참조연산자 . 을 이용하여 객체변수를 통해 멤버에 접근할 수 있다
//
//

//@< 클래스 내부에서 사용되는 변수의 유형 >
//
//-인스턴스 변수, Instance Variable : 파란색
//	+일반적인 멤버 필드
//	+객체를 생성(인스턴스화)하면 각 인스턴스마다 변수 공간을 따로 가짐	
//
//-클래스 변수, Class Variable :(Memberfield_02참조)
//	+정적변수
//	+static 키워드가 적용된 멤버 필드
//	+class 당 하나의 공간을 생성되는 변수
//	+프로그램 실행되기 전(정적인 시점)에 미리 메모리의 클래스 영역에 생성한다
//	+해당 클래스 타입으로 생성된 객체들이 하나의 공간을 공유한다
//	+***객체를 생성하지 않아도 클래스 멤버를 사용할 수 있다 <-포인트(객체생성 : ex)MemberField_01 m1=new MemberField_01();)

//-지역 변수, Local Variable :(Memberfield_03참조) 노란색
//	+메소드 내에서 선언된 변수
//	+접근제한자 사용할 수 없음
//	+매개변수도 지역변수로 취급됨(var)
//	+메소드 마다 별도의 공간(스택 메모리영역)에 생성된다(같은 이름의 변수가 다른 메소드에 존재할 수 있다)
// 	+초기화하지 않으면 쓰레기 값을 가진다	
