package Day06;
// Shape 클래스를 구현하시오.
// Shape 클래스를 상속받아 추상메소드를 오버라이딩 하시오.
public class Triangle extends Shape{

	double width, height;
	
	@Override
	double area () {
		return width * height /2;
	}	
		@Override
		double round () {
			return width * height /3;
		}
		@Override
		public String toString() {
			return "Triangle [width=" + width + ", height=" + height + "]";
		}	
			
	

	
	
		
	}
	
	
 
	

