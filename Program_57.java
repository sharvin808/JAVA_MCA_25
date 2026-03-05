import java.io.*;

class Employee implements Serializable
{
    int empId;
    String name;
    transient double salary;   

    Employee(int empId, String name, double salary)
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Program_57
{
    public static void main(String args[]) throws Exception
    {
        Employee e1 = new Employee(101, "Sharvin", 50000);

        FileOutputStream fos = new FileOutputStream("emp.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e1);

        oos.close();
        fos.close();

        System.out.println("Object Serialized Successfully.\n");
        
        FileInputStream fis = new FileInputStream("emp.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e2 = (Employee) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Object De-Serialized Successfully.\n");

        e2.display();
    }
}