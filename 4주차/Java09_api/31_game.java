import java.util.*;

public class RandomQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int user;	
		System.out.println("======베스킨라빈스 써리~원 게임======");
		System.out.println();
		while(true){	
			in:
			while(true) {			
				System.out.println("+++몇개의 연속된 숫자를 말하시겠습니까?+++");		
				System.out.print("[1~3의 숫자중 하나 선택 가능("+(cnt+1)+"부터시작) ] : ");
				user=sc.nextInt();//1,2,3
				if(user>=4 || user<1) {
					System.out.println("++++Error!++++");
					continue in;
					}
				else {
					break;
					}
		      	}//입력값 while 완료
				System.out.println("++++++++++++");
				for(int i=1;i<=user;i++) {					
						cnt++;
					System.out.println("유저 : "+cnt);					
				}
					System.out.println("++++++++++++");
				if(cnt>=31) {
					System.out.println("+++컴퓨터 승!+++");						
					break ;
				}
				int com=(int)((Math.random()*3)+1);
				for(int j=1;j<=com;j++) {
					cnt++;					
					System.out.println("컴퓨터 : "+cnt);
					if(cnt==30) {
						break;
					}
				}
				System.out.println("++++++++++++");
				if(cnt>=31) {
					System.out.println("+++유저 승!+++");
					break;
				}
					
			}
	}
	}
