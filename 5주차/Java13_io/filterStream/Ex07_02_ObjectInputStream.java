package Java13_io.filterStream;

import java.io.*;

public class Ex07_02_ObjectInputStream {
	public static void main(String[] args) {
		File file  = new  File("./src/Java13_io/filterStream/","ObjectTest.ser"); //파일객체 선언
		
		//스트림객체
		ObjectInputStream os = null;
		
		try {
			os= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			//파일 읽기
			Object obj1 =os.readObject();
			Object obj2 =(Point)os.readObject();
			Object obj3 =(Point)os.readObject();
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
