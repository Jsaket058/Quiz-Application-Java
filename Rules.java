import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FDemo1 extends JFrame {
    Demo1 dm;

    FDemo1(String name) {
        super.setTitle("Rules");
        dm = new Demo1(name);
        add(dm);
    }
}

class Demo1 extends JPanel implements ActionListener {
    JLabel heading11;
    JLabel rules;

    JButton b11, b21;

    Demo1(String name) {
        heading11 = new JLabel("Welcome " + name + " to Simple Minds");
        heading11.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading11.setBounds(50, 20, 700, 40);
        heading11.setForeground(new Color(30, 144, 254));
        add(heading11);

        rules = new JLabel();
        rules.setBounds(20, 95, 730, 320);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. We are trained to be a programmer and not a story teller, answer point to point"
                        + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer"
                        + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                        +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di"
                        + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"

        );
        add(rules);

        b11 = new JButton("Back");
        b11.setBounds(520, 400, 120, 30);
        b11.setBackground(new Color(30, 144, 254));
        b11.setForeground(Color.WHITE);
        b11.addActionListener(this);
        add(b11);

        b21 = new JButton("Start");
        b21.setBounds(20, 400, 120, 30);
        b21.setBackground(new Color(30, 144, 254));
        b21.setForeground(Color.WHITE);
        b21.addActionListener(this);
        add(b21);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b11) {
            setVisible(false);
            FDemo f = new FDemo();
            f.setVisible(true);
            f.setLocation(200, 150);
            f.setSize(1200, 500);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        }

        else if (ae.getSource() == b21) {

        }
    }
}

class Rules {
    public static void main(String[] args) {
        FDemo1 f1 = new FDemo1("name");
        f1.setSize(1200, 500);
        f1.setLocation(200, 150);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
}