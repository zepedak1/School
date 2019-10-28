public class test
{
    public static void main(String[] args)
    {
	account[] accountList;
	accountList = new account[10];
	facultyAccount faculty = new facultyAccount(0);
	studentAccount student = new studentAccount(0);
	accountList[0] = faculty;
	accountList[1] = student;
	accountList[0].deposit(20);
	accountList[1].deposit(25);
	if (accountList[0] instanceof facultyAccount)
	    {
		((facultyAccount)accountList[0]).info();
	    }
	if (accountList[1] instanceof studentAccount)
	    {
		((studentAccount)accountList[1]).info();
	    }
    }
}