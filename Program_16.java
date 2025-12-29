/*Program to overcome function overriding in Java.  */

class Vehicle
{
	public final void speed()
	{
		System.out.println("The vehicles maximum speed is 80kmph");
	}
}
class Car extends Vehicle
{
	public void carspeed()
	{
		System.out.println("The vehicles maximum speed is 120kmph");
	}
}
class Program_16
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.speed();
        c.carspeed();
	}
}