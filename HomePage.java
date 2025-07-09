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
        ImageIcon ig=new ImageIcon("logo.jpg");
        h.setIconImage(ig.getImage());
        JLabel welcome=new JLabel("HELLO AKSHAT!");
        h.add(welcome);
        welcome.setForeground(new Color(180,150,225));
        welcome.setFont(new Font(Font.MONOSPACED,1,20));
        welcome.setBounds(160,40,200,40);
        JLabel text=new JLabel("Thank you for choosing FinSutra");
        h.add(text);
        text.setForeground(Color.white);
        text.setFont(new Font(Font.DIALOG_INPUT,1,15));
        text.setBounds(100,70,300,20);
        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
