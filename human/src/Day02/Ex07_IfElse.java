package Day02;

import java.util.Scanner;

public class Ex07_IfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ?낅젰諛쏆? 媛믪씠 ??섏씤吏 吏앹닔?몄? ?먮떒?섏떆??
		System.out.print("?낅젰 : ");
		int input = sc.nextInt();
		
		if( input % 2 == 1 ) {
			System.out.println("??섏엯?덈떎.");
		} 
		else {
			System.out.println("吏앹닔?낅땲??");
		}
		
		sc.close();
	}

}
