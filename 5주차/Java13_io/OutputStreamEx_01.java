package Java13_io.OutputStream;
import java.io.*;

public class OutputStreamEx_01 {
	public static void main(String[] args) {
		
		OutputStream os = null; //출력 스트림 객체
		os=System.out; // 표준출력
		
		try {
			os.write('a'); //'a' ->이것만 있다면 출력이 안된다(버퍼를 비워줘야 출력이된다)(찰때까지 기다림)
			os.write(100); //'d'
			os.write('\n'); //개행문자도 해줘야함  flush되지않음
			os.write('c');
//			os.flush(); //버퍼비우기
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {			
				try {
					if(os!=null) {
						os.flush();
						os.close(); //자동으로 flush를 해주지만 그래도 해줘야함
					}
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
		}
	}
//
//< OutputStream의 write()메소드 >
//
//-public abstract void write(int b) throws IOException
//	+출력스트림으로 아스키코드 b에 해당하는 문자를 출력한다
//
//-public void write(byte[]b)throws IOException
//	+출력스트림으로 b배열의 모든 문자를 출력한다
//	+b배열의 아스키코드 값을 문자로 변환해서 출력한다
//
//	+b.length만큼 출력, 모두 출력한다
//	+'\0'도 빈칸으로 출력함 ->문제가 될 수도 있음
//
//******write는 이거를 사용한다******
//-public void write(byte[]b,int offset, int len) throws IOException
//	+b배열의 offset부터 len만큼 출력한다
//	
