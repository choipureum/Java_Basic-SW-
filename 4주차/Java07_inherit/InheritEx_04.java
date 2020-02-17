package Java07_inherit;

class Parent4{
	protected int num;
	
	public Parent4() {
		System.out.println("부모 디폴트 생성자");
	}
	public Parent4(int num) {
		this.num = num;
		System.out.println("부모 매개변수 있는 생성자");
	}
}

class Child4 extends Parent4{
	public Child4() {
//		super(); //슈퍼 생성자, 생략되어 있음
		this(999);// Chile(int num)으로 간다 //super()와 둘다 사용할 수는 없다
		System.out.println("자식 디폴트 생성자");
	}
	public Child4(int num) {
		super(num); //슈퍼생성자는 따로 호출하지 않아도 기본적으로 디폴트 생성됨;
		this.num=num;
		//Child4 내에 num변수가 없기때문에 super영역에서 찾음
		super.num =num; //둘다 가능 하지만 둘다 모두 잘 사용하지 않는다
		System.out.println("자식 매개변수 있는 생성자");
	}
}


public class InheritEx_04 {
	public static void main(String[] args) {
		Parent4 p =new Parent4();
		System.out.println("-------------");
		Child4 c= new Child4();
		System.out.println("-------------");
		
		Parent4 p2 = new Parent4(123); //오버로딩된 메소드 등장
		Child4 c2 =new Child4(123); //super() -->부모 디폴트 생성자 + 자식 매개변수 있는 생성자
		//super(num) -->부모 매개변수 있는 생성자 + 자식 매개변수 있는 생성자
	}
}
//< super 키워드 >
//-super : 
//	+부모객체 참조
//	+자식 클래스에서 부모클래스의 멤버에 접근할 때 사용한다
//	+자식클래스에서 정의한 이름(식별자)와 상속받은 부모클래스의 이름(식별자)가
//	중복될 때 구분하기 위해 사용할 수 있다
//	
//	ex) 	this.num =10; //자식 클래스에서 정의한 멤버필드 num
//		super.num =20; // 부모클래스에서 정의한 멤버필드 num
//
//		//오버라이딩이 되어있는 경우
//		this.display(); //오버라이딩한 메소드
//		super.display(); // 오버라이딩 전 부모 메소드
//		
//-super() :
//	+수퍼 생성자 호출
//	+자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 사용
//	+전달인자를 넣어 사용 가능하다
//	(부모클래스에 정의되어 있을 때만 가능하다<매개변수 생성자가 있어야한다>)
//	+호출하지 않으면 디폴트생성자 호출(super())
//	+자식 클래스의 생성자에서 첫 번째 코드로 사용해야한다--맨첫줄
//	
	
