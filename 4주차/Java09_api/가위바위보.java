package Java09_api;

import java.util.*;

public class RandomQuiz {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1.가위  2. 바위  3. 보
		out:
		while(true) {
			System.out.println("++++++가위바위보 게임++++++");
			System.out.print("가위바위보를 입력하세요 : \n");
			System.out.println("\t1.가위");
			System.out.println("\t2.바위");
			System.out.println("\t3.보");
			System.out.print("[입력] : ");
			int user =sc.nextInt();
			if(user!=1&&user!=2&&user!=3) {
				System.out.println("++ERROR : 다시  입력하세요++");
			}
			int com=(int)((Math.random()*3)+1);//1~3	
			System.out.println();
			if(user==1) {System.out.print("[유저] : 가위   VS");}
			if(user==2) {System.out.print("[유저] : 바위   VS");}
			if(user==3) {System.out.print("[유저] : 보   VS");}			
			if(com==1) {System.out.print("  가위 : [컴퓨터]");}
			if(com==2) {System.out.print("  바위 : [컴퓨터]");}
			if(com==3) {System.out.print("  보 : [컴퓨터]");}
			System.out.println();
			System.out.println();
			
			
			if(user==com) {
				System.out.println("[결과] : =====무승부입니다=====");
			}
			else {
				if((com-user)==1||user-com==2) {
					System.out.println("[결과] : =====컴퓨터 승======");
				}
				if((user-com)==1||com-user==2) {
					System.out.println("[결과] : =====유저 승======");					
				}
			}
			while(true) {
				System.out.println();
				System.out.println("한판더 하시겠습니까?(y/n)");
				char temp=sc.next().charAt(0);
				if(temp=='y') {continue out;}
				else if(temp=='n') {
					System.out.println("+++++++종료+++++++");
					break out;
				}
				else {
					System.out.println("+++++++에러++++++++");
					continue;
				}
			}
	}		
}
}
