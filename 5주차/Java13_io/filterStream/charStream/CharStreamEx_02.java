package Java13_io.charStream;
import java.io.*;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//표준입력스트림 System.in->Reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//표준출력스트림 System.out ->Writer
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		String temp=null;
		int total=0;
		try {
			//EOF를 만날때까지 문자열 입력(개행문자를 기준으로 입력함)
			while((temp = br.readLine())!=null){
				bw.write(temp); //문자열출력
				bw.newLine(); //개행(println) : 위와 세트
				total+=temp.length(); //전체 문자길이
				bw.flush();	//버퍼비우기
			}	
			System.out.println(total);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
