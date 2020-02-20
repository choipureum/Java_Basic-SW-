package Java09_api;
import java.util.*;

public class RandomQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int user;
		while(true){	
			in:
			while(true) {
				System.out.println("몇개의 연속된 숫자를 말하시겠습니까?++ ");				
				user=sc.nextInt();//1,2,3
				if(user>=4 || user<1) {
					System.out.println("++++Error!++++");
					continue in;
					}
				else {
					break;
				}
			}
				for(int i=1;i<=user;i++) {
					
						cnt++;
					System.out.println("유저 : "+cnt);					
				}
					System.out.println("-----");
				if(cnt>=31) {
					System.out.println("+++컴퓨터 승!+++");	
					break ;
				}
				int com=(int)((Math.random()*3)+1);
				for(int j=1;j<=com;j++) {
					cnt++;
					System.out.println("컴퓨터 : "+cnt);
				}
				System.out.println("-------");
				if(cnt>=31) {
					System.out.println("+++유저 승!+++");
					break;
				}
					
			}
		
	
	
	}
	}
