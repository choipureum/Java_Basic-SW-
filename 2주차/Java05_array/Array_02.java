package Java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		int num=100; //변수 선언과 동시에 초기화
		
		int [] arr = {10,20,30,40,50}; //배열의 선언과 동시에 초기화
//		
//		아래와 같은 코드
//		int [] arr=new int [5];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		
//		배열의 모든 요소 출력하기
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		double[] dArr =new double[10];
		double[] dArr2 = {1.1,2.2,3.3};
		
		boolean [] flag = {true,true};
		
	}
}
