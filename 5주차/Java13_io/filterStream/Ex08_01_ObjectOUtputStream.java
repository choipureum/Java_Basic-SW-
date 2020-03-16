package Java13_io.filterStream;
import java.io.*;
import java.util.*;



public class Ex08_01_ObjectOUtputStream {
	public static void main(String[] args) {
		File file  = new  File("./src/Java13_io/filterStream/","ObjectTest2.ser");
		ObjectOutputStream os = null;
		
		try {
			os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			List list = new ArrayList();
			list.add(new Point(10,20));
			list.add(new Person("Choi", 27));
			list.add(new Person("Park", 25));
			list.add(new Person("Kim", 33));
			list.add(new Point(11,22));
			
			os.writeObject(list); //파일출력
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}

class Person implements Serializable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person : [name : "+name+" age : "+age;
	}
}
