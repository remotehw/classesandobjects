
public class Rectangle
{
	private double length;
	private double width;
	
	public Rectangle(double len, double wide)
	{
		length = len;
		width = wide;
	}
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public void setLength(double len)
	{
		length = len;
	}
	
	public void setWidth(double wide)
	{
		width = wide;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
		
	public double computeArea()
	{
		double areaLength = getLength();
		double areaWidth = getWidth();
		
		return areaLength * areaWidth;
	}
}
