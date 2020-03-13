package Java13_io.byteStream;
import java.io.*;

public class Echo {
	public static void main(String[] args) {
		
		//키보드입력 -> 모니터 출력 하는 클래스
		InputStream is = System.in; //표준입력 스트림
		OutputStream os = System.out; //표준출력 스트림
		
		byte[] buf = new byte[1024]; //입출력 임시 저장소
		int len =-1; //입력데이터의길이
		
		try {
			while((len = is.read(buf))!=-1) {
				os.write(buf,0,len);
				os.flush();
			}
		}catch (IOException e) {			
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) {
					os.close();
				}	
				if(is!=null) {
					is.close();
				}
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		
		
	}
}
