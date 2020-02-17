package Java07_inherit;

class Parent{
	String name;
	int num;
	
	public void display() {
		System.out.println("부모클래스의 메소드");
		System.out.println(name+num); //문자열이 포함되면 나머지도 문자열취급 (자바의 정석)
	}	
}

class Child extends Parent{ //상속주기
	int score;
	
	public void print() {
		System.out.println("자식클래스의 메소드");
		System.out.println(name+num);
	}
	public void display() {
		System.out.println("메소드 재정의 , 오버라이딩"); //상속에서 수정에 해당
	}
}



public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p=new Parent();
		
		p.name="최푸름";
		p.num=27;
		p.display();
		
		Child c = new Child();
		c.name = "최푸름2";
		c.num = 28;
		c.print();
		c.display();
	}
}
