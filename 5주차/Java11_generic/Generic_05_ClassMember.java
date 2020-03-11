package Java11_generic;
import java.util.*;


public class Generic_05_ClassMember {
	public static void main(String[] args) {
		
		Class05<Integer> c= new Class05<>(); //T->Integer
		//K->T->Integer
		c.d3.data=100; //NullPointerException  발생
		//--------------------------------
		// class안에 있는 class Data 초기화시켜줘야 안발생한다
		c.d1=new Data<>(); //Data<K>-> Data<Object>
		c.d2=new Data<>(); //Data<K>-> Data<String>
		c.d3=new Data<>(); //Data<K>-> Data<T> :  T  -> Integer가 들어간상태
	}
}

class Data<K>{
	K data;
	
	
}
class Class05<T>{
	Data d1; // K-> Object type
	
	Data <String>d2; //K->String
	
	Data<T>d3; //K->T
	
}
