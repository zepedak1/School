
import java.util.Scanner;

public class Kennel
{

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	int age = scan.nextInt();
	Dog dog1 = new Dog(name, age);
	System.out.println(dog1);
	scan = new Scanner(System.in);
	name = scan.nextLine();
	age = scan.nextInt();
	Dog dog2 = new Dog(name, age);
	System.out.println(dog2);
	System.out.println("dog1 age:" + dog1.getAge() + " dog1 name:" + dog1.getName());
	System.out.println("dog2 age:" + dog2.getAge() + " dog2 name:" + dog2.getName());
    }
}
	