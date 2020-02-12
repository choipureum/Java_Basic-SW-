package Java06_class.field;

//기능클래스 3
public class MemberField_03 {
	
	private int num=777; //인스턴스 변수  : 파란색
	private static int num2=555; //클래스 변수, 정적 변수 : 파란색+기울인글씨 
	
	public void method(int var) { //var, 매개변수, 지역변수
		int num =101; //지역변수(Local Variables) : 노란색
		int num2=202; //지역변수
		System.out.println(num);
		System.out.println(this.num); //this를 사용하면 지역변수가 아닌 인스턴스 변수 호출
		System.out.println(num2);
		System.out.println(MemberField_03.num2); //num2에서 경고가 보이는 이유는 static 정적 변수이기때문에
	}
}
