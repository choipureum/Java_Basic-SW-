package Java13_io.filterStream;
import java.io.*;

public class Ex06_DataInputStream {
	public static void main(String[] args) {	
	
		//출력파일 객체 생성
		File file = new File("./src/Java13_io/filterStream/","DataTest.txt");
		DataInputStream dis=null;
		try {
			//데이터 입력 스트림생성
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			//데이터의 형식대로 맞춰서 출력해줘야한다 (DataOutput에서 잘맞춰줘야됨)
			int d1=dis.read();
			boolean d2 = dis.readBoolean();
			char d3 = dis.readChar();
			int d4 = dis.readInt();		
			System.out.println((char)d1);
			System.out.println(d2);
			System.out.println(d3);
			System.out.println(d4);
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis!=null) dis.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
}
}
