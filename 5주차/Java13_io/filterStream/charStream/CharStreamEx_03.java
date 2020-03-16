package Java13_io.charStream;
import java.io.*;

public class CharStreamEx_03 {
	public static void main(String[] args) {
		 
		//표준출력의 최종버전 (이걸사용할것이다)
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//표준입력스트림 System.out->PrintWriter
//		PrintWriter out = new PrintWriter(System.out);
		PrintWriter out = new PrintWriter(System.out,true); //autoFlush //,true를 적어주면 flush하지 않아도 자동으로 flush해준다
		PrintWriter out2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)),true); //버퍼랑 같이사용하면 더 좋다(복잡하지만)
		PrintWriter out3 = new PrintWriter(new BufferedOutputStream(System.out),true); //버퍼바이트스트림
		//버퍼를 사용하는 여러방법
		String str=null;
		
		try {
			while((str = br.readLine())!=null) {
				out.println(str);//System.out이 가지고 있는 메소드들을 모두가지고 있어서 편리하다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close(); //예외처리 필요없다 - 하지만 안에 넣어도 상관없다
			try {
				if(br!=null)	br.close();			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
