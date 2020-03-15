package Java13_io.OutputStream;
import java.io.*;

public class OutputStreamEx_03 {
	public static void main(String[] args) {
		
		OutputStream os = System.out;
		byte[] b = new byte[1024];
		int len=0; //의미있는 데이터의 길이(빈칸 제외)
		
		b[len++] = 'A';
		b[len++] = 'p';
		b[len++] = 'p';
		b[len++] = 'l';
		b[len++] = 'e';
		b[len++] = '\n';
		b[len++] = 'H';
		b[len++] = 'i';
		b[len++] = '!';
		b[len++] = '\n';
		
		try {
			os.write(b,0,len);
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
