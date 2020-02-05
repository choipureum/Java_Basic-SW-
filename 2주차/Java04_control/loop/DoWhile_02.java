package Java04_control.loop;

import java.util.Scanner;

public class DoWhile_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input; //사용자 입력값
		int sum=0; //총합계
		
		do {
			System.out.print("Input Number(종료 ==0) : ");
			input=sc.nextInt();
			sum+=input;
		} while(input!=0);
		
		System.out.println("총합 : "+sum);
		sum=0;
		System.out.println("--------------------------");
		
		while(true) {//무한 루프
			System.out.print("Input Number(종료 ==0) : ");
			input=sc.nextInt();
			sum+=input;
			if(input==0) {
				break;
			}
		}
		System.out.println("총합 : "+sum);
	}
}
