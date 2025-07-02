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
        s.setVisible(true);
    }
    public static void main(String args[])
    {
        new SignUp();
    }
}