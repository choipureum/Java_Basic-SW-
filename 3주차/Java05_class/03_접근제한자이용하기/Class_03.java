package Java06_class;

public class Class_03 {
	private int num;
	private String name;
	private double height;
	
	//private 사용방법(반환방법)
	
	//Getter Method	
	public int getNum() { //num필드의 값을 알려준다(반환한다)
		return num;
	}
	//Setter Method
	public void setNum(int num) { //num필드에 값을 저장한다
		this.num =num;
	}
	public String getName() {
		return name;
	} //이런경우 getter method만 있는(읽기전용) setter가 없는경우 (바꿀 순 없다)
}
