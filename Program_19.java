interface Vehicles
{
    void speed();
}
class cars implements Vehicles
{
    public void speed()
    {
        System.out.println("Cars maximum speed in highways are 80kmph");
    }
}
class bikes implements Vehicles
{
    public void speed()
    {
        System.out.println("Bikes maximum speed in highways are 60kmph");
    }
}
public class Program_19 
{
    public static void main(String args[])
    {
        Vehicles v;
        v = new cars();
        v.speed();
        v = new bikes();
        v.speed();

    }    
}
