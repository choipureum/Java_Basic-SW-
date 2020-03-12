package Java12_exception;

public class Exception_12_customExcepton {
	public static void main(String[] args) {
		
		//짝수인지 판별하는 객체
		CheckEven ce = new CheckEven();
		try {
			ce.check(13); //홀수 ->예외상황 ->"홀수는 안됩니다!" :예외메시지출력
			ce.check(14); //짝수 -> 정상상황 ->"짝수가 맞습니다"
		}catch(OddNumberException e) {
			System.out.println(e.getMessage());//13예외가 호출되면 14가 안나온다(코드한줄 씩 따로적기)
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ce.check(12);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}


