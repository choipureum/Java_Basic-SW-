package Java04_control.loop;

public class For_04 {
	public static void main(String[] args) {
		
		//"Hello"를 총 7번  반복 출력해라
		for(int i=1;i<8;i++) {
			System.out.println("Hello "+i+"번");
		}
		//반복횟수 : 7번
		//반복구간 : 0~6
		
		//i가 0부터 7보다 작은 동안에 1씩 증가하면서 반복(추천)
		
		//초기식 : int i=0;  (반복구간의 시작값)
		//조건식 : i<7       (반복구간의 끝값, 반복횟수)
		//증감식  : i++       (1씩증가)
	}
}
