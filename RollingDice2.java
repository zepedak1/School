public class RollingDice2
{
    public static void main(String[] args)
    {
	PairOfDice GetSome = new PairOfDice();
	System.out.println(GetSome.getSum());
	GetSome.roll();
	System.out.println(GetSome.getSum());
    }
}