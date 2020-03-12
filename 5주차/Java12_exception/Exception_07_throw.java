package Java12_exception;

public class Exception_07_throw {
	public static void main(String[] args) throws Exception {
		
		ThrowTest tt = new ThrowTest();
		try {
			tt.print("HI",3);
			tt.print(null, 3);
		}catch(Exception e) {
			System.out.println("문자열이 null입니다");
		}
	}
}
	class ThrowTest{		
		public void print(String s,int k) {
			if(s==null) {
				throw new NullPointerException();
			}
			for(int i=0;i<k;i++) {
				System.out.println(s);
			}
		}
	}


