package Java06_class.constructor;

// ConstructorEx_02 파일의 Constructor와 중복이되서 에러가 난다
// 패키지에서 이름은 중복사용할 수 없다
// class Constructor{	
// }

class Constructor_02{
	private int num1;
	private int num2;
	
	public Constructor_02() {
		this(100,200); //this로 적으므로써 자기자신을 호출가능 -->매개변수가 2개인 생성자로 이동한다
		System.out.println("디폴트 생성자");	
		//this는 자기참조 객채
//		this.num1 =100; //위에서 자기를 참조하는 객체로 사용할수있다
//		this.num2 =200;	
		this.out(); //자기자신의 메소드 호출 ==> cons.out()과 동일 //100,200출력
		//써도 안써도 결과는 같지만 명확하게 변수를 구분해서 보여준다(멤버필드 강조)
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	//매개변수가 int형 하나인 생성자
	//전달인자를 이용해 num1을 초기화한다
	public Constructor_02(int num1) {
		this(num1,600); //this()생성자 호출(다른 생성자 호출) //생성자가 2번호출된다 //
		//***생성자는 무조건 맨 첫줄에 와야한다(생성자가 초기화 과정을 거치기 때문에)
		System.out.println("매개변수 1개인 생성자");	
		this.num1 = num1;
		this.num2 = 600;
		
	}
	//매개변수가 2개인 생성자
	//전달인자 2개를 받아 각각 num1, num2를 초기화
	public Constructor_02(int num1, int num2) {
		System.out.println("매개변수 2개인 생성자");
		this.num1 = num1;
		this.num2 = num2;
		//setter 메소드를 이용하여 멤버필드를 초기화 할 수 있다
		//setNum(num1);
		//setNum(num2);
	}
	public void out() {
		System.out.println("num1 : "+ num1 + ", num2 : "+num2);
	}
}

public class ConstructorEx_02 {	
	public static void main(String[] args) {
		Constructor_02 cons1 =new Constructor_02();
		Constructor_02 cons2 =new Constructor_02(10);
		Constructor_02 cons3 =new Constructor_02(123,456);
		cons1.out(); //100,200
		cons2.out(); // 10,600
		cons3.out(); //123,456 
	}
}

//< this 키워드 >
//
//-자기 참조 객체
//-클래스 코드에서(메소드 정의코드) 다른 멤버를 지칭할 때 사용한다
//-주로 멤버필드와 매개변수가 같은 이름일 때 서로를 구분하기 위해 사용한다
//	 ex) setter
//
//< this() 생성자 >
//-생성자 코드에서 다른 생성자를 호출할 때 사용한자
//-다른 생성자에서 이미 정의 되어져있는 초기화 코드를 다시 작성하지 않고 재사용할 수 있게 된다
