import java.io.*;

class Person implements Serializable
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person
{
    int rollNo;
    double marks;

    Student(String name, int age, int rollNo, double marks)
    {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
class Program_55
{
    public static void main(String args[]) throws Exception
    {
        Student s1 = new Student("Sharvin", 21, 101, 88.5);

        FileOutputStream fos = new FileOutputStream("studentISA.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

        System.out.println("Object Serialized Successfully.\n");

        FileInputStream fis = new FileInputStream("studentISA.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Object De-Serialized Successfully.\n");

        s2.display();
    }
}