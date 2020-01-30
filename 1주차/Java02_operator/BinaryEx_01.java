package Java02_operator;

public class BinaryEx_01 {
	public static void main(String[] args) 		
	{
		int n1, n2, n3, n4; //','콤마로 연결가능 but 새로운 데이터형은 새롭게 써줘야한다 
		int num1=17, num2 =4;  //피연산자 2개
		int result=num1+num2; //연산결과 저장
//		result =17+4; 결과값 연산
//		result =21; 결과값 반환, 변수에 21이 저장
		System.out.println("연산결과 : "+result); //syso을 타이핑 후 ctrl+space하면 자동 완성가능
		
		System.out.println("-----나머지연산자-----");
		result=num1%num2; //% 나머지 연산자
		System.out.println("나머지 연산 결과 : "+result);
		
		System.out.println("-----산술연산자-----");
		System.out.println("num1+num2 = "+num1+num2); //174가 나온다 ->산술연산자+와 문장을 잇는  +의 구분을 안했기 때문에
		System.out.println("num1+num2 = "+(num1+num2)); //21 우선순위를 정한다면 원하는 값을 도출가능
		System.out.println("num1-num2 = " + (num1-num2));
		System.out.println("num1-num2 = " + (num1*num2));
		System.out.println("num1-num2 = " + (num1/num2)); //몫
		System.out.println("num1-num2 = " + (num1%num2)); //나머지
		//산술 연산의 결과는 피연산자의 데이터타입과 같다
		//연산은 반드시 피연산자들이 같은 데이터타입일때만 가능하다
		
		System.out.println("----------");
		System.out.println(num1/num2); //4 //int/int= int
		System.out.println((double)num1/(double)num2);//4.25 //double/double= double
		System.out.println(num1/(double)num2); //강제 형변환
		System.out.println(17/4.0); //
		System.out.println(17.0/4.0); //17의 자동형변환
				
		//서로 다른 데이터타입의 연산을 수행하려면 형변환해야한다
	}
}
//<연산자,Operator>
//-연산,Operate : 프로그램이 데이터를 가공하는 것 (컴퓨터의 모든 동작을 연산이라고 표현할 수 있다)
//-연산을 기호로 나타낸 것을 '연산자'라고 함
//
//
//<피연산자,Operand>
//-연산의 대상(값,상수, 변수 등)
//ex) 1+2 -->1과 2는 피연산자 , +는 연산자
//
//
//<연산자를 구분하는 기준>
//1) 피연산자의 개수에 따른 분류
//
//	+단항연산자,Unary Operator
//	+이항연산자,Binary Operator
//	+삼항연산자,Ternary Operator
//
//2) 기능에 따른 분류
//
//	+산술 연산자
//	+관계 연산자
//	+논리 연산자
//	+대입 연산자
//	+비트 연산자
//	+기타등등
//---------------------------------------------------------
//Tip !!
// 만약 main만 쳤을경우 shift+space를 누르면 관련 메소드나 명령어가 나온다
//--------------------------------------------------------
//<데이터 형변환, Data Type Casting>
//-Casting
//-Type Casting
//	+연산은 반드시 피연산자들이 같은 데이터타입일때만 가능하다
//	+서로 다른 데이터 타입의 연산을 수행하려면 형변환해야한다
//------------------------------------------------------
//<자동 형변환(묵시적, 암묵적, 암시적)>
//+표현범위가 작은 데이터를 큰 데이터타입으로 사용할 때
//ex)2.5*3 ->자동으로 해줌
//
//<강제 형변환(명시적)>
//+표현범위가 큰 데이터를 작은 데이터타입으로 사용할 때
//
//<자바 자료형의 표현범위 비교>
//
//+byte< short< int< float< double
//+char< int
//**boolean은 특수목적: 형변환 불가
//------------------------------------------------------------------------
//Tip!! 단축키-------------------------------------------------------------

//	ctrl+ alt +방향키 위아래 : 그 줄을 방향대로 복사 (따로 그래픽설정을 해줘야한다)
//	ctrl+d : 커서가 위치한 줄 삭제 
//	alt+방향키 : 해당 줄을 위아래로 이동가능
//	ctrl+ space : 자동완성 추천 단축키
//		ex)main 타이핑 + ctrl+space
//		ex2)syso 타이핑+ ctrl+space
//------------------------------------------------------------------	
