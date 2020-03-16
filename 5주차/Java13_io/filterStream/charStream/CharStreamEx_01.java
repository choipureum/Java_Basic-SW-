package Java13_io.charStream;
import java.io.*;


public class CharStreamEx_01 {
	public static void main(String[] args) {
		
		//스트림은 기본적으로 바이트 단위로 통신을 한다
		// 바이트스트림을 문자스트림으로 변환할 필요가 있다
		
		//InputStreamReader
		//OutputStreamWriter
		// 두클래스를 이용하여 변환한다
		
		//표준입력스트림 System.in -> Reader 
		Reader br = new InputStreamReader(System.in); //
		
		//표준출력스트림 System.out -> Writer
		Writer bw = new OutputStreamWriter(System.out);
		
		//입출력 보조 변수
		char[] cbuf = new char[1024]; //입력 데이터 입시저장소
		int len=-1; //입력한 데이터의 길이 (문자 수)
		int total=0; //입력데이터의 총 길이(문자 수)
	
		try {
			//EOF가 입력될때까지 키보드의 입력을 받아들인다
			while((len =br.read(cbuf))!=-1) {
				bw.write(cbuf,0,len);				
				total+=len;
			}
			bw.flush(); // 한번에 출력
			System.out.println("입출력한 문자는 :"+total+"개입니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//스트림닫기
				if(bw!=null)bw.close(); //system.out을 닫으면 그 밑의 sysout동작안한다 주의!!!!
				if(br!=null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	
	}
}




