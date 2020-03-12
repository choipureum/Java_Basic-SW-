package Java12_exception.Quiz;
import java.io.*;

public class NumberRangeException extends Exception{
	@Override
	public String getMessage() {	
		return "1부터 100사이의 값이 아닙니다.";
	}
}
