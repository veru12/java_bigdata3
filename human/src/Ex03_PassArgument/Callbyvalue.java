package Ex03_PassArgument;

import java.util.Iterator;

import Day04.Class.Pikachu;

public class Callbyvalue {
 public static int sum(int a, int b) {
	 a= 100;
	 b= 200;
	 
	 System.out.println("******** sum 메소드 **********");
	 System.out.println("(a,b): "+ a +","+b+"");
	 int sum = a+b;
	 return sum;
	 
     public static void main(String[] args) {
    	 int a= 10;
    	 int b = 20;
    	 System.out.println("****** main 메소드 *********");
    	 System.out.println("(a,b): "+a+", "+b+"");
    	 
    	 int sum = sum(a,b);
    	 System.out.println("sum:"+sum);
    	 
    	 System.out.println("****sum 메소드 호출 후 *****");
    	 System.out.println("(a,b):"+a+","+b+")");
    	 
    	 public static void set0bj(Pikachu pikachu) {
    		 pikachu.energy = 1000;
    		 pikachu.type ="fire";
    		System.out.println("********* set0bj 메소드 ****");
    		 
    		System.out.println("pikachu");
    		System.out.println("");
    		
    		public static void set0bj(Pikachu pikachu) {
    			int[] arr= new int[5];
    			Pikachu pikachu = new Pikachu();
    			pikachu.energy = 100;
    			pikachu.type ="전기";
    			
    		for (int i =0; i<arr.length; i++) {
    			
    			arr[1] =i+1;
    			
    			System.out.println("***main 메소드 ***");
    			for (int j = 0; j < arr.length; j++) {
					System.out.println("arr["+ i +"]: "+arr[i]);;
			
    			System.out.println(pikachu);
    			
    			setArr(arr);
    			set0bj(pikachu);
    			
    			
    			
    			}
    			
				
			}
				
			}
    		
    		
    	 }
     }

 }
}
