    import java.util.Scanner;

    class employee
    {
        int eno;
        String ename;
        double esal;
        public void read()
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the employee number:");
            eno = s.nextInt();
            s.nextLine();
            System.out.println("Enter the employees name:");
            ename = s.nextLine();
            System.out.println("Enter the employees salary:");
            esal = s.nextDouble();

        }
        public void display()
        {
            System.out.println("Employee number:"+eno);
            System.out.println("Employee name:"+ename);
            System.out.println("Employee salary:"+esal);
        }
        public boolean compare(int empno)
        {
            return this.eno == empno;
        }
    }
    public class Program_18 
    {
        public static void main(String args[])
        {
            int n,i,empno;
            boolean found = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of employees:");
            n = sc.nextInt();
            employee[] emp = new employee[n];
            System.out.println("Enter the datas into the employee");
            for(i = 0; i < n; i++)
            {
                emp[i] = new employee();
                emp[i].read();

            }
            System.out.println("Display the employee details");
            for(i = 0; i < n; i++)
            {
                emp[i].display();

            }
            System.out.println("Enter the employee number that needs to search:");
            empno = sc.nextInt();
            for(i = 0; i < n; i++)
            {
                if(emp[i].compare(empno))
                {
                    System.out.println("Employee found:\n");
                    found = true;
                    emp[i].display();
                    break;
                }
            }
            if(found!=true)
            {
                System.out.println("Employee not found");
            }

        }
    }
