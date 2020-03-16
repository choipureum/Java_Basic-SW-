package Java13_io.charStream;
import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		
		File file = new File("D:/file/","Source.txt");
		File file2 = new File("D:/file/","CharDest.txt");
		
		String str=null;
		BufferedReader br=null;
		PrintWriter bw =null;
		//입출력 보조 변수
		int total=0; //입력데이터의 총 길이(문자 수)
		//파일복사에서 문자스트림을 쓰면 오차가 발생한다
		
		try {
			br= new BufferedReader(new FileReader(file)); //file위치에 "경로/이름"을 넣어줘도 된다
			bw = new PrintWriter(new BufferedWriter(new FileWriter(file2)),true); //autoFlush
			
			while((str = br.readLine())!=null) {
				total+=str.getBytes().length; //복사된 문자바이트 개수
				bw.println(str);
			}
			System.out.println("파일의 크기 : "+total+"Bytes");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			bw.close();			
			try {
				if(br!=null)br.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
