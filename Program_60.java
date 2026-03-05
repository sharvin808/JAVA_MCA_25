import java.awt.*;
import java.awt.event.*;

class Program_60 extends Frame implements ActionListener
{
    Checkbox java, python, cpp;
    Checkbox male, female;
    CheckboxGroup genderGroup;

    Button btn;
    Label result;

    Program_60()
    {
        setLayout(new FlowLayout());

        add(new Label("Select Languages:"));

        java = new Checkbox("Java");
        python = new Checkbox("Python");
        cpp = new Checkbox("C++");

        add(java);
        add(python);
        add(cpp);

        add(new Label("Select Gender:"));

        genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        add(male);
        add(female);

        btn = new Button("Submit");
        add(btn);

        result = new Label("Result will appear here", Label.LEFT);
        result.setPreferredSize(new Dimension(320, 30));
        add(result);

        btn.addActionListener(this);

        setSize(350, 250);
        setTitle("Checkbox and Radio Button Demo");
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
        String languages = "Languages: ";

        if(java.getState())
            languages += "Java ";

        if(python.getState())
            languages += "Python ";

        if(cpp.getState())
            languages += "C++ ";

        Checkbox selectedGender = genderGroup.getSelectedCheckbox();
        String gender = "Gender: ";

        if(selectedGender != null)
            gender += selectedGender.getLabel();
        else
            gender += "Not Selected";

        result.setText(languages + " | " + gender);
    }

    public static void main(String args[])
    {
        new Program_60();
    }
}