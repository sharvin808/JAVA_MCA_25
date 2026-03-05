import java.awt.*;
import java.awt.event.*;

class Program_61 extends Frame implements ActionListener
{
    MenuBar mb;
    Menu file, edit;
    MenuItem newItem, openItem, exitItem;
    MenuItem cutItem, copyItem, pasteItem;
    CheckboxMenuItem statusBar;
    Label result;

    Program_61()
    {
        mb = new MenuBar();

        file = new Menu("File");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");

        file.add(newItem);
        file.add(openItem);
        file.addSeparator();   
        file.add(exitItem);

        edit = new Menu("Edit");

        cutItem = new MenuItem("Cut");
        copyItem = new MenuItem("Copy");
        pasteItem = new MenuItem("Paste");

        statusBar = new CheckboxMenuItem("Show Status Bar");

        edit.add(cutItem);
        edit.add(copyItem);
        edit.add(pasteItem);
        edit.addSeparator();
        edit.add(statusBar);

        mb.add(file);
        mb.add(edit);

        setMenuBar(mb);

        result = new Label("Select a menu item");
        result.setPreferredSize(new Dimension(300, 30));
        add(result);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        statusBar.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e)
            {
                if(statusBar.getState())
                    result.setText("Status Bar Enabled");
                else
                    result.setText("Status Bar Disabled");
            }
        });

        setSize(400, 300);
        setTitle("AWT Menu Demo");
        setLayout(new FlowLayout());
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
        String command = e.getActionCommand();

        if(command.equals("Exit"))
            System.exit(0);

        result.setText(command + " Selected");
    }

    public static void main(String args[])
    {
        new Program_61();
    }
}