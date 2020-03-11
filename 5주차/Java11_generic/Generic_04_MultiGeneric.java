package Java11_generic;

public class Generic_04_MultiGeneric {
	public static void main(String[] args) {
		Class04 c = new Class04<>(); //나중에 정하기
		c.setData1(1);
		c.setData2("최푸름");
		System.out.println(c.getData1());
		System.out.println(c.getData2());
		
		Class04<Integer, String> c2= new Class04<>(); //먼저 정하기
		c2.setData1(123);
		c2.setData2("abc");
		//------------------------
		c2.<Boolean, Double>test(true); //test에 정의된 K1,K2에 지정가능
	}
}


//멀티 제네릭 클래스
class Class04<T1,T2>{
	private T1 data1;
	private T2 data2;
	
	
	//멀티 제네릭 메소드
	public <K1,K2> K2 test(K1 data){
		K2 result =(K2)data;
		return result;
	}
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	
}
