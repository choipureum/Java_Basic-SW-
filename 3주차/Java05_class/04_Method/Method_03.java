package Java06_class.method;

//기능클래스 3
public class Method_03 {
	
	//arr은 arrTest01을 통해 값이 바뀐다 vs num은 arrTest02를 통해도 그대로 (안변한다)
	// Call by Reference vs Call by Value 문제
	public void arrTest01(int[]arr) { //매개변수가 참조형(배열)일때?
		arr[2]=888; //arr[2] 를 888로 변환(참조형이기때문)
	}
	public void arrTest02(int num) {
		num=888;  //num값은 변화가 없다?! -->밑에 설명참조 (정적할당과 동적할당)
	}
	//--------------------------------------------------------------
	public int arrTest03() {
		int num=10;
		return num;
	}
	public int[] arrTest04() {
		int[] arr=new int[3];
		return arr;
	}
}
//< Call by Value, 값에 의한 호출 >
//-메소드를 호출할 때 전달되는 인자가 기본데이터타입일 때
//-num이 바뀌지 않는이유는 arrTest02속 num과 main의 num이 다르기 때문에
//  -->호출된 메소드(Callee)에서 매개변수의 값을 변경하더라도 호출한 메소드(Caller)에서는 변경되지않는다

//< Call by Reference, 참조에 의한 호출 >
//-메소드를 호출할 때 전달되는 인자가 참조형일 때
//-arr는 힙에 주소값만 가져오기때문에 arr를 찾아서 바꿔주게 되기때문에 arr인자가 바뀐다
//	-->호출된 메소드(Callee)에서 매개변수의 값을 변경하면 호출한 메소드(Caller)에서는 변경된다

//쓰진않지만 추가설명
// +Call By Address : Pointer(포인터)
// +Call By Name : 기본형이나 참조형이냐 구분하지 않음 

//-------------------------------------------------------
//< 스택, Stack >
//-정적할당영역
//-변수공간
//-끝나면 삭제

//< 힙, Heap >
//-동적할당영역
//-new로 만든 공간
//-끝나면 garbage collector에서 회수해간다

