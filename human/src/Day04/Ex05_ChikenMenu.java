package Day04;

import java.util.Scanner;

public class Ex05_ChikenMenu {


public static void printMenu( ) {
	public static void main(String[] args) {
		
	}
	/*
	######### 메뉴판 ##############
	1. BHC - 뿌링클치킨
	2. BBQ - 황금올리브 반반치킨
	3. 노랑통닭 -  후라이드 치킨
	4. KFC - 핫크리스피 치킨
	5. 치킨나라 - 양념치킨
	0. 종료
	########## 입력 :
	
	메뉴번호에 따라 메뉴 
	
	
	
	
	
	
	
	
	*/
	
	 int menuNo = 0;
	 String menuName = "";
	 int count = 0;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 
	 do 
		 
	 
	 
		 System.out.println("##############메 뉴 판 ##############");
		 System.out.println("1. BHC - 뿌링클치킨");
				 System.out.println("2. BBQ - 황금올리브 반반치킨");
						 System.out.println("3. 노랑통닭 - 황금올리브 반반치킨");
								 System.out.println("4. KFC - 황금올리브 반반치킨");
										 System.out.println("5. 치킨나라 -양념치킨");
								 System.out.println("0. 종료");
										 System.out.println();	
							// 메뉴번호 입력
										 printMenu();
										 menuNo= sc.nextInt();
	 }} 
										 // 종료 조건
										 if (menuNo==0)break; {
											
										}}
										 //메뉴 선택
										 switch (menuNo) {
										case 1: menuName = "뿌링클치킨";
												break;
											
										case 2: menuName = "황금올리브 반반치킨";
												break;
										
										case 3: menuName = "황금올리브 반반치킨";
												break;
										
										case 4: menuName = "황금올리브 반반치킨";
												break;
										
										case 5: menuName = "양념치킨";
												break;
										
										 }}
										default: menuName ="(선택안함)";
											break;
											
											// ###2
											// 주문 출력
											System.out.println(menuName + "이 주문되었습니다.\n");
											count = count +1;
											count ++;
											else {
												System.out.println("0~5번 사이의 정수를 입력해주세요.\n");
											}
											//###3
											while (true);
										}System.out.println(count +" 개의 주문을 완료했습니다.");
										}}				 
 while (true)
	 
	 
	







