package Java08_abstract.interfaceEx.Quiz2;


public class Array implements ArrayAction {
	String[] arr = new String[10];
	int cnt=0;
	
	@Override
	public void add(String element) {
		arr[cnt]=element;
		cnt++;
	}
	@Override
	public int find(String element) {		
		int result=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				result=i;
			}
		}
		return result;
	}
	@Override
	public String get(int idx) {
		String result="";
		if(arr[idx]!=null) {
			result=arr[idx];
		}
		else {
			result="[ERROR] : 그곳엔 아무것도 없습니다!";
		}	
		return result;
	}
	@Override
	public void print() {
		boolean sw=true;
		System.out.print("[ ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=null) {
					System.out.print(arr[i]+" ");
					sw=false;
			}
		}
		if(sw==true) {
			System.out.println("[ERROR] : 아무것도 없습니다!");
		}
		else {
			System.out.print("] \n");
		}
	}
	@Override
	public void remove(String element) {
		int Idx=10;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				arr[i]=null;
				Idx=i; //1
				continue;
			}
			else if(i>Idx) {
				arr[i-1]=arr[i];
			}
		}
		cnt--;
		
	}

}
