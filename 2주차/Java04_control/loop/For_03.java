package Java04_control.loop;


public class For_03 {
	public static void main(String[] args) {
		//num이 10부터 1보다 크거나 같은 동안에 1씩 감소하면서 반복
		for(int num=10;num>=1;num--) {
			System.out.println(num);
		}
		//반복횟수 :10 
		//반복구간 :10~1
		System.out.println();
		System.out.println("//--------------------------------------");
		System.out.println();
		for(int i=0;i<10;i+=2) {
			System.out.println(i);
		}
		//반복횟수 :5 
		//반복구간 :0 2 4 6 8
		// 'i' == iterator (반복자)
	}
}
