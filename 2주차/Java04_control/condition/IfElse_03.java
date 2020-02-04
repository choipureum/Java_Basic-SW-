package Practice;

public class IfElse_03 {
	public static void main(String[] args) {
		int num=7;
//		
//		if(num>0) {
//			System.out.println("양수");
//		}
//		else {
//			if(num==0) {
//				System.out.println("0입니다");
//			}
//			else {
//				System.out.println("음수입니다");
//			} //제어문을 중복시켜 사용해보기
//		}
//		if(조건식1) {
			//조건식 1이 참일때 수행하는코드
//		}
//		else if(조건식 2) {
			//조건식 1이 거짓 &&조건식 2가 참일때 수행하는 코드
//		} else if조건문은 여러개 사용할 수 있다.
//		else {
//			위가 모두 거짓일때 수행하는 코드
		
//		else는 중간에 올 수 없다
//		else는 안와도 상관 없다
//		}
		//최종형태
		if(num>0) {
			System.out.println("양수");
		}
		else if(num<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		
	}
}
