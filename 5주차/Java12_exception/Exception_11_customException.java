package Java12_exception;
import java.io.*;
import java.util.*;

public class Exception_11_customException {
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		User p = new User();
		try {
			p.setAge(sc.nextInt());
			System.out.println(p.getAge());
		}catch(Exception e) {
			System.out.println("나이가 말이 안되요");
		}
		
	}
}

class User{
	private int age; //나이

	//getter setter
	public int getAge() {
		return age;
	}
	//만약 나이가 -라거나 너무 많다면? --> 예외발생하게 해보자
	public void setAge(int age) throws Exception{
		if(age<0 || age>150) { //예외상황발생 UserAgeException
			throw new UserAgeException();
		}
		this.age = age;
	}
	
}
class UserAgeException extends Exception{
	
	//getMessage를 넣어주면 내가 원하는 메세지를 표시할수있다.
	@Override
	public String getMessage() {		
		return "나이가 말이안되요";
	}
	//--> CheckedException을 발생시키므로 try -catch잡아줘야함
	//Exception을 상속받아주기만 하고 바로 실행메소드에서 throw만 해주면 바로 사용가능하다
	
}

//< 사용자 정의 예외 만들기 >
//
//- API Exception 클래스들 이외에 추가적으로 예외 상황을 정의하는 클래스를 만든는 것
//- 개발자가 직접 예외 상황을 설정하고 클래스로 구현하는 것
//
//- Exception클래스(CheckedException), RuntimeException클래스(UnCheckedException)를 상속받아 구현한다
//
//	ex) class UserException extends Exception{
//		}
//
