import java.util.Scanner;

public class Sum
{
    public static int Sum(int N)
    {
	if(N == 1)
	    {
		return N;
	    }
	if(N > 1)
	    {
		return Sum(N - 1) + N;
	    }
	else
	    {
		return 0;
	    }
    }

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	System.out.println(Sum(N));
    }
}