package Java12_exception.Quiz;
import java.util.*;
import java.io.*;

public class ExceptionQuizEx {
	final static Scanner sc= new Scanner(System.in);
	final static CharacterProcess p = new CharacterProcess();
	final static NumberProcess r = new NumberProcess();
	
	public static void main(String[] args) {
		quiz1();
		quiz2();
	}
	public static void quiz1() {
		String input = sc.nextLine();
		
		try {		
			System.out.println(p.countAlpha(input));
		}catch(CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void quiz2() {
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try {
			System.out.println(r.checkDouble(n1, n2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
//
//<문제 1>
//0. 패키지 : java12_exception.quiz
//
//1. 사용자정의 예외클래스 : java12_exception.quiz.exception.CharCheckException
//
//2. 클래스 : java12_exception.quiz.CharacterProcess
//	[디폴트 생성자]
//
//	[메소드]	public int countAlpha(String s){}
//	//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//	//단, 공백문자가 있으면, CharCheckException 발생
//
//3. 실행용 클래스 : java12_exception.quiz.ExceptionQuizEx (main 포함)
//	main() 메소드에서 quiz1() 메소드를 호출하여 실행
//
//	실행할 메소드 작성 : public static void quiz1(){}
//
//	키보드로 문자열을 입력받아(Scanner 사용)
//	countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
//	- 반드시 try ~ catch 문 사용.
//	에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."
//<문제 2>
//0. 패키지 : java12_exception.quiz
//
//1. 사용자정의 예외 클래스 : java12_exception.quiz.exception.NumberRangeException
//
//2. 클래스 : java12_exception.quiz.NumberProcess
//	[디폴트 생성자]
//
//	[메소드]
//	public boolean checkDouble(int n1, int n2){}
//	// 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
//	배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
//	//단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
//	NumberRangeException 발생시킴
//	에러메시지 : "1부터 100사이의 값이 아닙니다."
//
//3. ExceptionQuizEx 실행클래스에 quiz2() 메소드 추가함
//
//	public static void quiz2(){}
//	//2 개의 정수를 입력받아, checkDouble 메소드로 전달하면서 실행함
//	리턴된 결과로 "ooo는 ooo의 배수이다/배수가 아니다." 출력함
