package Java02_operator;
// 1.31(금)

public class BinaryEx_04 {
	public static void main(String[] args)
	{
		boolean b1=true;
		boolean b2=false;
		
		System.out.println("true && false : "+(b1&&b2));
		System.out.println("true || false : "+(b1||b2));
		System.out.println("!false : "+(!b2));
		
		System.out.println("--------------------");
		//ex)
		int num=88;
		System.out.println((num>=1)&&(num<=100)); //num의 값이 1과 100사이의 수인가
		System.out.println(!((num>=1)&&(num<=100)));
		
		System.out.println("----------------------------------");
		
//		System.out.println(1<=num<=100); //에러-->왼쪽부터 계산 -->true<=100이 되기때문에 에러가 발생한다(다른 데이터타입)
		//true<=100 (X)
	}
}

// <이항연산자-논리>
//
//	&&(And), ||(Or), !(Not)
//
//	&& : 둘다 참이어야 참
//	|| : 둘 중 하나라도 참이면 참
//	! : 반대로 참이면 거짓,거짓
