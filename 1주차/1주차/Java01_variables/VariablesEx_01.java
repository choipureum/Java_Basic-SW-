package Java01_variables;

public class VariablesEx_01 {
	//메인메소드 -프로그램의 시작점(Entry Point,EP)
	public static void main(String [] args) {
		
		int number; //자료형, 변수 선언,할당
		
		number=10; //변수공간에 데이터 저장
		char input=65; //아스키코드 이것이 진짜 정수인지 아닌지는 선언된 데이터타입으로 구분한다.
		
		System.out.println(input); //A
		System.out.println(number); //10
	}
} //End class

/* 자료형(데이터 타입)
:컴퓨터가 데이터를 표현하는 정해진 형식

--------------------------------------
<자바의 기본 데이터 타입 8가지>

-정수형(소수점 이하를 표현하지 않는 숫자)
	:메모리의 효율성을 위해 구분
	byte   1B필요  = -128~127
	short  2B필요  = -32,768~32,767
	-----------------------------------위에는 잘 안쓴다
	int	   4B필요  = -2^31~2^31-1 (약 -21억~21억)
	long   8B필요  = -2^63~2^63-1

-실수형(소수점 이하를 표현하는 숫자)
	float   4B필요(소수점밑 5개까지만표현) :floating point number의 약자(부동소수점)
	--------------------------------------------------------------------------------위에는 잘 안쓴다
	double  8B필요(실수형의 기본 데이터 타입)

-문자형(정수형과 같은 처리방식을 사용한다)
	char    2B필요 (유니코드를 사용한다) -아스키코드는 1B필요 
	String  

-논리형
	boolean 1B필요 
	
---------------------------------------------------------------------------------------------------------
<문자형 데이터 처리 방식>
	-모든 문자에 대한 숫자 코드를 부여하고 컴퓨터에 예약해 놓는다.
	-데이터타입에 따라서 해당 숫자가 정수인지 문자인지 판단할 수 있도록 한다.
	+아스키코드,ASCII Code
		American Standard Code for Information Interchange
		-영어 대문자,소문자, 숫자, 특수기호, 가상키(엔터, 스페이스등)들을 코드화시킨 표
	+유니코드, Unicode
		-아스키코드에 추가적으로 전세계 문자를 표현할 수 있도록 확장한 개념
		-각 표현법으로 변환(인코딩) -->UTF-8,EUC-KR,MS949(CP949)
	-<Tip>
      +계산기에 프로그래머용이 있다.
--------------------------------------------------------------------------------------------------------
<Tip>!!문장전체를 주석으로하는것은 관리가 어려움 ->한줄주석을 여러번 쓰는 것이 낫다
 -->단축키 :ctrl+shift+C
--------------------------------------------------------------------------------------------------------
<변수,Variables>
	-데이터(값)을 저장하는 메모리의 기억 공간
	-데이터를 저장하는 그릇, 공간
	-저장할 수 있는 데이터의 형식을 자료형을 이용해 설정한다.
	-한번에 한개의 데이터만 저장가능

<변수 선언, Declaration>
	-프로그램에서 사용하려는 변수를 생성하는(할당받는)코드
	-ex) int num [자료형+변수명]조합
<변수 대입, Assign>
	-생성된 변수 공간에 데이터를 저장하는 것
	-ex) [변수명] = [데이터] num=10;
*/