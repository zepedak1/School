public class Dog
{
    private String name;
    private int age;

    //implement the following constructor
    public Dog(String a, int b)
    {
	this.name = a;
	this.age = b * 7;
    }
    
    //implement the following getter
    public String getName()
    {
	return name;
    }

    //implement the following getter
    public int getAge()
    {
	return age;
    }

    //implement the following setter
    public void setName(String newName)
    {
	name = name;
    }

    //implement the following setter
    public void setAge(int newAge)
    {
	age = newAge * 7;
    }
    public String toString()
    {
	return "age:" + this.age + ", " + "name: " + this.name;
    }
}