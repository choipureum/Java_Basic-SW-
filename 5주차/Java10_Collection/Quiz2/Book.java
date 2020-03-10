package Java10_collection.Practice2;

public class Book {
	
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	
	Book(){
		
	}
	Book(String bNo,int category, String title, String author){
		setbNo(bNo);
		setCategory(category);
		setTitle(title);
		setAuthor(author);
	}
	
	
	@Override
	public String toString() {
		return getbNo()+"\t"+getCategory()+"\t\t"+getTitle()+"\t"+getAuthor();
	}
	
	
	//getter,setter
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	
}



//Field
//	- bNo : String		//도서번호
//	- category : int	//도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
//	- title : String	//책제목
//	- author : String	//저자

	//기본생성자, 매개변수 있는 생성자, getters and setters 작성함
	//toString() 오버라이딩함
