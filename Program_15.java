/*Program to implement the ISA and HASA relationship. */

class Person
{
	public void showPerson()
	{
		System.out.println("Inside Person");
	}
}
class Student extends Person
{
	public void showStudent()
	{
		System.out.println("Inside Student");
	}	
}
class Engine
{
	public void start()
	{
		System.out.println("Inside Engine");
	}
}
class Car
{
	Engine e = new Engine();
	public void drive()
	{
		e.start();
		System.out.println("Inside car");
	}
}
public class Program_15
{
	public static void main(String args[])
	{
		Student st = new Student();
		st.showPerson();
		st.showStudent();
		Car c = new Car();
		c.drive();	
	}
}