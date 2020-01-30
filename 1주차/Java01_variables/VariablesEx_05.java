package Java01_variables;
//1.30(목)

public class VariablesEx_05 {
	public static void main(String [] args)
	{
		//literal상수
		System.out.println(777); //자료형을 가지는 int형 literal상수 777
		int num = 500+600; // int형  literal 상수 
		
		//이름있는 상수
		int max=100;
		max=200; //여기는 변화하는 변수/ 이것을 변하지 않는 값으로 상수화 시키려면 min으로 해보자
		final int MIN=100; //final을 적용하면 변수를 상수화 시킬 수 있다
//		MIN=200; //상수화된 값은 변경시킬 수 없다(에러발생)
		//안전하게 사용하기 위해서 이름있는 상수를 진행한다
		//잘 사용하지는 않지만 유지보수를 위한 좋은 코드
		
		//이름있는 상수를 이용한 예시
		//평균구하기 (학생수는 변하지 않으므로 상수화 시킨다)
		final int STUDENT_NUM=10;
		int sum=976;
		double avg =sum/STUDENT_NUM;
		System.out.println("총인원: "+STUDENT_NUM);
		System.out.println("평균: "+avg);		
	}
}
//<Tip>!!----------------------
//	+같은 변수이름을 한번에 바꾸기 위해서는 커서 오른쪽 -Refactor -Rename하면 전부 바뀐다
//	+이름있는 상수는 변수랑 구분하기 위해서 전부 대문자로 사용하는게 규칙!
//-------------------------------------------------------------------
//	<상수(Constant Number)>
//-변하지 않는 값
//-데이터 그 자체를 뜻한다
//-자료형을 가지고 있다
//+int형 상수	   -123
//+double형 상수      -123.4156
//+char형 상수	   -'A'
//+boolean형 상수   -true
//+long형 상수         -100L
//+float형 상수       -3.14f
//---------------------------------
//	<상수의 종류>
//1.literal 상수(리터럴)
//	+기본적인 상수 그 자체를 의미함
//
//2.이름있는 상수
//	+변수를 상수화 시킨 것
//	+final 키워드를 적용한다
