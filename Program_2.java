import java.io.*;

class Program_2 
{
    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Operations: 1.Add  2.Sub  3.Mul  4.Div");
        }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int op = Integer.parseInt(args[2]);
            int a;

            switch (op) {
                case 1:
                    a = n1 + n2;
                    System.out.println("Sum = " + a);
                    break;

                case 2:
                    a = n1 - n2;
                    System.out.println("Subtraction = " + a);
                    break;

                case 3:
                    a = n1 * n2;
                    System.out.println("Multiplication = " + a);
                    break;

                case 4:
                    if (n2 == 0) {
                        System.out.println("Error: Division by zero not allowed.");
                    }
                    a = n1 / n2;
                    System.out.println("Division = " + a);
                    break;

                default:
                    System.out.println("Invalid choice! Choose between 1 and 4.");
                    break;
            }
    }
}
