  
package Java04_control.star;

public class Star_13 {
	public static void main(String[] args) {

		int temp=5;
		
		for(int i=10;i>=1;i--) {
			if(temp<i) {
				for(int j=0;j<i-5;j++) {
				System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int k=5;k>=i-1;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
}
