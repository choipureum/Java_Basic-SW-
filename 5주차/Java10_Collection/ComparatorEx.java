package Java10_collection;

import java.util.*;

public class ComparatorEx {
	public static void main(String[] args) {
		
		Person p1= new Person(2, "Suhyun", "Swimming");
		Person p2= new Person(3, "Mincheol", "Soccer");
		Person p3= new Person(1, "Pureum", "Game");
		
		List<Person>list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(Person p : list) {
			System.out.println(p); //Person을 호출하면 자동으로 person의 toString을 호출한다
		}
		
		//1번
//		Comparator<Person>comp = new Comparator<Person>() {			
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		//2번(한번에 하기)
		Collections.sort(list,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				//o1보다 o2의 넘버가 크다면
				//no기준 오름차순 정렬
				if(o1.getNo()<o2.getNo()) { //1,2,3
					return -1;
				}
				else if(o1.getNo()>o2.getNo()){
					return 1;
				}
				else {
					return 0;				}			
			}			
		});
		System.out.println(list);
		
		//문자열 비교(Name을 기준으로 오름차순)
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				//왼쪽이 작은경우 ex) a와 c일때 아스키 코드 a-c는 마이너스이므로 왼쪽이 작다
				if(o1.getName().compareTo(o2.getName())<0) {
					return -1;
				}
				return 1;
			}	
		});		
		System.out.println(list);
		
	}
}

//구동원리

//comparator를 선언해서 정렬기준을 만들어준다

//<반환값>
//	음수 
//	0
//	양수
//retrun 음수 반환(-1) o1의 데이터가 작다 (오름차순) :정렬할때 앞으로보냄
//0반환 : o1과 o2가 같다
//양수반환(1) o1의 데이터가 크다(내림차순) : 정렬할때 뒤로보냄


// **<문자열 비교>
// compareTo함수를 이용해서 비교한다 (원리는 o1에서 o2의 아스키코드를 빼주는형식)만약 0보다 작으면 더 작다
// 0보다 크면 더 크다



