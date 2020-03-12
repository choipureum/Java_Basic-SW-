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
