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
		
		try {
			br= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			bw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2))),true);
			
			while((str = br.readLine())!=null) {
				total+=str.getBytes().length;
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
