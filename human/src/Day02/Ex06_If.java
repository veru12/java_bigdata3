package Day02;

import java.util.Scanner;

public class Ex06_If {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ?낅젰諛쏆? 媛믪씠 ??섏씤吏 吏앹닔?몄? ?먮떒?섏떆??
		System.out.print("?낅젰 : ");
		int input = sc.nextInt();

	
		// 1, 3, 5, 7... : 
		// 2, 4, 6, 8... :  
		// 1 % 2 = 1
		// 2 % 2 = 0
		// 3 % 2 = 1
		// 4 % 2 = 0
		// 5 % 2 = 1
		// 6 % 2 = 0
		if( input % 2 == 1 ) {
			System.out.println("??섏엯?덈떎.");
		}
		if( input % 2 == 0 ) {
			System.out.println("吏앹닔?낅땲??");
		}
		
		sc.close();
	}

}
