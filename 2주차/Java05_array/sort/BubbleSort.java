package Java05_array.sort;

import java.util.Arrays;
//<정렬,Sort>
//
//+삽입정렬(Selection Sort)
//
//+선택정렬(Insertion Sort)
//
//+버블정렬(Bubble Sort)
public class BubbleSort {
	public static void main(String[] args) {
		
		int [] arr= {3,2,5,4,1,7,8,9,10};
		
		//원본 출력		
		System.out.println("-----정렬전-----");
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//Bubble Sort
		System.out.println("-----정렬후-----");
		System.out.println();
		
		int temp; //임시 저장 변수
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(arr));
	}
}
