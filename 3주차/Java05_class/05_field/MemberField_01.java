package Java06_class.field;

//기능클래스
public class MemberField_01 {
	//멤버필드
	private int num=999;
	private String name="Alice";
	
	//source -Generate getter, setter 항목을 선택하면 한번에 편하게 만들 수 있다.
	//단축키 : alt +shift +s
	// 단축키는 모든 버튼에 밑줄이 그어져있는 알파벳이 있다. 이는 (alt +밑줄 알파벳)이 단축키
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
//<Pirvate 멤버필드 사용하기>
//
//	< Getter Method >
//
//	+멤버필드의 값을 가져올 수 있도록 만든 메소드
//	+얻어올때 (읽기)
//	+메소드명을 "get"으로 시작하고 멤버필드의 첫글자를 대문자로 작성한다
//	-형식 : 
//	  public [해당필드의 데이터타입] getXxxx(){
//	    return [필드의 변수명];
//		}
//	ex) private int num; //멤버필드 num
//		public int getNum(){
//			return num; }
//
//
//	< Setter Method >
//
//	+멤버필드의 값을 저장할 수 있도록 만든 메소드
//	+저장할때 (쓰기)
//	+메소드명을 "set"으로 시작하고 멤버필드의 첫글자를 대문자로 작성한다
//	-형식 : 
//	  public void setXxxx([해당필드의 데이터타입] [필드명]){
//	    return this.[변수명] =[변수명];
//		}
//	ex) private int num; //멤버필드 num
//		public void setNum(int num){
//			this.num=num; 
//			}
