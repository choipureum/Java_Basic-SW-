package Java12_exception.Quiz;
import java.io.*;

public class CharCheckException extends Exception {
	@Override
	public String getMessage() {
		
		return "체크할 문자열 안에 공백 포함할 수 없습니다.";
	}
}
