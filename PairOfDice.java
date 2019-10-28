public class PairOfDice
{
    private Die die1;
    private Die die2;
    
    public PairOfDice()
    {
	die1 = new Die();
	die2 = new Die();
    }
    public int getDie1()
    {
	return die1.getFaceValue();
    }
    public int getDie2()
    {
	return die2.getFaceValue();
    }
    public void roll()
    {
	die1.roll();
	die2.roll();
    }
    public void setDie1(int die)
    {
	die1.setFaceValue(die);
    }
    public void setDie2(int die)
    {
	die2.setFaceValue(die);
    }
    public int getSum()
    {
	return die1.getFaceValue() + die2.getFaceValue();
    }
}