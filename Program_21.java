/*Write a program using multiple catch statements / predefined Exceptions.*/

public class Program_21 
{
    public static void main(String args[])
    {
        try
        {
            int a = 10;
            int div = a / 0;
            int [] arr = {10,20,30,40,50};
            System.out.println(""+arr[6]);
            String str = "23kg";
            int in = Integer.parseInt(str);
        }
        catch(ArithmeticException arth)
        {
            System.out.println("Numbers can't be divided using zero..."+arth);
        }
        catch(ArrayIndexOutOfBoundsException arr)
        {
            System.out.println("Index is out of bound.."+arr);
        }
        catch(NumberFormatException num)
        {
            System.out.println("Trying to convert into integer..."+num);
        }

    }
}
