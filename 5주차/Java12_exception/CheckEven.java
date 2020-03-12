package Java12_exception;
import java.io.*;


public class CheckEven {
	//짝수인지 홀수인지 판별
	public void check(int n)throws Exception {
		if(n%2==0) { //정상상황
			System.out.println("짝수가 맞습니다");
		}else { //예외상황
			throw new OddNumberException();
		}
	}
}
class OddNumberException extends RuntimeException {
	@Override
	public String getMessage() {		
		return "홀수는 안됩니다";
	}
}
 
