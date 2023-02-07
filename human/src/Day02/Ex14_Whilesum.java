package Day02;

public class Ex14_Whilesum {

	public static void main(String[] args) {
		
		int sum =0;
		int a = 1;
		
		while( a <= 100) {
			// 복합 대입 연산자
			sum  += a++;
	//		sum = sum + a; 
	//		a++;
			
			System.out.println("합계 : " + sum);
		}
	}
}
