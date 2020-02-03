package Java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //stream (입력통로)//Standard Input
//		System.out.println(sc.next());//Standard Output
//		System.out.println(sc.nextLine()); //섞어쓰면 문제가 발생한다 (두개가 입력이 안된다)
		//문제가 발생하는 이유
		// -버퍼에 데이터를 저장한뒤 모두 끝나면 한번에 처리(입력버퍼와 출력버퍼)(버퍼: 임시저장소)
		
		System.out.println("----입력-----");
		System.out.print("Input Number : ");
		int num= sc.nextInt();
		
		System.out.print("Input String : ");
		sc.nextLine(); //버퍼를 비워준다, 버퍼의 '\n'지우기
		String str=sc.nextLine();
		
		System.out.println();
		System.out.println("-----출력-----");
		System.out.println(num);
		System.out.println(str);
		
		//숫자만 입력받고 문자입력은 건너뛰게 되는데 앞서 말한 버퍼문제 이다
		//nextLine()은 개행문자가 나올때까지 입력받는다 --> 앞에서 num과  개행문자 중 개행문자는 버퍼에 남아있기 때문에
		//str은 아무것도 입력받을 필요가 없게된다
		//문자열 먼저 입력받고 숫자를 다음에 받으면 문제가 없다
		//해결방법 : nextLine();을 한번 더 해주면 해결가능 (앞 nextLine()이 버퍼의 개행문자를 가져가 주기때문에)
		
	}
}
