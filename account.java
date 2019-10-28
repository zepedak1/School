public abstract class account
{
    private int accountNumber;
    protected double accountBalance;

    public account(int number)
    {
	this.accountNumber = number;
	this.accountBalance = 0;
    }
    
    public int getAccountNumber()
    {
	return accountNumber;
    }

    protected abstract void deposit(double amount);
}