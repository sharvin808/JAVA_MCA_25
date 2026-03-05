import java.io.*;
class Address implements Serializable
{
    String city;
    String state;

    Address(String city, String state)
    {
        this.city = city;
        this.state = state;
    }
}
class Student implements Serializable
{
    int rollNo;
    String name;
    Address addr;   // HAS-A relationship

    Student(int rollNo, String name, Address addr)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.addr = addr;
    }

    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("City: " + addr.city);
        System.out.println("State: " + addr.state);
    }
}
class Program_56
{
    public static void main(String args[]) throws Exception
    {

        Address a1 = new Address("Bangalore", "Karnataka");

        Student s1 = new Student(101, "Sharvin", a1);

        FileOutputStream fos = new FileOutputStream("studentHAS.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

        System.out.println("Object Serialized Successfully.\n");

        FileInputStream fis = new FileInputStream("studentHAS.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Object De-Serialized Successfully.\n");

        s2.display();
    }
}