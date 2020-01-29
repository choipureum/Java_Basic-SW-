package Java01_variables;

public class VariablesEx_02 {
	public static void main(String [] args) {
		
		int num=333;
		System.out.println("num변수의 값: "+num);
//----------------------------------------------------------------		
		double Height_Average=200.5; //반평균키
		//변수명 짓는 사이트 (curioustore)
		char alpha =97; //아스키코드로 넣기(잘 안함) //a
		char beta ='b'; //글자하나 넣기 ''로 글자하나를 표현한다
		char hangeul ='가'; //두글자는 안된다
		char N='3'; //3이라는 문자로 취급
//----------------------------------------------------------------		
		boolean isEmpty =true; //물어보는형태의 변수로 많이 설정하는 편
		isEmpty =false;
		System.out.println("논리형 변수의 값: "+isEmpty);
		
//----------------------------------------------------------------
		//변수들의 덧셈활용
		int sum=0;
		sum=num+100;
		System.out.println(sum);
		
	}
}
