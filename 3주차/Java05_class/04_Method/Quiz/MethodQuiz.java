package Java06_class.method.quiz;

import java.util.Arrays;

public class MethodQuiz {
	public void Q1() {
		for(int i=0;i<100;i++) {
			System.out.println(i+1);
		}
	}
	public void Q2(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Hello");
		}
	}
	public void Q3(int n, String str) {
		for(int i=0;i<n;i++) {
			System.out.println(str);
		}
	}
	public void print(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void mul10(int []arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]*=10;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void mul10v2(int [] arr) {
		int []arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i]*10;
		}
		System.out.println("복사한 배열 : "+Arrays.toString(arr2));
	}
	//똑같은 함수 (반환데이터타입)
//	public int [] mul10v2(int [] arr) {
//		int [] res=new int[arr.length];
//		for(int i=0;i<arr.length;i++){
//			res[i]=arr[i]*10;
//	}
//		return res;
//	}
//	
}
