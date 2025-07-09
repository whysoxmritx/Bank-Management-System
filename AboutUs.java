import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AboutUs {
    public AboutUs(){
        JFrame au=new JFrame("Home Page");
        au.setSize(500,600);
        au.setDefaultCloseOperation(au.EXIT_ON_CLOSE);
        au.setLayout(null);
        au.setLocationRelativeTo(null);
        au.setResizable(false);
        au.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpg");
        au.setIconImage(ig.getImage());

        au.setVisible(true);
    }
    public static void main(String[] args)
    {
        new AboutUs();
    }
}
