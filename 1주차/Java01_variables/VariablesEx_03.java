package Java01_variables;

public class VariablesEx_03 {
	public static void main(String [] args) 
	{		
		//변수의 선언과 동시에 초기화(Initialize)
		int num=123;  //int num; num=123;의 압축
		
		int age;
		System.out.println(age); //Initialize해야한다는 에러발생 -->쓰레기값을 출력하려고 해서 에러 발생
		//해결 : age변수를 대입 (초기화하기)해주고 사용해야 한다
		
		age=11; //해결
		System.out.println(age); //11
		
		/* 
		 
		 <변수 선언과 동시에 초기화>
		 	-변수를 선언하면서 대입을 한번에 처리
		 	-쓰레기값이 변수에 저장되는 것을 막고 곧바로 특정 값으로 초기화한다
		 	ex)int num=555;
		 	
		 */
	
	
	
	
	
	}
}
