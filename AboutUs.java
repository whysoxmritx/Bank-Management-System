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
        ImageIcon backIcon=new ImageIcon("back.jpg");
        Image scaled = backIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JButton back=new JButton(new ImageIcon(scaled));
        au.add(back);
        back.setFocusPainted(false);
        back.setBounds(10,10,40,40);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setToolTipText("BACK");
        back.addActionListener(e->{
            au.dispose();
            new HomePage();
        });
        au.setVisible(true);
    }
    public static void main(String[] args)
    {
        new AboutUs();
    }
}
