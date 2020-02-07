package Java05_array.array2D;

import java.util.Arrays;

public class Array2D_01 {
	public static void main(String[] args) {
		
		//2차원 배열
		// 다차원 배열
		
		int [] arr =new int [5]; //1차원 배열 선언과 생성
		int [][] arr2=new int[2][3]; //2행 3열 //2차원배열 생성
			//3묶음씩 2세트
		
		int []arr3 =new int[6]; 
			// 용량은 같지만 프로그램에서 다루는 데이터에 따라서 편리하게 사용가능
			// 단순히 숫자 6개와 3개 2묶음은 다르다
		
		arr2[1][2]=555;
		arr2[0][1]=444;
		System.out.println(Arrays.deepToString(arr2));
		
		//-------------배열의 선언-------------------------------
		
//		int [][]arr
//		int []arr[]
//		int arr[][]   //셋다 가능 하지만 1번 추천
		
		
		
	}
}
