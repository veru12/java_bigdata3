package Day05;

import Day04.Ex04_Board.Main;

public class Instanceof {
 class ItPerson {}
 class planner extends ItPerson {}
 class Designer extends ItPerson {}
 class Developer extends ItPerson {}
 
 public class Instanceof {
	 public static void checkInstance(ItPerson itPerson) {
	
		if ( itPerson instanceof Planner )
		System.out.println("기획자입니다!");
		if (itPerson instanceof Designer )
		System.out.println("디자이너입니다!");
		if ( itPerson instanceof Developer )
		System.out.println("개발자입니다!");

		 
	 
 } 
public static void main(String[] args) {
	System.out.println("어떤 직무를 하고 계신가요?");
	System.out.println("new Planner()");
	System.out.println("new Designer()");
	System.out.println("new Developer()");

}

 }
 
}
