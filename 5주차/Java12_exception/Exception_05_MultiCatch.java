package Java12_exception;

public class Exception_05_MultiCatch {
	public static void main(String[] args) {
		//코드가 중복될때 
		try {
			
			//두개의 예외중 하나라도 발생하면 catch발생
		}catch(NullPointerException |ArithmeticException e) { //잘안씀
			System.out.println("예외발생");
		}
		
	}
}	
