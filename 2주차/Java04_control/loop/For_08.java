package Practice;

public class For_08 {
	public static void main(String[] args) {
		//if 중첩
		int num=11;
		
		if(num>=11) {
			System.out.println("1보다 크거나 같다");
		
			if(num<=100) {
				System.out.println("1보다 크거나 같다");
				System.out.println("100보다 작거나 같다");
			}
		}
		System.out.println("---------------------------");
		
		//for문과 if문 중첩
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("짝수 : "+i);
			}
		}
		
	}
}
