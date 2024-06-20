import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FDemo extends JFrame {
    Demo dm1;
    
    FDemo() {
        super.setTitle("Quiz-Application");
        dm1 = new Demo();
        add(dm1);
    }
}

class Demo extends JPanel implements ActionListener {
    ImageIcon img1, img3;
    Image login, score;

    JLabel heading1;
    JLabel heading2;

    JTextField tx1;

    JButton b1, b2;

    Demo() {
        img1 = new ImageIcon("login.jpeg");
        img3 = new ImageIcon("score.png");
        login = img1.getImage();
        score = img3.getImage();

        heading1 = new JLabel("Simple Minds");
        heading1.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading1.setBounds(750, 60, 300, 45);
        heading1.setForeground(new Color(30, 144, 254));
        add(heading1);

        heading2 = new JLabel("Enter your name");
        heading2.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        heading2.setBounds(810, 150, 300, 20);
        heading2.setForeground(new Color(30, 144, 254));
        add(heading2);

        tx1 = new JTextField();
        tx1.setBounds(735, 200, 300, 25);
        tx1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tx1);

        b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Reset");
        b2.setBounds(915, 270, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        g.drawImage(login, 0, 0, 600, 500, this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String name = tx1.getText();
            setVisible(false);
            FDemo1 f1 = new FDemo1(name);
            f1.setSize(1200, 500);
            f1.setLocation(200, 150);
            f1.setVisible(true);
            f1.setLayout(null);
            f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        } else if (e.getSource() == b2) {
            tx1.setText("");
        }
    }
}

class Quiz {
    public static void main(String[] args) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setLocation(200, 150);
        f.setSize(1200, 500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}