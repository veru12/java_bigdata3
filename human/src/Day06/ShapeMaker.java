package Day06;

import java.util.List;
import java.util.Scanner;

public class ShapeMaker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Shape shape = null;
	double width = 0.0;
	double height = 0.0;
	double radius = 0.0;
	
	double roundSum = 0.0;
	double areaSum = 0.0;

	
	List<Shape> list = new LinkedLIst<Shape>();
	System.out.println(">>");
	String input = sc.next();
	
	if (input.equals("그만")) break ;
	int menuNo = Integer.parseInt(input);
	
	switch (menuNo) {
	case 1 : System.out.println("가로>>");
	width = sc.nextDouble();
	 System.out.println("높이>>");
	width = sc.nextDouble();
	shape = new Triangle(width, height);
	list.add(shape);
	break;
	
	case 2 : System.out.println("가로>>");
	width = sc.nextDouble();
	System.out.println("높이>>");
	width = sc.nextDouble();
	shape = new Rectangle(width, height);
	list.add(shape);
	break;
		
	case 3 : System.out.println("반지름>>");
	width = sc.nextDouble();
	shape = new Circle(radius);
	list.add(shape);
	break;
	
for (Shape s : list) {
	if (s instanceof Triangle) 
		System.out.println("[삼각형]"); {
		
			if (s instanceof Rectangle) 
				System.out.println("[사각형]"); {
	}
				if (s instanceof Circle) 
					System.out.println("[원형]"); {
						
					default:
						break;
						
						double area = s.area();
						double round = s.round();
						
						roundSum = roundSum + round;
						areaSum = areaSum + area;
						
						System.out.println("넓이 :"+ area +"\t");
						System.out.println("둘레 :"+ round +"\t");
				System.out.println();
					}
					
	System.out.println("둘레 총합:"+roundSum);
	System.out.println("넓이 총합:"+areaSum);
	
	sc.close();

	
		
	}
	
			


