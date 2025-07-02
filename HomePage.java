import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HomePage {
    public HomePage(){
        JFrame h=new JFrame("Home Page");
        h.setSize(500,600);
        h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
        h.setLayout(null);
        h.setLocationRelativeTo(null);
        h.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpeg");
        h.setIconImage(ig.getImage());
        JLabel welcome=new JLabel("HELLO AKSHAT!");
        h.add(welcome);
        welcome.setForeground(new Color(180,150,225));
        welcome.setFont(new Font(Font.SANS_SERIF,2,20));
        welcome.setBounds(50,40,200,40);
        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
