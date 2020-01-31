package Java02_operator;

public class BinaryEx_03 {
	public static void main(String[] args)
	{
		int num1 =10;
		int num2 =20;
		
		System.out.println("num1==num2 : "+ (num1==num2));	
		System.out.println("num1!=num2 : "+ (num1!=num2));	
		
		System.out.println("num1>num2 : "+ (num1>num2));	
		System.out.println("num1<num2 : "+ (num1<num2));	
		
		System.out.println("num1>=num2 : "+ (num1>=num2));
		System.out.println("num1<=num2 : "+ (num1<=num2));
		
		System.out.println("------------------");
		
		boolean res1, res2;
		res1= num1<num2;
		res2= num1==num2;
		System.out.println("res1의 값 : "+res1);
		System.out.println("res2의 값 : "+res2); 
	}
}

//<이항연산자-관계,비교>
//
//	<  lt(less than) 
//	>  gt(greater than)
//	<= le(less than equal)
//	>= ge(greater than equal)
//	== eq(equal)  =하나는 assign(대입)이다
//	!= ne(not equal)

//관계연산의 결과는 참/거짓이다
