package Java04_control.condition;
import java.util.*;

public class if_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Number : ");
		int input = sc.nextInt();
		
		if(input!=10) {
			System.out.println("입력값이 10이 아닙니다");
		}
		else {
			System.out.println("입력값이 10입니다");
		}
		//-----------------------------------------
		if(input>1 && input<=100) {
			System.out.println("입력값은 1~100사이의 정수");
		}
	}
}
