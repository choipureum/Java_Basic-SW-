package Java08_abstract;

abstract class  Person{ //부모 클래스
	protected String name; //이름
	
	//추상메소드
	public abstract void display(); //객체의 정보를 출력하는 기능
		
	public Person(String name) { //생성자
		this.name =name; //초기화
	}	
} //person end
//tip/(에러에 f2누르면 이유가나온다)
//자식클래스
class Professor extends Person{ //얘를 추상클래스로 만드는건 해결방법 2
	private String major; //전공
	
	
	//추상클래스의 메소드를 정의해주어야 한다
//	public Professor() { //기본메소드는 Person에서 정의되어 있지 않기때문에 불가하다
//		super();
//	}
	
	public Professor(String name, String major) { 
		super(name);	
		this.major=major; //전공 멤버필드 초기화
	}
	@Override //해결방법 1
	public void display() {
		System.out.println();
		System.out.println("[교수] : "+name+" , [전공] : "+this.major);
	}
}//Professor end
class Student extends Person{
	private String subject; //수강과목
	
	public Student(String name, String subject) {
		super(name);
		this.subject=subject;
	}	
	@Override
	public void display() {		
		System.out.println();
		System.out.println("[학생] : "+name+" , [수강과목] : "+this.subject);
	}
}//Student end

public class AbstractEx {
	public static void main(String[] args)  {
		
		Professor p =new Professor("최푸름","컴퓨터");
		Student p1 =new Student("윤세민","생명과학");
		p.display();
		p1.display();
		System.out.println("------------------");
		
		Person p2=new Professor("최푸름","컴퓨터");
		Person p3 =new Student("윤세민","생명과학"); //인스턴스의 내용호출(동적바인딩)
		p2.display();
		p3.display();
		System.out.println("------------------");
		
		Person[]arr=null;
		arr=new Person[5]; //배열생성
		arr[0]=new Professor("장동건","연극영화");
//		arr[1]=new Person(); -->불가하다
		arr[2]=new Student("아인슈타인","원자학");
		
		for(int i=0;i<3;i++)
		{
			if(arr[i]==null) {continue;} //NullPointerException을 방지한다
			arr[i].display();
		}
	}
} //main method end


//< abstract  키워드 >
//-추상화 키워드
//-클래스와 메소드를 정의할 때 사용한다
//-abstract 키워드를 적용하면 추상클래스, 추상메소드라고 부른다
//
//< 추상 클래스 >
//-실체화(인스턴스화)될 수 없는 클래스
//-new 연산자를 이용하여 객체 생성을 할 수 없다
//-추상메소드를 멤버로 가질 수 있는 클래스(추상클래스에 추상메소드에 없어도된다)
//-인스턴스를 생성할 수 없는 클래스
//-문법)
//	 [접근제한자] (final가능) abstract class [클래스명](extends ~가능){
//		}
//
//< 추상 메소드 >
//-메소드의 구현부(몸체, body, {}부분)가 없는 메소드
//-구현되지 않고 추상화된 메소드
//-추상메소드를 상속받은 자식클래스는 *반드시* 추상메소드를 처리해야 한다
//(오버라이딩하여 구현부를 작성해 준다-->오버라이딩 강제)
//
//-문법)
//	[접근제한자] abstract [리턴타입] 메소드명 (매개변수);
//
//-추상메소드를 멤버로 가지는 클래스는 반드시 추상클래스여야한다.
//
//< 자식클래스가 추상메소드를 상속받은 경우 처리하는 방법 >
//-자식클래스에서 에러가 나지 않도록 처리하는 방법
//
//	1. 상속받은 추상메소드를 구현한다({}영역을 채워넣는다)
//	  - 오버라이딩 처리
//	  ***->자식클래스가 추상메소드를 반드시 구현하도록 강제할 수 있다
//
//	2. 자식클래스를 추상클래스로 지정한다
//	  ex) abstract class Parent{
//		public abstract void out();
//		}
//		//해결방법 1
//		class Child extends Parent{
//		   @Override
//		   public void out(){
//			}
//		}
//
//		//해결방법2
//		abstract class Children extends Parent{	
//		   	//에러는 안나오지만 해결방법1을 주로 사용한다	
//		}




