package Day06;

public class Rectangle extends Shape{
double width, height;

public Rectagle(double width, double height) {
	this.width = width;
	this.height = height;
	
	
}

@Override
double area() {
	return width * height;
}

@Override
double round() {
	return width * 4;
}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}









}






