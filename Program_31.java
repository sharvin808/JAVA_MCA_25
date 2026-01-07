
class Printer
{
    synchronized public void print(String document)
    {
        System.out.println("Printing started: " + document);

        for(int i = 1; i <= 5; i++)
        {
            System.out.println(document + " - page " + i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e) {}
        }

        System.out.println("Printing finished: " + document);
    }
}
class PrintJob extends Thread
{
    Printer printer;
    String document;

    PrintJob(Printer printer, String document)
    {
        this.printer = printer;
        this.document = document;
    }

    public void run()
    {
        printer.print(document);
    }
}
public class Program_31
{
    public static void main(String args[])
    {
        Printer printer = new Printer(); 

        PrintJob job1 = new PrintJob(printer, "Document_A");
        PrintJob job2 = new PrintJob(printer, "Document_B");
        PrintJob job3 = new PrintJob(printer, "Document_C");

        job1.start();
        job2.start();
        job3.start();
    }
}
