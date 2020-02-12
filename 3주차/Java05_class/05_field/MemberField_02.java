package Java06_class.field;

//기능클래스 2
public class MemberField_02 {
	
	//클래스변수, 정적변수, static 변수 
	public static String city ="Seoul";
	//static 은 객체생성없이 사용가능하다 . MemberField_02.city()로 사용가능
	//하지만 private일때는 직접 호출이 불가능 -->그렇다면?
	//메소드 getCity도 static으로 만든다 --> MemberField_02.getCity()로 사용가능
	
	
	//인스턴스 변수
	public static String city2 ="Pyeongyang";
	
	//getter city
	//city가 private일때 이렇게 써줘야한다
	//정적 메소드, static 메소드(정적인 시간에 객체생성없이 미리 사용가능)
	public static String getCity() {
		return city;
	}
//	**1
	private int num; //인스턴스 변수 (new~로 선언된 시점에서 할당된다-->동적인 타이밍으로 넘어가야함)
	public static void test() { //정적메소드
//		System.out.println(num); //에러발생 num을 static으로 해줘야한다(코드 실행 시점이다르다)
		//정적인 타이밍에 실행 -->오류발생
	} //밑에 해결코드
	//------------------------------------------------------
//	**2
	private static int num2;// 정적 변수
	
	public void test2() {
		System.out.println(num2); //정적인 시점에 num2가 선언되고 이후에 num2출력이기때문에 에러발생 X
	}
}	

//< 메모리영역은 3가지 >
// 1. 클래스 메모리영역
// 	 +정적변수 , 바이트코드, 상수
// 	 +MemberField02.city ->정적변수선언
// 2. 스택메모리 영역
//	+m4,m5저장
// 3. 힙메모리 영역


//무결성 : 내가 기대한 값이 나오는 것


//--------------------------------------------

//< static 키워드, 정적 키워드 >
// -클래스의 멤버를 인스턴스화(객체 생성)없이 사용할 수 있게 만드는 키워드
// -멤버 필드, 멤버 메소드 모두에게 적용할 수 있다
// -객체(인스턴스)와 상관없이 사용할 수 있고 클래스 단위로 제어된다
// -클래스 마다 따로 관리한다
// -정적인 시점(프로그램 동작 직전)에 사용할 수 있는 준비가 완료된다
// -멤버 필드는 클래스 영역에 변수 공간 생성
// -멤버 메소드는 실행할 수 있는 준비가 완료됨(바인딩)
//
// **1정적메소드에서 인스턴스 변수 사용할 수 없다
// **2정적메소드에서는 정적 변수만 사용해야 한다
// **3일반 메소드에서 인스턴스변수, 정적변수 둘 다 사용할 수 있다
//
// **main()메소드는 static(정적)메소드이다(호출하고등등의 작업 필요X)
