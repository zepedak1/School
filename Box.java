public class Box extends Rectangle 
{
    double height;
    
    public Box()
    {
	height = 0;
    }
    
    public Box(double a, double b, double c)
    {
	super(a,b);
	height = c;
    }
    
    public double getHeight()
    {
	return height;
    }
    
    public double area()
    {
	double area = (2 * length * width) + (2 * length * height) + (2 * width * height);
	return area;
    }
    
    public double volume()
    {
	double volume = length * width * height;
	return volume;
    }
    
    public void print()
    {
	double area = area();
	double volume  = volume();
	System.out.println("Area of Box is: " + area + " Volume of Box is " + volume);
    }
}
