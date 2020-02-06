package Java05_array;
import java.util.*;

//배열이 선언된 뒤 문제를 푸시오
// <1번>
//- 위의 숫자를 invert_arr라는 배열에 거꾸로 입력하시오
//=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }

//<2번>
//- 위의 숫자의
//(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//구하시오
//	=> -5
//
//<3번>
//- 위의 숫자를 높은 숫자가 1등이 되게하여
//rank_arr라는 배열에 순위를 입력하시오
//	=> arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//   => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//<4번>
//- 중복된 값은 over_arr에 넣고 중복되지
//않은 값은 ret_arr에 입력하시오
//
//	정렬까지 했다면
//	=> over_arr : { 9, 10 }
//	=> ret_arr : { 3, 8, 13, 17, 21, 27 }

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = {10,17,3,9,27,10,8,9,13,21};

		//1번
		int [] invert_arr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			invert_arr[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(invert_arr));
		
		//2번
		int sum_odd=0;int sum_even=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum_even+=arr[i];
			}
			else {
				sum_odd+=arr[i];
			}			
		}
		System.out.println(sum_even-sum_odd);
		
		
		//3번
		int ranking =0;
		int [] rank =new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			rank[i]++;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));

		
		//4번(배열로 어케푸노?) --ArrayList로 풀었네	
		ArrayList over_arr= new ArrayList<>(); 
		ArrayList ret_arr= new ArrayList<>(); 
		int sw=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j] &&!over_arr.contains(arr[i])) {
					over_arr.add(arr[i]);
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<over_arr.size();j++) {				
				if(arr[i]==(int)(over_arr.get(j))) {
					sw=1;				
				}
			}
			if(sw==0) {
				ret_arr.add(arr[i]);
			}
			sw=0;
		}
		Collections.sort(over_arr);Collections.sort(ret_arr);
		System.out.println(over_arr);
		System.out.println(ret_arr);
		
		//4번 Array로 풀기?
		
		
}
}

