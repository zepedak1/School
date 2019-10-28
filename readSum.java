import java.util.Scanner;

public class readSum
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner (System.in);
	double sum = 0.0;
	double average = 0.0;
	int n = 0;
	for(n = 0; n < 5; n++)
	    {
		int i = scan.nextInt();
		sum = i + sum;
	    }
	average = sum / 5;
	System.out.println("Sum is " + sum);
	System.out.println("Average is " + average);
    }
}