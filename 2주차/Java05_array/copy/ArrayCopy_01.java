package Java05_array.copy;
import java.util.*;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//기본데이터 타입 복사
		int num1=100;
		int num2;
		num2=num1;
		
		//------------------------
		
		//배열 복사하기(참조형에 대한 복사)
		//arr2에 arr1을 복사해보자
		int[] arr1= {10,20,30};
		int[] arr2;
		//얕은 복사, Shallow Copy**************************
		// -참조 대상의 참조값(주소)만 복사되는 현상
		// -참조하고 있는 메모리 주소만 복사가 된다
		// -생성된 데이터 저장공간은 복사되지 않는다
		
		arr2=arr1; //참조형 변수를 단순 대입했을경우
		System.out.println(Arrays.toString(arr2));
		
		arr1[1]=777;
		arr2[2]=999; 
		//arr1을 바꾸면 arr2도 바뀌고 arr2가 바뀌면 arr1도 바뀐다!!!!
		//참조형이기 때문에 주소값을 따라간다 
		//새로운 공간을 만드는게 아니라 같은 배열을 가져다 사용(사본X)
		//***********************************************
		System.out.println("------------------데이터 수정후");
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
