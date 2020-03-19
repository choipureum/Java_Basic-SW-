package Main;
import java.util.*;
import java.io.*;
import java.net.*;


public class ServerManager {
	final File file =new File("./src/Main/","books.dat");	
	public ServerManager() {
	}
	public boolean fileLoad(Socket client) {
		boolean sw = false;
		
		ObjectOutputStream out =null;
		ObjectInputStream in =null;
		Object str=null;
		PrintWriter pw =null;
		
		try {
			in = new ObjectInputStream(client.getInputStream());
			out = new ObjectOutputStream(new FileOutputStream(file,true));
			while((str =in.readObject())!=null) {
				out.writeObject(str);
				System.out.println(str);
			}
			pw = new PrintWriter(client.getOutputStream());
			pw.print("exit");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
				sw=true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sw;
	}
	public void serverStart() {
		ServerSocket serv =null;
		Socket sock =null;
		boolean sw=false;
		try {
			serv=new ServerSocket(3000);
			sock= serv.accept();
			sw=this.fileLoad(sock);
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				
					try {
						if(sw) {
						sock.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}

	
}
