package java09_api.tokenize;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		
		// String.split() 메소드
		
		String data1 = "Hi Hello Hola";
		
		// " " 구분자로 적용하여 data1 문자열을 토큰화한다
		//	-> 파싱된(추출된) 문자열의 토큰들은 String[] 타입으로 반환된다
		String[] tokens = data1.split(" ");
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		System.out.println("---------------");
		
		String data2 = "I%!am%!iron%!man";
		
		// 단일문자가 아닌 구분자도 사용할 수 있다
		String[] tokens2 = data2.split("%!");
		
		for (int i = 0; i < tokens2.length; i++) {
			System.out.println(tokens2[i]);
		}
		
		System.out.println("---------------");
		
		String data3 = "I%am!iron man";
		
		// "[%! ]" 의 의미는 "%" 거나 "!" 거나 " " 중 하나라도 만족하면 true 
		String[] token3 = data3.split("[%! ]");
		
		for (int i = 0; i < token3.length; i++) {
			System.out.println(token3[i]);
		}
		
		System.out.println();
		System.out.println("= = = = = = = = = = = = = = =");
		System.out.println();
		
		// StringTokenizer 클래스
		
		//생성자 StringTokenizer(문자열, 구분자)
		StringTokenizer st1 = new StringTokenizer(data1, " ");
	
		System.out.println("토큰 수 : " + st1.countTokens());
		
		while( st1.hasMoreTokens() ) { //토큰이 존재하는 만큼 반복
			System.out.println( st1.nextToken() );
		}
		
		// StringTokenizer의 주요 메소드
		
		//	public int countTokens()
		//		nextToken() 실행될 수 있는 횟수를 반환
		//		nextToken()을 호출하면 반환되는 값이 줄어든다
		
		//	public boolean hasMoreTokens()
		//		nextToken() 실행할 수 있는지 boolean값 반환
		//		다음 토큰이 있으면 true, 없으면 false 반환
		
		//	public String nextToken()
		//		다음 토큰을 반환
		
		System.out.println("---------------");

//		String data2 = "I%!am%!iron%!man";

		StringTokenizer st2 = new StringTokenizer(data2, "%!");
		
		System.out.println( st2.nextToken() );
		System.out.println( st2.nextToken() );
		System.out.println( st2.nextToken("%") ); //구분자를 "%"로 변경.적용
		System.out.println( st2.nextToken() );
		
		System.out.println("---------------");
//		String data3 = "I%am!iron man";
		
		StringTokenizer st3 = new StringTokenizer(data3, "[%! ]");
		
		while( st3.hasMoreTokens() ) {
			System.out.println( st3.nextToken() );
		}
		
	}
}
















