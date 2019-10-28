import java.util.Scanner;

public class intArray
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = 0;
	int min = 0;
        int i = 0;
	final int num = 5;
        int [] N = new int[num];
        for(i = 0; i < num; i++)
	    {
		N[i] = scan.nextInt();
		if(N[i] > max)
		    {
			max = N[i];
		    }
		if(N[i] <= N[0])
		   {
		       min = N[i];
		   }
	    }
        System.out.println(max);
	System.out.println(min);
    }
}