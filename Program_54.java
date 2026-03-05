import java.io.*;

class Student implements Serializable
{
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Program_54
{
    public static void main(String args[]) throws Exception
    {
        Student s1 = new Student(1, "Sharvin", 85.5);

        FileOutputStream fos = new FileOutputStream("student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

        System.out.println("Object Serialized Successfully.\n");

        FileInputStream fis = new FileInputStream("student.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Object De-Serialized Successfully.\n");

        s2.display();
    }
}