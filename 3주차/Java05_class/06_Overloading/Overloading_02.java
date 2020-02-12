package Java06_class.overloading;

public class Overloading_02 {
	
	//int형 전달인자의 문자수(길이)를 구해서 반환
	//ex) 11122 ->5개 

	
	//int형태 getLength
	public int getLength(int n) {
		String temp =String.valueOf(n); //정수형을 문자열로 변환하는 API
		//valueOf()함수는 매개변수가 다양하게 들어갈 수 있다 -->Overloading의 사례
		return temp.length();		
	}
	//boolean형태 getLength 오버로딩
	public int getLength(boolean n) {
		String temp =String.valueOf(n);
		return temp.length();	
	}
	// double 형태 getLength 오버로딩	
	public int getLength(double n) {
		String temp =String.valueOf(n);
		temp=temp.replace(".", "");
		return temp.length();	
	}
	
}
