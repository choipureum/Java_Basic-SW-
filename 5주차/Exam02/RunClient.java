package Main;


public class RunClient {
	final static BookManager bm = new BookManager();
	
	public static void main(String[] args) {
		bm.fileSave();
		bm.fileOpen();
		bm.fileUpload();
		
	}
}
