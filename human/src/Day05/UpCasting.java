package Day05;

import Day04.Ex04_Board.Main;

public class UpCasting {
public static void main(String[] args) {
	
	
	Person person = new Student("김창윤", 25,1, "반도체시스템과") {
	//PERSON : name, age
	// Stundent : name, age, grade, major

		System.out.println("name:"+ person.name);
		
		System.out.println("age:"+ person.age);
	} 
	System.out.println(person);
	System.out.println(person.work());
	

}

} 