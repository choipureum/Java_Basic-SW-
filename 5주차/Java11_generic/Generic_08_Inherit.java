package Java11_generic;

public class Generic_08_Inherit {
	public static void main(String[] args) {
		
		Class09<String> c= new Class09<>();
		c.method("abc");
		
	}
}

interface Inter1<T1>{
	void method(T1 data);
}
interface Inter2<T2>{
	void method2(T2 data);
}


class Class08 implements Inter1<String>, Inter2<Integer>{
		
	@Override
	public void method2(Integer data) {
		// TODO Auto-generated method stub
		
		
	}@Override
	public void method(String data) {
		// TODO Auto-generated method stub
		
	}
}
class Class09<E> implements Inter1<E>,Inter2<E>{
	@Override
	public void method(E data) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2(E data) {
		// TODO Auto-generated method stub
		
	}
}
