public class Ordered
{
    public static void main(String[] args)
    {
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	if(x >= y && y >= z || x <= y && y <= z)
	    {
		boolean isSatisfied = true;
		System.out.println(isSatisfied);
	    }
	else
	    {
	        boolean isSatisfied = false;
		System.out.println(isSatisfied);
	    }
    }
}
