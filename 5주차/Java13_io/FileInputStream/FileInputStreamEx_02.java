package Java13_io.FileStream;
import java.io.*;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {
		
		File file = new File("D:/file/","Source.txt");
		System.out.println(file.exists());
		
		//파일 입력 보조 변수
		int len= -1; //입력데이터
		int total=0; //총입력길이		
		byte[] buf = new byte[1024]; //입력데이터 임시 저장소 
		StringBuilder sb = new StringBuilder();
		FileInputStream fis =null; //파일 입력스트림
		
		try {
			 fis= new FileInputStream(file);
			 
			while((len = fis.read(buf))!=-1) {
				sb.append(new String(buf,0,len)); //저장소에 데이터 저장(들어오는게 스트링값)
				total+=len; //총길이계산
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null)fis.close(); //스트림 닫기
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		System.out.println("입력받은 길이 : "+total);
//		System.out.println(sb);
		
	}
}
