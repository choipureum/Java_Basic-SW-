package Java11_generic;
import java.util.*;


//제네릭 클래스
class Parent<T>{
	T data;
}
//상속
class Child01 extends Parent{ //상속시 T -> Object로 바뀌게된다  (raw type) : 타입을 안정하고 상속주는건 안좋다
	
}

class Child02 extends Parent<String>{ //T-> String 으로 지정 
	
}
class Child03<K> extends Parent<K>{ //T->K
	//상속받은 타입 파라미터를 결정하지 않고 미룬다
}
class Child04<M,N> extends Parent<M>{ //T->M 
	N data2;
	
	//M data1; - 상속받을 제네릭 M을 이용한 멤버필드, 타입 미결정
	//N data2; - 자식 클래스의 고유한 제네릭 N
}

public class Generic_07_Inherit {
	public static void main(String[] args) {
		
		Child03<Integer> c = new Child03<>(); //T->K->Integer
	}
}
