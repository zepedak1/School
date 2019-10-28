public class Factors4
{
    public static void main(String[] args) 
    {
	long N = Long.parseLong(args[0] );
	int limit = 0;
	int x = 0;
	for (int i = 2; i * i <= N; i++)
	    {
		while (N % i == 0)
		    {
			if(x != i)
			    {
				System.out.print(i + " ");
				N = N / i;
			    }
			if(x == i)
			    {
				N = N / i;
			    }
			x = i;
		    }
	   }
	if (N > 1) System.out.println(N);
	else System.out.println();
    }
}