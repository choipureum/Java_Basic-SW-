package Java12_exception;

import sun.java2d.pipe.NullPipe;

public class Exception_06_throw {
	public static void main(String[] args) throws Exception {
		
		
			Exception e = new NullPointerException("최푸름"); //예외객체생성
		//	throw e; //예외발생 키워드(throw)
		try {
			throw new NullPointerException("최푸름"); //이렇게 한번에도 가능하다
		}catch(NullPointerException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
//< 예외를 발생시키기, throw 키워드 > 

//   - 개발자가 직접 예외를 발생시키기 위해 사용하는 키워드
   
//	+사용법
	 
//	 -throw 예외객체;
//	 -throw new 예외 클래스();
	 
//	ex) Exception e = new Exception(); //예외 객체 생성
//	    throw e; //예외발생
//
//	ex) throw new NullPointerException(); //생성하고 바로 발생시키기

