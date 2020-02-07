package Java05_array.copy;
import java.util.*;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		 
		// +1 복사될 공간 생성
		// +2 데이터 복사(for문 이용)
		//깊은복사에서 2번 (데이터복사)를 API를 통해서 표현해보자		
		int[] arr1= {10,20,30};
		int[] arr2 =new int[arr1.length];
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		src: source 출발지 , 원본
//		srcPos: Source Postion(소스 포지션) 원본배열에서 복사 시작할 인덱스
//		dest: Destination 목적지
//		destPos: Destination Position 사본 배열에서 복사 시작할 인덱스
//		length: 복사하는 데이터의 길이
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}
}
