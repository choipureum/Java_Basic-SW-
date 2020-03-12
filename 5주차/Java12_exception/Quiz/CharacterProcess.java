package Java12_exception.Quiz;

public class CharacterProcess {
	public int countAlpha(String s) throws CharCheckException {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z') ||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
				cnt++;
			}
			else if(s.charAt(i)==' ') {
				throw new CharCheckException();
			}
		}
		return cnt;
	}
}
