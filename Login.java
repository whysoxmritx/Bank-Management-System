import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login {
    public static void main(String[] args){
        JFrame f=new JFrame("LOGIN");
        f.setSize(500,600);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpeg");
        Image img = ig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel logo = new JLabel(scaledIcon);
        logo.setBounds(200, 40, 80, 80);
        f.setIconImage(ig.getImage());
        f.add(logo);
        Font tf=new Font(Font.MONOSPACED,1,17);
        JLabel text=new JLabel("Welcome to the Bank");
        text.setForeground(Color.white);
        text.setFont(tf);
        f.add(text);
        text.setBounds(150,130,300,50);
        JLabel user=new JLabel("User Name");
        JLabel pass=new JLabel("Password");
        JTextField userText=new JTextField();
        JPasswordField passText=new JPasswordField();
        JButton login=new JButton("Login");
        JButton sign=new JButton("Sign up");
        passText.setEchoChar('*');
        user.setFont(tf);
        user.setForeground(Color.white);
        pass.setFont(tf);
        pass.setForeground(Color.white);
        f.add(user);
        f.add(pass);
        f.add(userText);
        f.add(passText);
        f.add(login);
        f.add(sign);
        sign.setBounds(130,330,100,40);
        user.setBounds(100, 200, 100, 30);
        userText.setBounds(220, 200, 150, 30);
        pass.setBounds(100, 260, 100, 30);
        passText.setBounds(220, 260, 150, 30);
        login.setBounds(250, 330, 100, 40);
        JLabel forgot=new JLabel("Forgot Password?");
        f.add(forgot);
        forgot.setForeground(new Color(180,150,255));
        forgot.setBounds(270,295,150,20);
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton balance=new JButton("Balance Enquiry");
        f.add(balance);
        balance.setBounds(165,400,150,40);
        login.addActionListener(e -> {
            String uname = userText.getText();
            String pwd = passText.getText();

            if (uname.isEmpty() || pwd.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Please fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (uname.equals("Akshat") && pwd.equals("1234")) {
                JOptionPane.showMessageDialog(f, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(f, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        JLabel terms=new JLabel("By clicking on 'Login' you accept that you have read out");
        f.add(terms);
        terms.setForeground(Color.lightGray);
        terms.setFont(new Font(Font.SANS_SERIF,2,12));
        terms.setBounds(100,450,320,30);
        JLabel conditions=new JLabel("Terms & conditions.");
        f.add(conditions);
        conditions.setForeground(Color.lightGray);
        conditions.setFont(new Font(Font.SANS_SERIF,2,12));
        conditions.setBounds(185,465,200,30);
        f.setVisible(true);
    }
}

