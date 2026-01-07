class BankAccount
{
    private int balance = 1000;  
    synchronized void withdraw(String user, int amount)
    {
        System.out.println(user + " is trying to withdraw " + amount);

        if (balance >= amount)
        {
            System.out.println(user + " withdrawal in progress...");

            try
            {
                Thread.sleep(500); 
            }
            catch (Exception e) {}

            balance = balance - amount;
            System.out.println(user + " completed withdrawal. Balance = " + balance);
        }
        else
        {
            System.out.println(user + " insufficient balance. Balance = " + balance);
        }
    }
}

class ATMUser extends Thread
{
    BankAccount account;
    String user;
    int amount;

    ATMUser(BankAccount account, String user, int amount)
    {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    public void run()
    {
        account.withdraw(user, amount);
    }
}

public class Program_35
{
    public static void main(String args[])
    {
        BankAccount account = new BankAccount(); 

        ATMUser u1 = new ATMUser(account, "User-1", 700);
        ATMUser u2 = new ATMUser(account, "User-2", 500);
        ATMUser u3 = new ATMUser(account, "User-3", 300);

        u1.start();
        u2.start();
        u3.start();
    }
}
