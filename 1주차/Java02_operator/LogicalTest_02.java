package Java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) 
	{
		//논리연산자의 단축(Shortcut for Logical Operator)
		int a=5, b=6, c=10;

		boolean res1;
		res1 = a<b || --a>c++; 
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println(res1);
//		예상한 반환값
//		true || flase =>true
//		a=4, b=6, c=11
		
//      실제답
//		a=5,b=6,c=10	/true	
		
//		이유
//		||, &&로 연결되어 있는경우 앞쪽만 계산되었을 때 답이 나온다면 뒷부분은 연산하지 않기때문에
//		앞 부분이 true니까 ||로 연결된 뒤의 값과 관계없이 답은 true -->뒤는 계산 (x)
		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println(res1);
//		예상한 반환값		
//		true && true =>true
//		a=5, b=7, c=10
		
//      실제답
//		a=5,b=7,c=10	/true	
		
//		이유
//		앞이 false로 답이 나왔기때문에 뒷부분은 연산수행(x)
	}
}
