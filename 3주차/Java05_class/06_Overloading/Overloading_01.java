package Java06_class.overloading;

public class Overloading_01 {
	
	private int x;
	private int y;
	
	public void display() { //매개변수가 없는  display()
		System.out.println("("+x+","+y+")"); //(0,0)		
	}
	
	//int형 2개를 전달인자로 받아 멤버 x,y를 초기화 및 출력
    
	public void display(int x,int y) {
		this.x =x;
		this.y =y;
//		System.out.println("("+x+","+y+")"); 
		//위의 코드는 매개변수 없는 display()와 중복되는 코드이다. 이럴때는 내가 정의한 display()를 호출한다
		display();
	}
	//---------------------------------------
	//데이터 타입이 다른경우도 성립한다
	public void display(double d) {};
	public void display(String str) {};
	//개수가 다른 경우
	public void display(int i) {};
	
	//반환값이 다른경우 (반환값과 상관없이 매개변수가 int 1개로 같으므로 에러발생
//	public int display(int i) {
//		return i;
//	}
}
