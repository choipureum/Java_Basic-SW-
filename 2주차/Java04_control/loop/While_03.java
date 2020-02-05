package Practice;

public class While_03 {
	public static void main(String[] args) {
		//구구단
		
		int gugu =1; 
		int cnt=0;
		
		while(gugu<9) {
			gugu++; //2
			System.out.println(gugu+"단----------");		
			for(int i=1;i<10;i++) {
				cnt++; //1
				System.out.println(gugu+" * "+cnt+" = "+(2*cnt));	
			}
			cnt=0;
			System.out.println();
		}
	}
}
