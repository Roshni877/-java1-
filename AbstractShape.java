package pkg2;
abstract class Shape1{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle1 extends Shape1{
	private double radius;
	public Circle1(double radius) {
		this.radius=radius;
	}
	@Override
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	@Override
	double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
}
public class AbstractShape {

	public static void main(String[] args) {
		System.out.println("Abstract Shapes");
		Circle1 c1=new Circle1(5.0);
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculatePerimeter());
		

	}

}