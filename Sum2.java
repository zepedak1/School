import java.util.Scanner;

public class Sum2
{
    public static int Sum(int one, int N)
    {
	int sum;
	while(one < N)
	    {
		sum = sum(1, N/2) + sum(N/2+1, N);
		one++;
	    }
	return sum;
	      
    }
    
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	int one = 1;
	int N = scan.nextInt();
	System.out.println(Sum(one, N));
    }
}