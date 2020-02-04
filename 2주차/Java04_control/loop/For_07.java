package Practice;
import java.util.*;

public class For_07 {
	public static void main(String[] args) {
		//첫날에 10원 예금
		//2배씩 올려서 15일동안 저금한다
		//총값은?
		
		int sum=0;
		int temp=10; //변화하는 예금
		
		for(int i=0;i<15;i++) {
			sum+=temp;
			temp*=2;
		}
		//for(int i=0, money=10;i<15;i++,account+=money,money*=2); 이렇게 표현할 수도 있다 //값 같음
		// 하지만 이렇게 쓰면 가독성이 떨어진다
		System.out.println("보름동안 저축한 금액: "+sum);
	}
}
