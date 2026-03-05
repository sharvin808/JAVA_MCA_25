import java.awt.*;
import java.awt.event.*;

class Program_59 extends Frame implements ActionListener
{
    List list;
    TextField txt;
    Button addBtn, removeBtn, removeAllBtn, showBtn;
    Label result;

    Program_59()
    {
        setLayout(new FlowLayout());

        // Create List (true = multiple selection allowed)
        list = new List(5, true);

        // Default items
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");

        txt = new TextField(15);

        addBtn = new Button("Add Item");
        removeBtn = new Button("Remove Selected");
        removeAllBtn = new Button("Remove All");
        showBtn = new Button("Show Selected");

        result = new Label("Selected items will appear here");

        // Add components
        add(new Label("Enter Item:"));
        add(txt);
        add(addBtn);
        add(removeBtn);
        add(removeAllBtn);
        add(showBtn);
        add(list);
        add(result);

        // Add Action Listeners
        addBtn.addActionListener(this);
        removeBtn.addActionListener(this);
        removeAllBtn.addActionListener(this);
        showBtn.addActionListener(this);

        // Window settings
        setSize(400, 300);
        setTitle("AWT List Control Demo");
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addBtn)
        {
            String item = txt.getText();
            if(!item.isEmpty())
            {
                list.add(item);
                txt.setText("");
            }
        }

        else if(e.getSource() == removeBtn)
        {
            int[] selected = list.getSelectedIndexes();
            for(int i = selected.length - 1; i >= 0; i--)
            {
                list.remove(selected[i]);
            }
        }

        else if(e.getSource() == removeAllBtn)
        {
            list.removeAll();
        }

        else if(e.getSource() == showBtn)
        {
            String[] items = list.getSelectedItems();
            String output = "Selected: ";
            for(String s : items)
            {
                output += s + " ";
            }
            result.setText(output);
        }
    }

    public static void main(String args[])
    {
        new Program_59();
    }
}