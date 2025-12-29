class Person 
{
    int id;

    Person(int id) 
    {
        this.id = id;
        System.out.println("Person constructor called");
    }
}

class Student extends Person 
{
    String name;

    Student(int id, String name) 
    {
        super(id); 
        this.name = name;
        System.out.println("Student constructor called");
    }
}

public class Program_17b {
    public static void main(String[] args) {
        Student s = new Student(1, "Sanjay");
    }
}
