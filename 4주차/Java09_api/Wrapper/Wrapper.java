package java09_api.wrapper;

public class WrapperEx {
	public static void main(String[] args) {
		
		// Wrapper : 포장지
		
		// 기본데이터타입 -> 객체화
		
		int i1 = 10;
		Integer iVal1 = new Integer( 100 );
		
		Byte bVal = new Byte( (byte) 1 );
		Short sVal;
		Long lVal;
		
		Float fVal;
		Double dVal;
		
		Character cVal;
		
		Boolean boolVal;
		
		System.out.println("---------------------------------");
		
		Integer iVal2 = new Integer( i1 ); // 박싱, Boxing
		Integer iVal3 = new Integer( "123" );
		
		System.out.println( iVal1 );
		System.out.println( iVal2 );
		System.out.println( iVal3 );
		
		System.out.println("---------------------------------");
		
		double d1 = 123.456; //기본 데이터타입 double
		
		Double dVal1 = new Double( d1 ); //박싱, Boxing
		Double dVal2 = new Double( "46.543" ); //박싱, Boxing
		
		System.out.println( d1 );
		System.out.println( dVal1 );
		System.out.println( dVal2 );
		
		System.out.println("---------------------------------");
		
		String str = "1234"; //문자열
		
		//문자열에서 int형 데이터를 추출(파싱)
		int num1 = Integer.parseInt( str ); //문자열 -> int (형변환)
		//** parse : 추출하다
		
		System.out.println(num1);
		
		System.out.println("---------------------------------");
		
		//NumberFormatException 발생
		//	적절한 유형(숫자형식)의 문자열만 파싱할 수 있음
//		int num2 = Integer.parseInt( "1234ABC" );

		int num3 = Integer.parseInt( "-1234" );
		System.out.println( num3 );
		
		double num4 = Double.parseDouble( "3.14" );
		System.out.println(num4);
		
		double num5 = Double.parseDouble( "12345" );
		System.out.println(num5);
		
		
		// parseBoolean() 은 "true"만 제대로 파싱하고 나머지는
		//전부 다 false로 반환한다
//		String data = "asfdasdf"; // false
//		String data = "1"; // false
		String data = "true"; // true
		boolean b = Boolean.parseBoolean( data );
		System.out.println( b );
		
		
		
		// Character.parseChar(String) 이런 메소드는 존재하지 않는다
		
		// 파싱은 아니지만 문자열에서 단일문자(char) 데이터를 분리할 때
		//charAt(index) 메소드를 사용한다
		String data2 = "Apple";
		char ch = data2.charAt(0);
		
		System.out.println("---------------------------------");
		
		System.out.println( Integer.MAX_VALUE ); //int형의 최대값
		System.out.println( Integer.MIN_VALUE ); //int형의 최소값
		
		System.out.println( Integer.BYTES ); //int형의 크기, 바이트 단위
		System.out.println( Integer.SIZE ); //int형의 크기, 비트 단위
		
		System.out.println( Double.BYTES ); //double형의 크기, 바이트 단위
		
		System.out.println("---------------------------------");

		// 언박싱, Unboxing
		// 객체형(참조형) -> 기본데이터타입
		int i2 = iVal2.intValue(); // Integer -> int 변환
		
		double d2 = dVal2.doubleValue(); // Double -> double 변환
		
		System.out.println("---------------------------------");

//		Integer iVal5 = new Integer( 20 );
		
		Integer iVal5 = 20; //오토 박싱
		
		int i5 = iVal5; //오토 언박싱
		
		double d3 = dVal2; //오토 언박싱
		
	}
}
















