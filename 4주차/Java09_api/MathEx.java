package Java09_api;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.PI); //원주율
		System.out.println(Math.abs(-10)); //절대값
		System.out.println(Math.ceil(3.8)); //올림
		System.out.println(Math.floor(3.7)); //내림
		System.out.println(Math.round(-3.7)); //반올림
		System.out.println(Math.pow(2.1, 3)); //제곱
	}
}
//< Math 클래스 >
//- 수학(산술)적인 연산을 정적메소드로 제공하는 클래스
//- 멤버필드로 E(자연상수),PI(원주율) 두 가지를 정적멤버로 가지고 있다
//- 사용방법
//	Math.abs(-5);  -->5
