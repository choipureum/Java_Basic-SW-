import java.util.*;
import java.io.*;


public class Quiz3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int com=(int)(Math.random()*50); //1~50까지 생성		
		int cnt=1;
		System.out.println("+++UP & DOWN Game+++");
		while(true) {		
			System.out.print("Input Number(1~50) : ");
			int user=Integer.parseInt(br.readLine());
			if(user==com) {				
					System.out.println("Answer is "+com);
					System.out.println("***[User] WIN!!!***");	
					System.out.println("===System Finish===");
					break;
			}
			else if(user>com) {
				System.out.println("DOWN / "+ "COUNT is " +cnt);
			}
			else {
				System.out.println("UP / "+"COUNT is " +cnt);
			}
			cnt++;
			if(cnt>=8) {
				System.out.println("===Over 7 count===");
				System.out.println("Answer is "+com);
				System.out.println("***[Computer] WIN!!***");
				System.out.println("===System Finish===");
				break;
			}
		}
		}
}
