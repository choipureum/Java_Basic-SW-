package Java12_exception.Quiz;

public class NumberProcess {
	public boolean checkDouble(int n1, int n2) throws Exception{
		if((n1>=1 &&n1<=100) && (n2>=1 &&n2<=100)){			
			if(n1>=n2 && n1%n2==0) {
				return true;
			}
			else {
				return false;
			}
		}else {
			throw new NumberRangeException();
		}	
	}
}
