package Java02_operator;

public class BinaryEx_02 {
	public static void main(String[] args) 
	{	
		int num1=10; //10대입
		int num2=20; //20대입
		
		num1 =11; //변수의 값에 대입하기
		num2 =22; 
		//------------------------
		int num3 =num2; //오른쪽에 변수를 쓰면 변수에 저장된 값을 활용
		//------------------------------------------------
		int num4, num5, num6;
		num6 =num5= num4= num3; //오른쪽부터 계산한다
	    //-----------------------------------------------
		System.out.println("---산술대입 연산 전---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		num2 +=num1; //산술대입
		// --> num2 =num1+num2;
		
		System.out.println("---산술대입 연산 후---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);		
		//-------------------------------------
		num2 -=num1; //-=산술복합대입연산자(이항)
		num2 =-num1; //=대입연산자(이항), - 부호변환 연산자(다항)	
	}
}

	
//<이항연산자 - 대입(Assign)>
// '='
//	+오른쪽에 있는 값을 왼쪽에 있는 공간(변수)에 저장
//	+변수=값(변수,데이터,값 등)
//	+연산자 우선순위가 최하위에 있다(= 맨마지막에)
//	+연산방향이 오른쪽에서 왼쪽이다 
// -------------------------------------
//<복합대입연산자-산술대입>
//
//+= -= *= /= %=
//
//Tip!!----------------------
//ctrl+f =>찾기
