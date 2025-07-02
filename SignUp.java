import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SignUp {
    public SignUp(){
        JFrame s=new JFrame("Sign Up");
        s.setSize(500,600);
        s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
        s.setLayout(null);
        s.setLocationRelativeTo(null);
        s.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpeg");
        s.setIconImage(ig.getImage());
        JLabel welcome=new JLabel("Welcome New User");
        s.add(welcome);
        welcome.setForeground(new Color(102,153,255));
        welcome.setFont(new Font(Font.DIALOG_INPUT,3,20));
        welcome.setBounds(150,60,300,40);
        s.setVisible(true);
    }
    public static void main(String args[])
    {
        new SignUp();
    }
}