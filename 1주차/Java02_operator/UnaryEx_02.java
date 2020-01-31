package Java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) 
	{
		int num1=1;
		System.out.println(num1); //원본
		System.out.println(num1++); //연산중 ->후증가 //1 (후위. 후치)
		System.out.println(num1); //연산 후
		
		System.out.println("-------------");
		
		num1=1;
		System.out.println(num1);
		System.out.println(++num1); //먼저 증가  //2 (전위, 전치)
		System.out.println(num1);
		
		System.out.println("-------------");
		
		num1=1;
		System.out.println(num1++ *3); //1*3
		num1=1;
		System.out.println(++num1*3); //2*3
		num1=1;
		System.out.println(num1+++num1); //되긴하지만 하면 안된다(코드가독성문제)
		//^==최대한 증감연산자를 단독으로 쓰도록 하는 것이 좋다
		
		System.out.println("-------------");
		
		//변수의 값을 1증가시키기
		int n=13;
		n++; //가장 많이 사용 : 제일 빠르고 짧다
		n+=1; 
		n= n+1;		
	}
}

// <단항연산자-증감>
// ++ :증가 연산자
// -- :감소 연산자

//	피연자로 적용된 변수의 값을 1 증감시킨다
