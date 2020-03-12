package Java12_exception;
import java.util.*;

public class Exception_04_try {
	public static void main(String[] args) {
		
		try {
			//try 블록
			//예외발생 코드
		}catch(ArithmeticException e) {
			//ArithmeticException 예외처리 코드
		}catch(NullPointerException e) {
			//NullPointerException 예외처리 코드
		}catch(Exception e) {
			//위 catch구문들 이외의 예외 상황을 처리함
		}finally {
			// 생략 가능한 블록
			// 예외가 발생해도 발생하지 않아도 수행하는 코드
			// 주로 Checked Exception 에서 사용하는 경우가 많다
			// 자원해제할 때 사용하는 블록
		}
	}
}
