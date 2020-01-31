package Java02_operator;

public class TernaryEx {
	public static void main(String[] args) 
	{
		int num1=11;
		int num2=22;
		System.out.println(num1>num2?"num1이 크다":"num1이 크지않다");
		String result =num1<num2? "num1이 크다":"num1이 크지않다"; //초기값으로도 바로 설정가능
		int temp = num1<num2?num1:num2; //두 수중에 작은 수를 저장한다	
	}
}

// <삼항 연산자 -조건>
// ->삼항조건연산자
// ->조건을 부여한다
//  ? 
// 

//***조건식 : 연산의 결과를 true/false 로 판별할 수 있는 연산식(기호: ? :)
//	 [조건식 ? 참일때 반환값 : 거짓일때 반환값]
