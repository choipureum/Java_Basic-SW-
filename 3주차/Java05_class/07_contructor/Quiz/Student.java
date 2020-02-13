package Java06_class.constructor;

public class Student {
	//정보 저장 클래스
//	---------------
//	class Student
//	---------------
//	- name : String
//	- age : int
//
//	- kor : int
//	- eng : int
//	- math : int
//
//	- sum : int
//
//	- avg : double
//	---------------
//	<<setter>>
//	<<getter>>
//	---------------
	//멤버필드
	private String name;
	private int age;
	
	private int kor;
	private int math;
	private int eng;
	
	private int sum;
	private double avg;
	
	//게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
