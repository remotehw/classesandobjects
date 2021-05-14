
public class ClassesAndObjects {

	public static void main(String[] args) {
	
		Rectangle rect1 = new Rectangle(4.0, 5.0);
		
		Rectangle rect2 = new Rectangle();
		rect2.setLength(5.7);
		rect2.setWidth(8.1);
		
		Circle circle1 = new Circle(3.2);
		
		Circle circle2 = new Circle();
		circle2.setRadius(4.0);
		
		System.out.println("The area of the first rectangle is: " + rect1.computeArea());	
		System.out.println("The area of the second rectangle is: " + rect2.computeArea());
		System.out.println("The area of the first circle is: " + circle1.computeArea());
		System.out.println("The area of the second circle is: " + circle2.computeArea());

	}

}
