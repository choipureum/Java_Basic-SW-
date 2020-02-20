package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int com=0; //컴퓨터의 수
		int user=0; //사용자의 수
		
		int num = 1;
		
		int max = 31;
		
		int winner = 0;
		
		while(num<=max) {
			com = ran.nextInt(3) + 1;
			
			for(int i=0; i<com && num<=max; i++) {
				System.out.println("com : " + num++);
				
				if(num>max)	winner=2;
			}
			
			while(num<=max) {
				System.out.println();
				System.out.print(">> 몇 개의 연속된 숫자를 말하시겠습니까? ");
				user = sc.nextInt();

				if(user<1 || user>3) {
					System.out.println();
					System.out.println(">> 1~3까지만 입력가능합니다. 다시!");
				} else	break;
			}
			
			for(int i=0; i<user && num<=max; i++) {
				System.out.println("user : " + num++);
				if(num>max)	winner=1;
			}
		}
		
		if(winner==1) {
			System.out.println("컴 승리");
		} else if(winner==2) {
			System.out.println("유저 승리");
		}
	}
}

