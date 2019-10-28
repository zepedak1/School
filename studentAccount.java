public class studentAccount extends account
{
    protected double money; 

    public studentAccount(int number)
    {
	super(number);
    }
    
    public void deposit(double amount)
    {
	this.money = amount;
    }

    public void info()
    {
	System.out.println("From student account");
    }
}