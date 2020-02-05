package Java04_control.loop;

public class While_02 {
	public static void main(String[] args) {
		
//		초기식
//		while(조건식) {
//			반복코드
//			증감식
//		}	
		
		//1부터 10까지 출력		
		int cnt=0; //카운트
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			if(cnt==10) {
				break;
			}
		}
	}
}
