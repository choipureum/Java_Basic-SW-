package Java12_exception;

public class Exception_03_try {
	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 0;
		try {
		System.out.println(n1/n2); //ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //예외정보확인
		}
		System.out.println("+++프로그램 종료+++");
		
	}
}
