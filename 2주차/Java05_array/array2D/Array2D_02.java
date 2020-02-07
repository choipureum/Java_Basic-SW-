package Java05_array.array2D;
import java.util.*;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		int [] arr1D = {1,2,3,4,5};
		
		//2차원 배열의 선언과 동시에 초기화
		int [][]arr2D = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
						}; //arr[3][3]
		//3행 3열(3X3) 크기의 2차원 배열이 생성됨
		
		//2차원 배열의 값 출력하기
		//(3x3)
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2D[i][j]+" "); //i행 j열
			}
			System.out.println();
		}
		
		//2차원 배열에 값 대입하기
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2D[i][j]=(i+1)*10+(j+1);
			}
		}
		System.out.println(Arrays.deepToString(arr2D));
		
	}
}
