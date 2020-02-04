package Java04_control.condition;
import java.util.*;

public class IfBasicQuiz_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//가장 큰 수 도출	
		//1번
		int [] arr=new int [3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[2]);
		
		//2번 문제
		//두수의 합이 짝수이고 3의배수인지 판별
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a+b)%2==0 && (a+b)%3==0) {
			System.out.println("두수의 합이고 3의배수입니다");
		}
		else {
			System.out.println("응 아니야");
		}
}
}
