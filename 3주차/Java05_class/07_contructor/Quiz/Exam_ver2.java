package Java06_class.constructor;

import java.util.Scanner;

public class Exam_ver2 {
	private static final int INPUT_MENU = 1;
	private static final int OUTPUT_MENU = 2;
	private static final int EXIT_MENU = 3;
	
	private static final int INFO_MENU = 1;
	private static final int SCORE_MENU = 2;
	private static final int STU_MENU = 3;
	
	private static final int ALL_MENU = 1;
	private static final int IDX_MENU = 2;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StudentService_ver2 ss= new StudentService_ver2();
	
//		ss.insertInfoIdx();
//		ss.insertScoreIdx();
//		ss.printStuIdx();
//		
//		ss.insertInfoAll();
//		ss.insertScoreAll();
//		ss.printStuAll();
//		
//		ss.insertStu(1);
//		ss.insertStuAll();

		int select = -1;
		do {
			System.out.println("+ + + + + 성적관리 프로그램 + + + + +");
			System.out.println("\t1. 입력");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 종료");
		
			select = selectMenu();

			switch(select) {
			case INPUT_MENU:
				System.out.println("\t  1-1. 인적 정보 입력");
				System.out.println("\t  1-2. 성적 입력");
				System.out.println("\t  1-3. 인적+성적 입력");
				
				select = selectMenu();
				switch(select) {
				case INFO_MENU:
					System.out.println("\t    1-1-1. (ALL) 인적 정보 모두 입력");
					System.out.println("\t    1-1-2. (IDX) 인적 정보 선택 입력");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertInfoAll();
						break;
						
					case IDX_MENU:
						ss.insertInfoIdx();
						break;
					}					
					break;

				case SCORE_MENU:
					System.out.println("\t    1-2-1. (ALL) 성적 모두 입력");
					System.out.println("\t    1-2-2. (IDX) 성적 선택 입력");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertScoreAll();
						break;
						
					case IDX_MENU:
						ss.insertScoreIdx();
						break;
					}
					break;
					
				case STU_MENU:
					System.out.println("\t    1-3-1. (ALL) 인적+성적 모두 입력");
//					System.out.println("\t    1-3-IDX. 인적+성적 선택 입력");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertStuAll();
						break;
						
					case IDX_MENU:
//						ss.insertStu(idx);
						break;
					}
					break;
				}
				break;
				
			case OUTPUT_MENU:
				System.out.println("\t  2-1. (ALL) 모두 출력");
				System.out.println("\t  2-2. (IDX) 선택 출력");
				
				select = selectMenu();
				switch(select) {
				case ALL_MENU:
					ss.printStuAll();
					break;
					
				case IDX_MENU:
					ss.printStuIdx();
					break;
				}
				break;
				
			case EXIT_MENU:
				System.out.println(" >> 종료합니다 <<");
				return;
			}
		} while(true);
	}
	
	private static int selectMenu() {
		System.out.print("\n\t> ");
		return sc.nextInt();
	}
}
