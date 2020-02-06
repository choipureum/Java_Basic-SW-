package Java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열 배열
		//String []
		//String 배열
		
		String[] strArr = new String[3]; //문자열을 여러개 저장할 수 있는 배열 생성
		
		//문자열 배열에 값대입
		strArr[0]="Apple";
		strArr[1]="Banana";
		strArr[2]="Cherry";
		
		System.out.println("문자열 배열의 길이 : "+strArr.length);
		System.out.println("1번째 요소의 길이 : "+strArr[0].length());
		System.out.println("---------------------");
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
			System.out.println(strArr[i].length());
			System.out.println("----------------");
		}
	}
}
