package Day02;

public class Ex03RosicalOperator {

	public static void main(String[] args) {
		
		// 논리 연산자
		// AND (&&)
		//A AND B : A와 B 둘 다 true 일 때, 결과가 True
		// A 	B 	결과
		// --------------
		// F	F  F
		// T 	F  F
		// F 	T  F
		// T 	T  T
		System.out.println(true && true );
		System.out.println( true && false );
		
		 
		 
		 System.out.println(true || true );
		 System.out.println(true || false );
		 System.out.println(false || (100 < 50));
		 System.out.println(( 5 < 20 ) || (5 > 2));
		 System.out.println();
		 
		 System.out.println(true ^ true);
		 System.out.println(true ^ false);
		 System.out.println(( 9 >= 2 ) ^ (7 > 4));
		 System.out.println();
		 
		 System.out.println(!true);
		 System.out.println(!false);
		 System.out.println(" ( 9 >= 2 ) ^ (7 ^ 4)");
		 System.out.println();
		 
		 
		 System.out.println(!true);
		 System.out.println(!false);
		 System.out.println();
		 
		 int value1 = 3;
		 System.out.println(false && ++ value1 > 10);
		 System.out.println(value1);
		 
		 int value2 = 3;
		  System.out.println(true || ++value2 > 5);
		  System.out.println(value2);
		  
		  int value3 = 3;
		  System.out.println(false & ++value3 >6);
		  System.out.println(value3);
		  
		  int value4 = 3;
		  System.out.println(true & ++value4 >2);
		  System.out.println(value4);
		  
		  
		 

	}
}
