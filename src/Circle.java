
public class Circle
{
	private double radius;
	
	public Circle(double rad)
	{
		radius = rad;
	}
	
	public Circle()
	{
		radius = 0;
	}
	
	public void setRadius(double rad)
	{
		radius = rad;
	}
		
	public double getRadius()
	{
		return radius;
	}
	
	public double computeArea()
	{
		double areaRadius = getRadius();
		
		return (areaRadius * areaRadius) * Math.PI;
	}
}
