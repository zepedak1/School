import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	double length = scan.nextDouble();
	double width = scan.nextDouble();
	double height = scan.nextDouble();
	Rectangle rectangle1 = new Rectangle(length, width);
	Box box1 = new Box(length, width, height);
	rectangle1.print();
	box1.print();
    }
}
