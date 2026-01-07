class Printer
{
    public void print(String doc)
    {
        System.out.println("Printing started "+doc);
        for(int i =1; i <= 5;i++)
        {
            System.out.println(doc+" -page "+i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
        System.out.println("Printing finished: "+doc);
    }
}
class PrintJob extends Thread
{
    Printer printer;
    String doc;
    PrintJob(Printer printer, String doc)
    {
        this.printer = printer;
        this.doc = doc;
    }
    public void run()
    {
        printer.print(doc);
    }
}
public class Program_30 
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
