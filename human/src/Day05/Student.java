package Day05;

public class Student extends Person{
 int grade;
 String major;
 
 public Student(int grade, String major) {
	 super();
	 this.grade = grade;
	 this.major = major;
 }
 Public Student(){
	 this(" 이름없음", 0, 0, "없음");
	 
 }

@Override
public String toString() {
	return "Student [grade=" + grade + ", major=" + major + "]";
}
}