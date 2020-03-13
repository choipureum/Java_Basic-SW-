package Java13_io.InputStream;
import java.io.*;

public class InputStreamEx_01 {
	
	public static void main(String[] args) {
		
		InputStream is; //입력객체
		is=System.in; //표준입력
		
		try {
			System.out.print("입력하세요 : ");
			int i=is.read();
			System.out.println(i);
			System.out.print("문자 : "+(char)i);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}
}
//< 입출력, I/O, Input/Output > 
//
//- 프로그램이 입력장치(Input Device), 출력장치(Output Device)와 데이터를 송수신하는 것, 통신하는 것
//
//< Stream, 스트림 >
//
//- 통로, 흐름 
//- 입출력 장치와 프로그램 사이에서 데이터를 통신(교환)
//- 논리적인, SW적인 장치
//- 단방향
//- FIFO 구조로 이루어져있다 (First-in, First-Out)
//- Byte로 단위로 데이터 통신을 한다
//
//  +대표적인 스트림
//	
//	System.in : 표준 입력 스트림(키보드), Standard Input, STDIN
//	System.out : 표준 출력 스트림(모니터), Standard Output, STDOUT
//	System.err : 표준 에러 스트림(모니터), Standard Error, STDERR	
//
//- 버퍼를 가지고 있다
//	**버퍼(Buffer) : 스트림 안에 포함되어 있는 임시 저장소
//			I/O 저장장치와 프로그램간의 처리속도 차이를 줄이기 위해 사용된다
//
//< 스트림의 분류 >
//
//1. 입출력으로 구분
//
//	+입력 스트림 :
//	+출력 스트림 :
//
//2. 연결 대상을 기준으로 구분
//
//	+1차 스트림 : 입출력장치와 직접 연결되는 스트림
//	+2차 스트림 : 1차 스트림과 연결되어 보조하는 스트림
//
//3. 전송 데이터의 형태에 따른 구분
//	
//	+바이트스트림 : 1Byte단위로 통신
//	+문자스트림 : 문자(Char,2B)단위로  통신
//
//4. 기능에 따른 분류
//	
//	+보조 스트림 : 직접적인 입출력기능 X , 다른 스트림의 기능을 향상시킬 목적으로 사용(대부분 2차스트림)
//
//< InputStream의 read()메소드 > 
// 
// 1. public abstract int read() throws IOException
//	입력스트림으로부터 1Byte를 읽어드린다
//
//	읽어들인 데이터의 아스키 코드를 int형으로 반환한다(0~255)
//
//	입력스트림에서 End Of Stream을 만나면 -1을 반환한다
//
//	**EOF(end of file,end of stream) : 스트림의 끝(중단지점), 파일의 끝
//

// **********read()는 이것사용*********************
// 2. public int read(byte[]b) throws IOException
//		입력스트림에서 최대 b배열의 길이만큼 읽어들인다
//		읽은 데이터 b배열의 0번째 인덱스부터 기록한다
//		읽어들인 데이터의 길이를 int형으로 반환한다
//		읽어들일 데이터가 없을 경우 (EOF)-1을 반환한다
//***************************************************
//
//
//
// 3. public int read(byte[] b, int offset, int len) throws IOException
//입력스트림에서 최대 len만큼 읽어들인다
//읽어들인 데이터를 b배열의 offset 인덱스부터 기록한다
//읽어들인 데이터의 길이를 int형으로 반환
//읽어들일 데이터가 없으면(EOF)-1을 반환
//
//**read(buf)
//**read(buf,0,buf.length)
//**위 두 코드의 동작은 똑같다 -그렇기 때문에 byte[]쓰는게 낫다 이건 쓰지말자
//
//
//
//
//
//
//









