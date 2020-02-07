package Java05_array.copy;
import java.util.*;

public class ArrayCopy_02 {
	public static void main(String[] args) {

		//***********************************************
		//깊은 복사, Deep Copy
		//사본으로 복사하려면? 
		// -참조 대상의 내용물(실 데이터, 저장된 데이터)를 새로운 공간에 복사하는것
		int[] arr1= {10,20,30};
		
		
		// +1 복사될 공간 생성
		// +2 데이터 복사(for문 이용)
		int[] arr2 =new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
				
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
	}
}
