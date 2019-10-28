public class facultyAccount extends account
{
    protected double money;

    public facultyAccount(int number)
    {
	super(number);
    }

    public void deposit(double amount)
    {
	this.money = amount;
    }

    public void info()
    {
	System.out.println("From faculty account");
    }
}