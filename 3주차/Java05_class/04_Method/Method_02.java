package Java06_class.method;

//기능클래스2
public class Method_02 {
	
	//매개변수
	//반환데이터(return코드)
		
	//매개변수 X, return 데이터X
	public void method01() {
		System.out.println("Hello");		
	}
	public void method02(int parameter) { //매개변수, parameter
		System.out.println("전달된 값 :"+parameter);
	}
	//매개변수 - parameter
	// 전달인자, 전달인수, 인자, 인수-argument
		
	//2개의 전달인자를 받아 출력하는 기능
	public void printnum2(int num1, int num2) {
		System.out.println("num1 : "+num1+" / num2 : "+num2);
	}
	//-------------------------------------------------------
	
	//매개변수 X, 반환데이터 O
	public int returnNum() {
		return 777;
	}
	
	//매개변수 O, 반환데이터 O
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
