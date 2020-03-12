package Java12_exception;

import java.io.*;

public class Exception_08_throws {
	public static void main(String[] args) { //main메소드에서는 절대 Exception을 발생시키면 안된다
		
		ThrowTest2 t = new ThrowTest2();
		
		
			try {
				t.method();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
		
	}

}
class ThrowTest2{	
	public void method() throws IOException { //예외를 여기서 try-catch로 처리안하고 다른 메소드로 떠넘긴다
		throw new IOException();
	}
}
