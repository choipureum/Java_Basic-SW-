package Java03_scanner;

import java.util.*;

//	이름,나이,성별,국어,영어,수학데이터를 입력받고
//	총점과 평균을 반환하는 프로그램을 만들어라

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name =sc.next();
		int age = sc.nextInt();
		sc.nextLine(); //버퍼비우기
		String gender = sc.nextLine(); //이것만 하면 에러가 발생 (버퍼문제)
		int Kor = sc.nextInt();
		int Eng=sc.nextInt();
		int Math=sc.nextInt();
		
		int total=Kor+Eng+Math;
		double avg=total/3.0;
		
		System.out.println();
		System.out.println("====출력====");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+age+"\t"+gender+"\t"+Kor+"\t"+Eng+"\t"+Math+"\t"+total+"\t"+avg);
	}
}
