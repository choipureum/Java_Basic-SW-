package Java05_array;

public class Array_03 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		//배열의 요소의 개수 5개
		//배열의 길이, 크기 5개
		
		System.out.println("배열의 길이 : "+arr.length);
		System.out.println("-----------------------");
		
		//배열의 길이(arr.length)를 이용한 배열 전체 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		arr[-4]=99;
		arr[5]=00; //둘다 에러발생
//
		int [] arr2 =new int[-5];  //에러 발생
	}
}	
