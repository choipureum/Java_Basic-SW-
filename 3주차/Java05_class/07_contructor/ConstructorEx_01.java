package Java06_class.constructor;


//클래스를 하나의 클래스에 하나만 정의하는게 원칙이고 그게 좋다// 한번 사용해보기

class Constructor{ //기능클래스 
	private int num1;
	private int num2;
	
	//*1 : 디폴트 생성자 (매개변수가 없는 생성자)
	//리턴타입이 따로 필요없음
	public Constructor(){
		System.out.println("디폴트 생성자 호출됨");
		System.out.println("===초기화전===");
		System.out.println(num1);
		System.out.println(num2);
		num1=500;
		num2=600;
		System.out.println("===초기화후===");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("============");
}
	//Getter, Setter Method(alt, shift, s)
	//메개변수가 있는 생성자 해보기
	public Constructor(int num1, int num2) {
		System.out.println("매개변수 있는 생성자 호출됨(생성자 오버로딩)");
		this.num1 =num1;
		this.num2 =num2;
		
		setNum1(num1);
		setNum2(num2);
				
	}
	//생성자에 void가 들어가면?
	//동작안한다// 경고 메세지 뜬다
//	public void Constructor() {
		
//	}
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
}

//실행클래스
public class ConstructorEx_01 { //public 접근제한자는 파일명과 같은 클래스에서만 사용할 수 있는 특수한 접근제한자, 1개만 정의가능하다
	public static void main(String[] args) {
		Constructor cons = new Constructor(); //객체 생성 
		Constructor cons2= new Constructor(111,222);
		//Constructor 디폴트 생성자 호출 -->출력
		//new를 함과 동시에 디폴트 생성자를 생성한다. ->*1
		//객체안에 num1 =0;초기화, num2=20;값이 생성된다
		System.out.println("cons1 : "+cons.getNum1());
		System.out.println("cons2 : "+cons.getNum2());		
	}
}
//< 생성자, Constructor >
//+ex) new Scanner(); //객체 생성에서 new뒷부분 ==생성자
//+객체가 생성될 때 반드시 호출되는 특수한 메소드
//
//+역할 : 객체를 초기화(Initizlize)한다
//	-생성된 이후 최초로 가지고 있어야할 값을 지정한다(대입한다)
//	=객체(인스턴스)가 가지고 있는 멤버 필드(인스턴스 변수)를 초기화한다
//	
//=>생성자를 하나도 정의하지 않으면 default 생성자를 컴파일러가 자동으로 추가한다
// **default 생성자 : 매개변수가 없는 형태의 생성자
//
//+생성자가 하나라도 정의되어 있으면 디폴트 생성자를 자동으로 추가하지 않는다
//
//< 생성자의 특징 >
//
//+메소드와 비슷한 구조를 가진다
//+리턴이 없다
//+오버로딩이 가능하다
//+생산자의 이름은 클래스명과 같다
//+생성자의 호출은 new 연산자와 함께 사용한다






