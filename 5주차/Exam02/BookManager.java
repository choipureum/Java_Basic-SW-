package Main;
import java.util.*;
import java.io.*;
import java.net.*;

public class BookManager {
	
	final File file =new File("./src/Main/","books.dat");	
	ArrayList <Book>bookList;
	
	public BookManager() {
		 bookList = new ArrayList<Book>();
	}
	
	public void fileSave() {
		ObjectOutputStream os =null;
		//임의의 book 리스트에 저장
		//어떤값을 넣을것인가~
		for(int i=0;i<5;i++) {		
			Book book= new Book(); 
			bookList.add(book);
		}
		
		try {
			//파일로저장출력
			os = new ObjectOutputStream(new FileOutputStream(file,true)); //파일에 덮어쓰기			
			for(int i=0;i<5;i++) {
				os.writeObject(bookList.get(i));
				os.flush();		
				System.out.println((i+1)+"번 BOOK: "+bookList.get(i).toString()); //출력확인
			}					
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(os!=null) 
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		}
	public void fileOpen() {
		ObjectInputStream os=null;
		try {
			os= new ObjectInputStream(new FileInputStream(file));
			Object str =null;
			int cnt=0;
			while((str =os.readObject())!=null){
				bookList.add((Book) str);
				System.out.println(str);
			}
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void fileUpload() {
		Socket sock=null;
		ObjectInputStream in=null;
		ObjectOutputStream out =null;
		BufferedReader br=null;		
		Object str =0;
		try {
			
			sock = new Socket("192.168.20.34",3000);
			in = new ObjectInputStream(new FileInputStream(file));
			out = new ObjectOutputStream(sock.getOutputStream());
			while((str = in.readObject())!=null) {
				out.writeObject(str+"\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
				out.close();
				br = new  BufferedReader(new InputStreamReader(sock.getInputStream()));
				if(br.readLine().equals("exit")) {
					sock.close();
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	}
	











