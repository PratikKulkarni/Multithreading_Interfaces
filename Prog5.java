package neebalgurukul.day11;

interface Shape{
	double getArea();
	double getPerimeter();
}

class Rectangle implements Shape{
	private double length;
	private double breadth;
	Rectangle(int l, int b){
		this.length=l;
		this.breadth=b;
	}
	public double getArea() {
		return length*breadth;
	}
	public double getPerimeter() {
		return 2*(length+breadth);
	}
}

class Square implements Shape{
	private double side;
	Square(int s){
		this.side=s;
	}
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}
}

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5,10);
		Square s=new Square(8);
		System.out.println("The area of the rectangle is "+r.getArea());
		System.out.println("The area of the square is "+s.getArea());
	}

}
