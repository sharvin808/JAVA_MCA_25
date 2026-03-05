import java.awt.*;
import java.awt.event.*;

class Program_58 extends Frame implements ActionListener
{
    TextField t1, t2, t3;
    Label result;
    Button btn;

    Program_58()
    {
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        btn = new Button("Find Maximum");

        result = new Label("Result will be shown here");

        add(new Label("Enter First Number:"));
        add(t1);

        add(new Label("Enter Second Number:"));
        add(t2);

        add(new Label("Enter Third Number:"));
        add(t3);

        add(btn);
        add(result);

        btn.addActionListener(this);

        setSize(350, 250);
        setTitle("Maximum Finder");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = n1;

            if(n2 > max)
                max = n2;

            if(n3 > max)
                max = n3;

            result.setText("Maximum is: " + max);
        }
        catch(Exception ex)
        {
            result.setText("Please enter valid numbers");
        }
    }

    public static void main(String args[])
    {
        new Program_58();
    }
}