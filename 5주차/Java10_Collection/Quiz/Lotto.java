package Java10_collection.Practice1;
import java.util.*;


public class Lotto {
	public static void main(String[] args) {
		lottoDisplay();
		
	}	
	public static void lottoDisplay() {
		Set set= new TreeSet();
		
		while(set.size()!=6) {
			int temp=(int)(Math.random()*45+1);
			if(set.contains(temp)) {
				continue;
			}
			set.add(temp);
		}
		List list = new ArrayList(set);
		System.out.println(list);
	}
}
//중복안되는 45까지의 6개 난수발생과 자동 오름차순되는 TreeSet에 넣어서 이후 이를 리스트에 넣어주면 
