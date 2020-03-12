package Java12_exception;

public class Exception_01_Basic {
	public static void main(String[] args) throws Exception {
		
		int [] arr = new int[5];
		int i=0;
		
		//예외처리
		try {
		while(true) {				
			arr[i]=i+1;
			System.out.println(arr[i]);
			System.out.println(i+"번째 완료");
			i++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열의 크기를 벗어났습니다");
		}finally {			
		}
	}
}
//< 프로그램 개발 오류, 에러(Error) > 
//
//1. 컴파일 타임 에러 : Compile-time-Error
//
//	컴파일 시점에 발생하는 에러
//	이클립스에서는 소스코드를 저장하는 즉시
//	
//	-주로 문법 에러(Syntax Error)
//
//2. 런타임 에러 : Runtime Error
//
//	프로그램 실행 도중 발생하는 에러
//	수행할 수 없는 작업을 시도할 때 발생 (문법적 오류는 없음)
//	
//	Exception로 주로 처리된다(예외)
//
//
//< 예외 종류 >
//	
//	NullPointerException : null값을 참조해서 코드를 수행하려고 할 때
//	
//	ArrayIndexOutOfBoundsException : 배열의 인덱스를 잘못 사용했을 때
//
//	ArithmeticException : 불가능한 산술 연산을 수행했을 때
//
//+논리 에러 : Logical Error
//	
//	프로그램이 에러없이 잘 동작함
//	하지만 프로그램의 동작이 개발자가 원하는대로 수행되지 않을 때
//
//	ex) 무한루프
//
//< 예외,에러 클래스 > 
//	
//	+Throwable 클래스
//
//		- 에러와 예외 클래스의 부모클래스
//
//	+Error클래스(에러)
//
//		- 심각한 수준의 오류
//		- 복구 불가능한 문제
//		- 프로그램이 무조건 중단됨
//
//		- 시스템에 변화를 주어서 문제를 해결해야함
//		- 프로그램 자체가 해결할 수준이 아닌 문제들
//		- ex) OutOfMemoryError  
//
//	+Exception 클래스(예외)
//
//		- 프로그램의 예외적인 상황
//		- 개발자가 어느정도 예측할 수 있었던 상황
//		- 논리적으로 예상 가능했던 상황
//		- 미리 예외 상황을 처리해야 함 (예외처리) : Exception Handling
//		
//		- try{}catch(예외종류 e){} 문을 이용해 처리한다
//
//
//< Throwable 클래스 계층구조 > 
//
	//Object
	//|
	//|
	//Throwable
	//|------------------|
	//|                  |
	//Error             Exception
	//(Critical)          |
	//                    |---------------------|
	//                    |                     |(UnCheckedException)
	//		                여러 Exception	     RuntimeException
	//		      (CheckedException)            |
	//				   	  |
	//				여러 Exception
//	
//
//+ Error
//: 복구 불가능한 심각한 에러
//
//+ Checked Exception : 
//	
//	- Exception의 하위클래스들 중 RuntimeException의 하위클래스를 제외한 것	
//	- 반드시 예외처리구문(try-catch) 사용해서 예외처리를 해야만 하는 클래스
//	- 예외처리하지 않으면 컴파일 에러가 발생
//	- 코드 작성단계에서 미리 체크해서 예외처리 구문을 작성해야한다
//		ex) IOException, SQLException,...
//
//+ UnChecked Exception : 
//
//	- RuntimeException의 하위클래스
//	- 반드시 처리하지 않아도 되는 예외
//	- 프로그램 실행 도중 예외가 발생하면 그 결과를 보고 예외가 발생하지 않도록 코드를 작성하거나
//		예외처리구문을 작성하여 처리한다
//		ex) NullPointerException, IndexOutOfBoundsException,....
//
//< 예외발생 시 체크사항 >
//		
//	- 예외 클래스 이름(정보, 계층구조)
//		ex)java.lang.ArrayIndexOutOfBoundsException
//	- 발생 지점
//		-몇번째 줄인지
//	- 에러 메세지
//		-e.getMessage()
//
// 	< 예외 처리 구문 >
//		try~catch구문
//			try{
//					//예외가 발생할 수 있는 구문
//				코드1 
//				코드2 : 예외발생
//				코드3 (생략)? ->실행해야 된다면? finally
//			}catch(예외종류 변수명){
//				//예외처리
//				코드2 처리
//			}finally{
//				//생략가능
//				//예외발생과 상관없이 반드시 실행해야하는 코드 
//					//코드 3
//				}







