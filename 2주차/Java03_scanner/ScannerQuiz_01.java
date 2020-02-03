package Java03_scanner;
import java.util.*;


//삼각형 넓이 구하기 문제
//밑변과 높이를 입력받고 넓이를 구하여라
public class ScannerQuiz_01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		//밑변 base, 높이 height
		sc.close();
		double temp = (double)(base*height)/2; //(밑변*높이)/2 --> 실수형 강제 변환
		System.out.println(temp);
	}
}
