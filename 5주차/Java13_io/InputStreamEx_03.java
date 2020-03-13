package Java13_io.InputStream;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.Arrays;

public class InputStreamEx_03 {
	public static void main(String[] args) {
		
		InputStream is = System.in; //표준입력 객체
		byte[] b = new byte[1024]; //입력데이터의 임시 저장소
		int len = -1; // 입력받은 데이터의 길이
		int total=0; //입력한 총 길이		
		StringBuilder sb = new StringBuilder(); //입력받은 데이터 저장소
		System.out.println("<<입력 대기 중>>");
		
		try {			
			
			while((len=is.read(b))!=-1){
				total+=len; //전체입력길이 계산
				System.out.print("len : "+(len)); //enter값도 2바이트  ->len+2가 된다
				System.out.println();
//				System.out.print("b : "+(b)); //배열의 참조값 출력(참조변수이기 때문에 ) ->스트링으로 바꿔서 출력하자!
				String str= new String(b,0,len);
				System.out.println("b의 문자변환 : "+str);
				
				//new String(b)로 변환하면 byte[]요소의 모든 요소를 변환한다
				//이때 이전에 입력했던 데이터도 같이 변환해버린다
				//new(String(b,0,len)을 이용하여 입력한 길이만큼만 변환하여 사용한다
				
				//8자리 이상의 byte[] 들어가면 8개씩 짤라서 출력한다 ->byte배열을 키우면? ->메모리가 부족해질수있다 ->적정선:1024(1KB)
				sb.append(str);		
			}
			
		}catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("전체 "+total+" Byte 입력 완료");
		System.out.println("입력데이터는 >> "+sb);
	
	}
}
