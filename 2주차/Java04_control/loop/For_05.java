package Java04_control.loop;

import java.util.*;
import java.io.*;

public class For_05 {
	public static void main(String[] args) 
	{		
//		1부터 n까지 총합 구하기
//		
		Scanner sc=new Scanner(System.in);
		System.out.print("몇까지의 합을 구할까요 : ");
		int n=sc.nextInt();
	
		int sum=0; //총합 변수선언 및 초기화
		for(int i=1;i<n+1;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+" 까지의 합은 "+sum+"입니다"); //총합출력
	}
}
//		반복 횟수 : n
//		반복 구간 : 1~n
