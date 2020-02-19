package Java08_abstract.interfaceEx.Quiz2;

public interface ArrayAction {
	
	// 배열의 마지막 데이터 뒤에 삽입
	public void add(String element);
	
	// element가 존재하면 삭제
	// 주의) 배열의 요소 사이에 빈공간이 없도록 유지한다
	public void remove(String element);
	
	// idx위치의 element를 반환
	public String get(int idx);
	
	// element의 idx를 반환
	//	없으면 -1
	public int find(String element);

	// 모든 element 출력
	public void print();
}




