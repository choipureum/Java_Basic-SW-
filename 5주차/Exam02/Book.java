package Main;
import java.util.*;
import java.io.*;

public class Book implements Serializable{
	private String title;
	private int price;
	
	public Book() {
		
	}
	public Book(String title, int price) {
		this.setTitle(title);
		this.setPirce(price);		
	}
	
	//getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPirce(int pirce) {
		this.price = pirce;
	}
	
	@Override
	public String toString() {
		return "[Title] : +"+getTitle()+" [Price]] : "+getPrice();
	}
}
