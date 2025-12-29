class Vehicle 
{
    public void speed() 
    {
        System.out.println("Vehicle speed is 80 kmph");
    }
}

class Car extends Vehicle 
{
    public void speed() 
    {
        super.speed();  
        System.out.println("Car speed is 120 kmph");
    }
}

public class Program_17a 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.speed();
    }
}
