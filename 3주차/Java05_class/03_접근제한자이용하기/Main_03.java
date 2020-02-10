package Java06_class;

public class Main_03 {
	public static void main(String[] args) {
		Class_03 c01 = new Class_03();
		Class_03 c02 = new Class_03();
		
//		c01.num =10; //private이기 때문에 에러가 발생 /사용하려면? 
//		System.out.println(c01.num);
		
		//**접근방법**
		
		//Setter호출
		c01.setNum(10); //위에서 직접적으로 사용하면 안된다 -->10을 저장 
		int num=c01.getNum();//getter을 통해서 불러오기
		System.out.println(num); //10출력
		
	}
}
