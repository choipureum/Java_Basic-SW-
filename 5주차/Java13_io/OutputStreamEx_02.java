package Java13_io.OutputStream;
import java.io.*;


public class OutputStreamEx_02 {
	public static void main(String[] args) {
		//매개변수가 바이트 배열일때
		OutputStream os = System.out; //표준출력 스트림
		
		byte [] b = new byte[1024]; 
		b[0]='A';
		b[1]='B';
		b[2]='C';
		b[3]='\n';
		b[4]='D';
		b[5]='E';
		b[6]='\n';
		
		try {
//			os.write(b); //빈칸이 발생하게된다
//			os.flush();
			//-------------
			String str= "Hello Hi";
			byte[] b2=str.getBytes();
			os.write(b2);
			os.flush();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {		
				try {
					if(os!=null) {
					os.close();
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
// byte배열이 1024이고 null이 들어가있다 -> write하면 글씨가 없는 빈칸이 1024개 출력되게된다 ->str.getBytes()를 써보자
// 			str.getBytes()->byte배열로 반환해줌 ->빈칸없음









