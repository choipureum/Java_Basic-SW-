package Java07_inherit;

class Parent3{
	public int num=111;
	
	public Parent3() {
		System.out.println("부모 디폴트 생성자");
		//자기 참조 객체
		System.out.println("this.num : "+this.num);
	}
}
class Child3 extends Parent3{
	private int num=222;
	
	public Child3(){
		System.out.println("자식 디폴트 생성자");
		System.out.println("this.num : "+this.num);
		System.out.println("super.num : "+super.num);
	}
}


public class InheritEx_03 {
	public static void main(String[] args) {
		Parent3 p =new Parent3(); //부모 디폴트 생성자
		System.out.println("------------------");
		Child3 c= new Child3(); //둘다 디폴트 출력 (부모, 자식) (부모 디폴트 생성자실행 +자식 디폴트 생성자 실행)
		//각자 자신의 참조 객체 this.num실행
	}
}
