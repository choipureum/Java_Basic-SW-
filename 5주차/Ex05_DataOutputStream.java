package Java13_io.filterStream;
import java.io.*;

public class Ex05_DataOutputStream {
	public static void main(String[] args) {
		
		//출력파일 객체 생성
		File file = new File("./src/Java13_io/filterStream/","DataTest.txt");
		DataOutputStream dos=null;
		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			dos.write(100); //아스키코드 d
			dos.writeChar('A'); //2B
			dos.writeBoolean(true); //1B
			dos.writeInt(123); //4B
			dos.flush();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) dos.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
