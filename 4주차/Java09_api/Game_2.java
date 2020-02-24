import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int sw=0;
		System.out.println("+++\t\t\t+++");
		System.out.println("++++++++++묵찌빠 게임++++++++++");
		System.out.println("+++\t\t\t+++");
		while(true) {
			System.out.println("+++가위,바위,보 중 하나를 입력하세요+++");
			System.out.println("+ 가위 : 1");
			System.out.println("+ 바위 : 2");
			System.out.println("+ 보 :  3");
			System.out.print("입력 : ");
			int input=sc.nextInt();
			if(!(input>=1 &&input<=3)) {
				System.out.println("[ERROR] :  잘못된 입력값입니다. 다시입력하세요");
				continue;
			}
			int com =(int)((Math.random()*3)+1);
			String com_su="";
			String user_su="";
			if(input==1) {user_su="가위";}
			if(input==2) {user_su="바위";}
			if(input==3) {user_su="보";}
			if(com==1) {com_su="가위";}
			if(com==2) {com_su="바위";}
			if(com==3) {com_su="보";}
			System.out.println("==========");
			System.out.println("유저는 "+user_su+" 입니다");
			System.out.println("컴퓨터는 "+com_su+" 입니다");
			if(sw==0 &&input==com) {
				System.out.println("[비겼습니다]. 다시 시작합니다");
				continue;
			}
			if(sw==1 &&input==com) {System.out.println("*[유저]* 승!"); break;}
			if(sw==2 &&input==com) {System.out.println("*[컴퓨터]* 승!"); break;}
			if(com-input==2 || input-com==1) {
				System.out.println("***[유저] 공격차례!***");
				sw=1;
				continue;
			}
			else {
				System.out.println("***[컴퓨터] 공격차례!***");
				sw=2;
				continue;
			}
		}
		
	}
}
