public class Bits
{
     public static void main(String[] args)
     {
	 int N = Integer.parseInt(args[0]);
	 if(N < 0)
	     {
		 System.out.println("Illegal input");
	     }
	 if(N >= 0)
	     {
		int count = 1;
		 while(N > 1)
		     {
			 N = N / 2;
			 count++;
		     }
		 System.out.println(count);
	     }
     }
}
