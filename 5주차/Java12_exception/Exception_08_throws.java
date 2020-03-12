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
//< 예외 떠넘기기, 예외처리 미루기, throws >

//  - 사용법
//	: throws 예외클래스명;
  //- 대부분 CheckedException이다(반드시 처리해줘야하는 Exception)

//	[접근제한자][식별자][리턴타입]메소드명(매개변수)throws 예외클래스{
//		//예외발생 코드 포함 작성
//		}
//
  //- throws가 적용된 메소드를 호출할 때 try-catch 구문을 이용한 예외처리가 필요하다
//  - 예외처리를 하지 않으면 대부분 에러가 발생한다
