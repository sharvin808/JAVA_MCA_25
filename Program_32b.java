class SharedData
{
    int readers = 0;
    boolean writing = false;

    synchronized void read(String name)
    {
        try
        {
            while (writing)
                wait();

            readers++;
            System.out.println(name + " is reading...");
            Thread.sleep(500);

            readers--;
            if (readers == 0)
                notifyAll();
        }
        catch (Exception e) {}
    }

    synchronized void write(String name)
    {
        try
        {
            while (readers > 0 || writing)
                wait();

            writing = true;
            System.out.println(name + " is writing...");
            Thread.sleep(500);

            writing = false;
            notifyAll();
        }
        catch (Exception e) {}
    }
}

class Reader extends Thread
{
    SharedData d;
    String name;

    Reader(SharedData d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.read(name);
    }
}

class Writer extends Thread
{
    SharedData d;
    String name;

    Writer(SharedData d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.write(name);
    }
}

public class Program_32b
{
    public static void main(String args[])
    {
        SharedData d = new SharedData();

        Reader r1 = new Reader(d, "Reader 1");
        Reader r2 = new Reader(d, "Reader 2");
        Writer w1 = new Writer(d, "Writer 1");

        r1.start();
        r2.start();
        w1.start();
    }
}
