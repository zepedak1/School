public class Rectangle
{
    double length;
    double width;
 
    public Rectangle()
    {
	length = 0;
	width = 0;
    }
    
    public Rectangle(double a, double b)
    {
	length = a;
	width = b;
    }
    
    public void setDimension(double a, double b)
    {
	length = a;
	width = b;
    }
    
    public double getLength()
    {
	return length;
    }
    
    public double getWidth()
    {
	return width;
    }

    public double area()
    {
	double area = length * width;
	return area;
    }
    
    public double perimeter()
    {
	double perimeter = (2 * length) + (2 * width);
	return perimeter;
    }

    public void print()
    {
	double area = area();
	double perimeter = perimeter();
	System.out.println("Area of rectangle is: " + area + " Perimeter of rectangle is: " + perimeter);    
    }
}