package Java05_array.sort;
import java.util.*;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap (자리바꾸기)
		int num1=11;
		int num2=22;
		
		System.out.println("스왑전 : "+num1+" / "+ num2);
		
		//swap 수행
		
		int temp =num2;
		num2=num1;
		num1=temp;
		
		
		System.out.println("스왑전 : "+num1+" / "+ num2);
		
	}
}
