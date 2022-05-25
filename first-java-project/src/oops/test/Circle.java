package oops.test;

public class Circle {

	private double radius;
	
	Circle()
	{
		System.out.println("This is the default constructor");
	}	
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	
	public double getCircumference()
	{
		return 2*Math.PI*this.radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


	public static void main(String[] args) {
		
		Circle ob1=new Circle(20);
		System.out.println(ob1.getArea());
		System.out.println(ob1.getCircumference());
		System.out.println(ob1);
	

	}

}
