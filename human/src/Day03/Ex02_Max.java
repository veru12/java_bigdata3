package Day03;

import java.util.Scanner;

public class Ex02_Max {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
	
		for (int i = 0; i < N; i++) {
			
			arr[i] = sc.nextInt();
		}
		
	
		int max = Integer.MIN_VALUE;		
		for (int i = 0; i < arr.length; i++) {
			
			if( max < arr[i] ) {
				max = arr[i];
			}
		}
		
		System.out.println("理쒕뙎媛?: " + max);
		
		sc.close();
		
		
	}

}








