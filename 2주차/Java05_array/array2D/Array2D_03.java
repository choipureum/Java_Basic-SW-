package Java05_array.array2D;

import java.util.*;

public class Array2D_03 {
	public static void main(String[] args) {
		int [][] arr=new int[3][];
//		System.out.println(arr[0][0]); //NullPointerException : 발생 : Null값을 참조하였다
		
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];
		//행마다 열의 길이가 일치하지 않는 2차원 배열
		//열을 직접 배열로 지정할 수도 있다.
		
		System.out.println(arr.length); //arr의 길이는 3 ->행을 기준으로
		System.out.println(arr[1].length); //arr[1]가 가지는 참조 -4
		System.out.println(arr[2].length); //arr[2]가 가지는 참조-5
		
		System.out.println("-----------------");
		
		//행마다 열의 길이가 일정하지 않은 2차원 배열의 출력
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
//			0 0 0 
//			0 0 0 0 
//			0 0 0 0 0 
		}
	}
}
