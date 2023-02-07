package Day05;


public class DownCasting {
public static void main(String[] args) {
	
	
	Person person = new Student("김창윤",25,1,"반도체시스템과");

	
	System.out.println("person");
	System.out.println("person.work");
	
	Student student= (Student)person;
	
	System.out.println(student.grade);
	System.out.println(student.major);
}
}

