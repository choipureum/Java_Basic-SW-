package Java04_control.condition;
import java.util.*;

public class IfElse_02 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 String result="";
		 //홀짝 판별하기 문제
		 
		 if(num%2==1) {
			 result="홀수";
		 }
		 else if(num%2==0 && num!=0){
			 result="짝수";
		 }
		 else {
			 result="0이에요~";
		 }
		 System.out.println(result);
	}
}
