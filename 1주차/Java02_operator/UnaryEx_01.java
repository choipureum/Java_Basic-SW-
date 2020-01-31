package Java02_operator;
// 1.31(금)
public class UnaryEx_01 {
	public static void main(String[] args) 
	{
		int num1=+7; //+7가능-원래가 +이기 때문에 생략
		int num2=-7; //-7 음수 표현
		System.out.println(-num2); //-(-7) => +7
	}
}

// <단항 연산자 -부호>
// + - : 산술 연산자
// ! : 논리 부정 연산자
// (type) : 형변환 연산자
// . : 참조 연산자 ex)System.out.println(); 중간에 있는  .이 해당
//  -->Java-2_operator.UnaryEx_01.main 메소드로 표현가능
