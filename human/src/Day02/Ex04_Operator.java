package Day02;

public class Ex04_Operator {

	public static void main(String[] args) {
		//AND
		// 20 (십진수) --> 0001 0100 (이진수)
		// 16 (십진수0 -- > 0001 0000 (이진수)
		// 이진수 : 0 또는 1로만 표현한 수
		
		// 0001 0100
		// 0001 0000
		// -------------
		// 0001 0000 -->16
		int result = 20 & 16;
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println( "-----------------" );
		System.out.println( Integer.toBinaryString(result) );
		System.out.println( );
		int result2 = 20 | 16;
		
		System.out.println();
		System.out.println( Integer.toBinaryString(20));
		
		
		int result3 = 20 ^ 16;
		System.out.println(20 ^ 16);
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println( "-----------------" );
		System.out.println( Integer.toBinaryString(result) );
		System.out.println( );
		
		int result4 = ~20;
		System.out.println(~20);
		System.out.println( Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println( "-----------------" );
		System.out.println( Integer.toBinaryString(result4) );
		System.out.println( );
		
		// int (4Byte) (32Byte)
		// 0000 0000 0000 0000 0000 0000 0001 0100
		// 1111 1111 1111 1111 1111 1111 1110 1011
		
		//최상위비트
		// 부호(+/-)가 있는 수의 경우는 최상위비트를 
		
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();
	
		System.out.println();
	System.out.println( 16>> 1);
	System.out.println( 16>> 2);
	System.out.println( 16>> 3);
	System.out.println( );
	
	System.out.println();
	System.out.println( -2 << 1);
	System.out.println( -2 << 2);
	System.out.println( -2 << 3);
	System.out.println();
	
	
	System.out.println();
	System.out.println( 2 >> 1);
	System.out.println( -2 >>> 31);
	System.out.println( Integer.toBinaryString(2));
	System.out.println( Integer.toBinaryString(-2));
	System.out.println();
	
	

}
}



