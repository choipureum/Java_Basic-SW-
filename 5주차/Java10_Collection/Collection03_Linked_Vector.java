package Java10_collection;
import java.util.*;


public class Collection03_Linked_Vector {
	public static void main(String[] args) {
		
		List list = new LinkedList();
		list.add(1);
		list.add(2);
		List v =new Vector();
		v.add(1);
		v.add(2);
		System.out.println(list);
		System.out.println(v);
	}
}
