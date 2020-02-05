package Practice;

import java.util.Scanner;

public class While_04 {
	public static void main(String[] args) {
		//continue, break;
		//기타 제어문
		int i=0;
		while(i<100) {
			i++; //증감식
			if(i%2==0) {
				//짝수일때만 참
				continue;
				//현재 진행하고 있는걸 멈추고 다음으로 넘어감
				//while(조건식)으로 도달한다
			}
			if(i>10) {
				break;// 반복문 탈출 코드(if문 제외)
			}
			System.out.println(i); //반복코드
		}
		
		System.out.println("-------------------");
		
		for(int j=0;j<100;j++) {
			if(j%2==0) {
				continue;
				//조건으로 가는게 아니라 증감코드로 간다 -->j++
			}
			if(j>10) {
				break; //탈출
			}
			System.out.println(j);
		}
	}
}
