package Java06_class;


// 실행 클래스
public class Main_02 {
	public static void main(String[] args) { //main()은 퍼블릭으로 둬야한다. 아니면 실행 X
	Class_02 cl = null; //객체 변수 선언
	cl=new Class_02(); //객체 생성, 인스턴스화
	
		System.out.println(cl.num4); //public
		System.out.println(cl.num3); //protected
		System.out.println(cl.num2); //default
//		System.out.println(cl.num1); //private //에러
		
	}
}

// < 접근제한자 , Access Modifier >
//  -목적 : 객체의 고유한 속성(멤버 필드), 동작(멤버 메소드)에 대한 정의들을 객체의 외부에 함부로 공개되지 않도록
// 		하기 위해 사용한다

//  -객체의 멤버들은 프로그램을 구성하는 중요한 정보를 담고 있기 때문에 객체의 외부에서 함부로 변경하도록 놔두면 프로그램에 악영향을
//   끼칠 수 있다

//	-접근제한자를 이용해 공개 범위를 조절한다

// <접근제한자 종류>
// +private : 해당 클래스 내에서만 접근가능(private가 적힌 클래스 내부)
// +defalt(package) : 같은 패키지 내에서 접근 가능  //거의 못본다
// +protected : 같은 패키지 OK  + 상속 관계에 있는 객체에서 접근 가능 //거의 못본다
// +public : 모든 접근 OK

//  <접근제한자 적용할 수 있는 위치>
//  -멤버 필드 : 4가지 전부 가능 , private (중요한 정보) ->멤버 필드는 그냥 private로 해라
//  -멤버 메소드 : 4가지 전부 가능, public -->동작은 그냥  public하면 된다
//  -클래스 정의 : public, defalut 만 가능
//  

// <접근 제한자의 공개 범위>
//  + private <default <protected < public

// <정보 은닉, Informaion Hiding>
// -접근제한자를 이용하여 구현된다
// -객체(클래스)의 중요한 정보를 함부로 공개되지 않도록 관리한다

// <캡슐화, Encapsulation>
//  -객체를 이루는 정보(필드), 기능(메소드)들을 하나로 묶은 것
//  -데이터  +기능
//  -프로그램에서 서로 관련있는 파트(모듈)를 하나의 클래스로 묶어서 표현
//  


