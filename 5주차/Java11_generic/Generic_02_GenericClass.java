package Java11_generic;
import java.util.*;


class Class02{
	private int data;
	
	public int display(int  data) {
		this.data = data;
		return data;
	}

	//getter setter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
//제네릭 클래스
//T는 빈칸이다 (여기에 나중에 타입을 <>정해준다면 T자리에 그 타입이 들어가게 된다
class Class03<T>{
	private T data;
	
	public T display(T data) {
		this.data=data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

public class Generic_02_GenericClass {
	public static void main(String[] args) {
	
		//<T> 타입 지정하기
		Class03<String> c = new Class03<>();		
		c.setData("Grape");
		System.out.println(c.getData());
		
		Class03<Integer> c2 = new Class03<>();
		c2.setData(123);
		System.out.println(c2.getData());
		
	}
}

//< 제네릭 클래스 >
//
//- [접근제한자] [클래스식별자] class 클래스명 <Type1, Type2....>{
//}
//
//- 제네릭이 적용된 클래스
//
//- 제네릭클래스를 이용하여 객체 생성을 할때 타입 파라미터를 결정지어주는게 좋다
//- 타입파라미터를 결정하지 않으면 Object로 처리된다
//- 제네릭클래스의 변수를 선언할 때 타입파라미터를 명시하고 객체를 생성하는 코드에서는
//	< >만 적는다 (중복으로 데이터 안적어도됨)
