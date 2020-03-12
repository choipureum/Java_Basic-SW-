package Java12_exception;

import java.io.IOException;

public class Exception_10_throws {
	public static void main(String[] args) {
		ThrowsEx t= new ThrowsEx();
		
		//char ch; 이렇게 선언해도 밑에서 try바깥에서 사용할 수 없다 ->기본값으로 초기화해줘야 사용해줄수있다.
		//char ch='\0'; //char기본값
		try {	
			char ch= t.readChar(); //ch는 지역변수로 적용된다 //바깥에서는 사용불가
			System.out.print("Input Character: ");
			System.out.println("Output Character: "+t.readChar());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
class ThrowsEx{
	public char readChar() throws IOException {
		return (char)System.in.read();
	}
}
//
//< 데이터 타입에 따른 0(영) 처리 >
//-기본값 처리
//
//	숫자 0 - 숫자로써 수치상 0
//		int num=0;
//		double d=0.0;
//
//	문자 0 - '\0', null문자
//		char ch1 = 0;
//		char ch2 = '\0'; 
//		\0 은 문자열의 끝을 나타낸다

//	참조값 0 - null포인터(null)
//			String str=null;
// 			참조 대상이 없음을 나타낸다;
