package java08_abstract.interfaceEx.quiz2;


public class Array implements ArrayAction {
	String[] arr = new String[10];

	@Override
	public void add(String element) {
		int idx; //삽입 위치 인덱스
		
//		//삽입 위치 찾기 - for문 이용
//		for(idx=0; idx<arr.length; idx++) { //배열의 길이만큼
//			if( arr[idx] == null ) { //비어있는 공간의 idx찾기
//				break;
//			}
//		}
		
		// 삽입 위치 찾기 - find()함수 이용
		idx = find(null);
		
		
		// 배열의 크기보다 많은 데이터를 입력하는 상황 - 예외 처리
		if( idx >= arr.length || idx == -1 ) {
			return;
		}
		
		arr[idx] = element; //삽입
	}
	
	@Override
	public void print() {
		int idx;
		
		//배열의 모든 요소 출력
		for(idx=0; idx<arr.length; idx++) {
			if( arr[idx] != null ) { //null이 아니면 출력
				System.out.println( arr[idx] );
			}
		}
	}

	@Override
	public void remove(String element) {
		int idx = find(element);
		
		// 지우려는 요소로부터 다음에 있는 요소들은
		//모두 한칸씩 당겨서 저장한다
		for(; idx<arr.length-1; idx++) {
			arr[idx] = arr[idx+1];
		}
		
		// 배열의 마지막 요소에 null을 저장
		arr[idx] = null;
	}

	@Override
	public String get(int idx) {
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int idx; //위치 인덱스
		
		//찾는 데이터 위치 찾기
		for(idx=0; idx<arr.length; idx++) { //배열의 길이만큼
			if( arr[idx] == element ) { //element와 같은 데이터 요소 찾기
				break;
			}
		}
		
		if(idx==arr.length) { //배열안에 없으면 -1 반환
			return -1;
		}
		
		return idx; //찾은 인덱스 반환
	}
}




