package Java13_io.InputStream;
import java.io.*;

public class InputStreamEx_02 {
	public static void main(String[] args) {
		
		InputStream is = System.in; //표준입력객체
		
		int in=-1;
		StringBuilder sb = new StringBuilder(); //입력받은 데이터 저장소
		
		try {
			//만약에 read를 수행했다면 in이 -1리가 없다 입력이 되면 while을 빠져나옴
			while((in=is.read())!=-1) {
				sb.append((char)in); //char로 형변환하지 않으면 숫자로 들어간다
			} 
			//is.close(); //스트림닫기 (여기서 시행하면 System.in)에 문제가 있다면? 안된다 ->finally로 가야됨
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//close는 throws Exception 이 걸려있어서 또다시 예외처리 해줘야한다
			try {
				if(is!=null) {
					is.close();
					//System.in이 null이면 안닫아도 되는데 닫기된다 -> if로 처리(finally에서 if로 처리->보편적방법)
				}			
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		System.out.println("sb : "+sb); //엔터를 아무리 눌러도 endOfStream을 안만난다 무한입력 ->그렇다면? 
		//->직접 endOfStream을 입력해야한다(ctrl+z)
		//ctrl+z를 누르면 강제로 EndOfStream을 소환해준다
	}
}
