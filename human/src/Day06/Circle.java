package Day06;

public class Circle extends Shape {

	public Circle(double radius) {
		this.radius = radius;
		
	}
@Override
double area() {
	return Math.PI * radius * radius;
	
}

@Override
double round() {
	return 2 * Math.PI * radius;
	
	}
@Override
public String toString() {
	return "Circle [radius= " + radius +"]";
}

}


